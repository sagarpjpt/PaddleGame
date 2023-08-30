//package Games.Paddle Game;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame{
    GamePanels panel; 
    GameFrame(){
        panel = new GamePanels();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();    //to fit jpanel in jframe
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
