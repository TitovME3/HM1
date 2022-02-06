package lesson7.HM7;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    private int width = 1024;
    private int height = 768;
    private int posX = 300;
    private int posY = 150;

    private JButton btnStart;
    private JButton btnExit;
    private JButton btnSettings;

    private JPanel mainToolsPanel;
    private JPanel settingPanel;

    private Map map;

    Game() {
        prepareWindow();
        prepareToolsPanel();
        prepareButtons();
        prepareSettingsPanel();


        map = new Map();

        mainToolsPanel.add(settingPanel,BorderLayout.NORTH);

        add(mainToolsPanel, BorderLayout.EAST);
        add(map);

        setVisible(true);

    }

    private void prepareWindow() {
        setSize(width, height);
        setLocation(posX, posY);
        setTitle("Application");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void prepareToolsPanel() {
        mainToolsPanel = new JPanel();
        mainToolsPanel.setBackground(Color.ORANGE);
        mainToolsPanel.setLayout(new GridLayout(3,1));
    }

    private void prepareButtons() {
        btnStart = new JButton("Start game");
        btnExit = new JButton("End game");
        btnSettings = new JButton("Settings");
    }

    private void prepareSettingsPanel() {
        settingPanel = new JPanel();
        mainToolsPanel.setBackground(Color.BLUE);
        settingPanel.setLayout(new GridLayout(4,1));

        settingPanel.add(btnStart);
        settingPanel.add(btnExit);
        settingPanel.add(btnSettings);
    }


}

