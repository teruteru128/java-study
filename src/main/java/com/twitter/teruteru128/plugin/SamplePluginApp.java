package com.twitter.teruteru128.plugin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
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
public class SamplePluginApp extends JFrame {
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
        pluginsCombo.addActionListener(new pluginComboAction());
        panel.add(pluginsCombo, BorderLayout.NORTH);
        panel.add(selectedPlugin.getPanel(), BorderLayout.CENTER);
        this.add(panel, BorderLayout.CENTER);
        JButton button = new JButton("calc");
        button.addActionListener(new buttonAction());
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
    }// JComboBoxのActionListener

    class pluginComboAction implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // パネルからすべてのコンポーネントを取り除く
            panel.removeAll();
            // コンボボックスを追加
            panel.add(pluginsCombo, BorderLayout.NORTH);
            /*
             * 選択されているプラグインを保管するselectedPluginと、
             * そのGUI用パネルを保管するselectedPluginPanelにそれぞれインスタンスを設定する。
             */
            selectedPlugin = (SamplePluginAppPlugin) pluginsCombo
                    .getSelectedItem();
            selectedPluginPanel = selectedPlugin.getPanel();
            panel.add(selectedPluginPanel);
            panel.updateUI();
        }
    }// JButtonのActionListener

    class buttonAction implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            result.setText(selectedPlugin.getResult());
        }
    }

    // プラグインクラスのインスタンスをArrayListにまとめて返す
    public ArrayList<SamplePluginAppPlugin> getPlugins() {
        ArrayList<SamplePluginAppPlugin> plugins = new ArrayList<SamplePluginAppPlugin>();
        /* プラグインフォルダのパスを取得 */
        String cpath = System.getProperty("user.dir") + File.separator
                + "plugins";
        try {
            File f = new File(cpath);
            // プラグインフォルダの全ファイル取得
            String[] files = f.list((dir, name) -> name.endsWith(".jar"));
            for (int i = 0; i < files.length; i++) {
                // jarファイルを抽出
                if (files[i].endsWith(".jar")) {
                    //
                    File file = new File(cpath + File.separator + files[i]);
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
                    URLClassLoader loader = new URLClassLoader(
                            new URL[] { url });
                    // クラス読み込み
                    Class<?> cobj = loader.loadClass(cname);
                    loader.close();
                    // クラスローダーを閉じる
                    Class<?>[] ifnames = cobj.getInterfaces();
                    for (int j = 0; j < ifnames.length; j++) {
                        /* implementsされたクラスの中にSamplePluginAppPluginが含まれていないかチェック */
                        if (ifnames[j] == SamplePluginAppPlugin.class) {
                            System.out.println("load..... " + cname);
                            // 含まれている場合はインスタンスを生成してArrayListに追加
                            SamplePluginAppPlugin plugin = (SamplePluginAppPlugin) cobj
                                    .newInstance();
                            plugins.add(plugin);
                            break;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return plugins;
    }
}