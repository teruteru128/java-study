package com.twitter.teruteru128.plugin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author
 *
 */
public class SamplePlugableApp extends JFrame implements ActionListener {
    private static final long serialVersionUID = 0L;
    private JTextField result;
    private JComboBox<? super AppPlugin> pluginsCombo;
    private JPanel panel;

    private List<AppPlugin> plugins;
    private AppPlugin selectedPlugin;
    private JPanel selectedPluginPanel;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new SamplePlugableApp().setVisible(true);
    }

    public SamplePlugableApp() {
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
    public JComboBox<? super AppPlugin> getPluginComboBox() {
        JComboBox<? super AppPlugin> combo = new JComboBox<>();
        plugins = getPlugins();
        // デフォルトプラグインの準備
        for (AppPlugin samplePluginAppPlugin : ServiceLoader.load(AppPlugin.class)) {
            selectedPluginPanel = samplePluginAppPlugin.getPanel();
            combo.addItem(samplePluginAppPlugin);
        }

        for (int i = 0; i < plugins.size(); i++) {
            AppPlugin plugin = plugins.get(i);
            combo.addItem(plugin);
        }
        return combo;
    }

    /**
     * プラグインクラスのインスタンスをArrayListにまとめて返す
     */
    public List<AppPlugin> getPlugins() {
        ArrayList<AppPlugin> plugins = new ArrayList<AppPlugin>();
        /* プラグインフォルダのパスを取得 */
        Path path = Paths.get(System.getProperty("user.dir"), "plugins");
        try (var loader2 = new URLClassLoader(new URL[] { path.toUri().toURL() },
                getClass().getClassLoader().getParent())) {
            var serviceLoader = ServiceLoader.load(AppPlugin.class, loader2);
            for (AppPlugin appPlugin : serviceLoader) {
                plugins.add(appPlugin);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plugins;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            // JButton button = (JButton) source;
            result.setText(selectedPlugin.getResult());
        } else if (source instanceof JComboBox) {
            // パネルからすべてのコンポーネントを取り除く
            panel.removeAll();
            // コンボボックスを追加
            panel.add(pluginsCombo, BorderLayout.NORTH);
            /*
             * 選択されているプラグインを保管するselectedPluginと、
             * そのGUI用パネルを保管するselectedPluginPanelにそれぞれインスタンスを設定する。
             */
            selectedPlugin = (AppPlugin) pluginsCombo.getSelectedItem();
            selectedPluginPanel = selectedPlugin.getPanel();
            panel.add(selectedPluginPanel);
            panel.updateUI();
        }
    }
}
