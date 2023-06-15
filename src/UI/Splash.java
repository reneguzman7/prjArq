package UI;

import javax.swing.JFrame;
import javax.swing.JWindow;

public class Splash {

    JWindow jw;
    
    public Splash(){
        
        jw = new JWindow();

        jw.getContentPane().add(new JLabel(new ImageIcon("src\\UI\\img\\splash.png")));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setPersonalization();
        
    }

    private void setPersonalization() {
        super.setSize(50,12);
        //super.setDefaultLookAndFeelDecorated(true);

        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // super.pack();
        

    }

    public void show(int i) {
    }

}
