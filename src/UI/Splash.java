package UI;

import javax.swing.JFrame;

public class Splash extends JFrame {
    
    public Splash(String title){
        super(title);

        setPersonalization();
        
    }

    private void setPersonalization() {
        super.setSize(50,12);
        //super.setDefaultLookAndFeelDecorated(true);

        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // super.pack();
        

    }

}
