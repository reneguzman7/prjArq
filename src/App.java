import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import BL.Entities.Pez;
import UI.PathFrame;
import UI.Splash;

public class App {
    public static void main(String[] args) {

        Pez nemo = new Pez();
        nemo.nadar();

        // var jf = new PathFrame();
        
        //jf.show();

        // var splash = new Splash();

        // splash.show(5000);

    }

    // public static void mostrar(){

    //     setDefaultLookAndFeelDecorated(true);
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //     // Define new buttons
    //     JButton jb1 = new JButton("Button 1");
    //     JButton jb2 = new JButton("Button 2");
    //     JButton jb3 = new JButton("Button 3");

    //     JPanel panel = new JPanel();
    //     panel.setLayout(new FlowLayout());
    //     panel.add(jb1);
    //     panel.add(jb2);
    //     panel.add(jb3);

    //     add(panel);
    //     pack();
    //     setVisible(true);
    // }
    
}
