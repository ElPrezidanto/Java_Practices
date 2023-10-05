package pr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Play extends JFrame {
    JButton milan = new JButton("Milan");
    JButton real_madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last_scorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    int real_madrid_scores = 0;
    int milan_scores = 0;
    JPanel[] pnl = new JPanel[9];
    Play(){
        super("Soccer");
        setLayout(new FlowLayout());
        for(int i = 0; i < pnl.length; i++){
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[6].add(milan);
        pnl[8].add(real_madrid);
        pnl[1].add(result);
        pnl[2].add(last_scorer);
        pnl[3].add(winner);

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan_scores = milan_scores + 1;
                result.setText("Result: " + milan_scores + " X " + real_madrid_scores);
                last_scorer.setText("Last Scorer: Milan");
                if(milan_scores > real_madrid_scores){
                    winner.setText("Winner: Milan");
                }
                else if (real_madrid_scores > milan_scores){
                    winner.setText("Winner: Real Madrid");
                }
                else{
                    winner.setText("Winner: DRAW");
                }
            }
        });
        real_madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real_madrid_scores = real_madrid_scores + 1;
                result.setText("Result: " + milan_scores + " X " + real_madrid_scores);
                last_scorer.setText("Last Scorer: Real Madrid");
                if(milan_scores > real_madrid_scores){
                    winner.setText("Winner: Milan");
                }
                else if (real_madrid_scores > milan_scores){
                    winner.setText("Winner: Real Madrid");
                }
                else{
                    winner.setText("Winner: DRAW");
                }
            }
        });
        setSize(400,300);
    }

    public static void main(String[] args) {
        Play game = new Play();
        game.setVisible(true);
        game.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}