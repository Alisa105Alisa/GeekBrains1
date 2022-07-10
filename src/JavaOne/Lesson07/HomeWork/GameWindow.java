package JavaOne.Lesson07.HomeWork;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private int winWidth = 1024;
    private int winHeight = 768;
    private int winPosX = 200;
    private int winPosY = 200;
    private JButton btnStartGame;
    private JButton btnExitGame;
    private JPanel gui;
    private JPanel appControlsPanel;
    private GameMap map;

    private JPanel gameInfoPanel;
    private JLabel currentLevel;
    private JLabel currentMapSize;
    private JLabel countEnemies;

    GameWindow() {
        setupGui();
        setUpWindow();
        map = new GameMap();
        add(gui, BorderLayout.EAST);
        add(map);

        setVisible(true);

    }

    private void setUpWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setResizable(false);
        setTitle("Super Game");
    }

    private void setupGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));
        setupAppControls();
        gui.add(appControlsPanel);
        setupGameInfo();

        gui.add(gameInfoPanel);
    }

    private void setupAppControls() {
        appControlsPanel = new JPanel();
        appControlsPanel.setLayout(new GridLayout(3, 1));
        btnStartGame = new JButton("Start the Game");
        btnExitGame = new JButton("Exit the Game");
        appControlsPanel.add(new JLabel("=== Game menu ==="));
        appControlsPanel.add(btnStartGame);
        appControlsPanel.add(btnExitGame);


    }

    private void setupGameInfo() {
        gameInfoPanel = new JPanel();
        gameInfoPanel.setLayout(new GridLayout(4, 1));
        currentLevel = new JLabel("Current Level: - ");
        currentMapSize = new JLabel("Current Map Size: - ");
        countEnemies = new JLabel("Enemy count: - ");

        gameInfoPanel.add(new JLabel("=== Game Info ==="));
        gameInfoPanel.add(currentLevel);
        gameInfoPanel.add(currentMapSize);
        gameInfoPanel.add(countEnemies);
    }
}
