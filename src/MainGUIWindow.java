import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JButton button2;
    private JTextArea myTextArea;
    private JTextField textField1;
    private JButton button1;
    private JLabel label1;

    public MainGUIWindow(){
        createUIComponents();
    }

    private void createUIComponents(){
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();

            if(text.equals("Send")){
                myTextArea.append("button 1 clicked!");
            }else{
                myTextArea.append("button 2 clicked!");
            }

        }
    }




    @Override
    public void keyReleased(KeyEvent e){

    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

}
