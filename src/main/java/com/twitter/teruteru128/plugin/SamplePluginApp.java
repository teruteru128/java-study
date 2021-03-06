package com.twitter.teruteru128.plugin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author
 *
 */
public class SamplePluginApp extends JFrame implements ActionListener {
    private static final long serialVersionUID = 0L;
    private JTextField result;
    private JComboBox<? super SamplePluginAppPlugin> pluginsCombo;
    private JPanel panel;

    private ArrayList<SamplePluginAppPlugin> plugins;
    private SamplePluginAppPlugin selectedPlugin;
    private JPanel selectedPluginPanel;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new SamplePluginApp().setVisible(true);
    }

    public SamplePluginApp() {
        result = new JTextField();
        this.add(result, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        pluginsCombo = this.getPluginComboBox();
        pluginsCombo.setBounds(new Rectangle(25, 25, 100, 20));
        pluginsCombo.addActionListener(this);
        panel.add(pluginsCombo, BorderLayout.NORTH);
        panel.add(selectedPlugin.getPanel(), BorderLayout.CENTER);
        this.add(panel, BorderLayout.CENTER);
        JButton button = new JButton("calc");
        button.addActionListener(this);
        this.add(button, BorderLayout.SOUTH);
        this.setSize(new Dimension(200, 200));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // JComboBoxの作成
    public JComboBox<? super SamplePluginAppPlugin> getPluginComboBox() {
        JComboBox<? super SamplePluginAppPlugin> combo = new JComboBox<>();
        plugins = getPlugins();
        // デフォルトプラグインの準備
        selectedPlugin = new DefaultPlugin();
        selectedPluginPanel = selectedPlugin.getPanel();
        combo.addItem(selectedPlugin);

        for (int i = 0; i < plugins.size(); i++) {
            SamplePluginAppPlugin plugin = plugins.get(i);
            combo.addItem(plugin);
        }
        return combo;
    }

    /** プラグインクラスのインスタンスをArrayListにまとめて返す */
    public ArrayList<SamplePluginAppPlugin> getPlugins() {
        ArrayList<SamplePluginAppPlugin> plugins = new ArrayList<SamplePluginAppPlugin>();
        /* プラグインフォルダのパスを取得 */
        Path path = Paths.get(System.getProperty("user.dir"), "plugins");
        try {
            File f = path.toFile();
            // プラグインフォルダの全ファイル取得
            String[] files = f.list((dir, name) -> name.endsWith(".jar"));
            if (files == null) {
            } else {
                for (int i = 0; i < files.length; i++) {
                    // jarファイルを抽出
                    if (files[i].endsWith(".jar")) {
                        //
                        File file = new File(f, files[i]);
                        //
                        JarFile jar = new JarFile(file);
                        // マニフェスト取得
                        Manifest mf = jar.getManifest();
                        // Jarファイルクローズ（リソースを閉じる）
                        jar.close();
                        // アトリビュート（属性）取得
                        Attributes att = mf.getMainAttributes();
                        // プラグインクラスを取得
                        String cname = att.getValue("Plugin-Class");
                        // ファイルからURLを生成
                        URL url = file.getCanonicalFile().toURI().toURL();
                        // クラスローダー作成
                        URLClassLoader loader = new URLClassLoader(new URL[] { url });
                        // クラス読み込み
                        Class<?> cobj = loader.loadClass(cname);
                        loader.close();
                        // クラスローダーを閉じる
                        Class<?>[] ifnames = cobj.getInterfaces();
                        for (int j = 0; j < ifnames.length; j++) {
                            /* implementsされたクラスの中にSamplePluginAppPluginが含まれていないかチェック */
                            if (ifnames[j].equals(SamplePluginAppPlugin.class)) {
                                System.out.println("load..... " + cname);
                                // 含まれている場合はインスタンスを生成してArrayListに追加
                                Constructor<?> con = cobj.getConstructor();
                                SamplePluginAppPlugin plugin = (SamplePluginAppPlugin) con.newInstance();
                                plugins.add(plugin);
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return plugins;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source instanceof JButton){
            //JButton button = (JButton) source;
            result.setText(selectedPlugin.getResult());
        } else if(source instanceof JComboBox){
            // パネルからすべてのコンポーネントを取り除く
            panel.removeAll();
            // コンボボックスを追加
            panel.add(pluginsCombo, BorderLayout.NORTH);
            /*
             * 選択されているプラグインを保管するselectedPluginと、
             * そのGUI用パネルを保管するselectedPluginPanelにそれぞれインスタンスを設定する。
             */
            selectedPlugin = (SamplePluginAppPlugin) pluginsCombo.getSelectedItem();
            selectedPluginPanel = selectedPlugin.getPanel();
            panel.add(selectedPluginPanel);
            panel.updateUI();
        }
    }
}
