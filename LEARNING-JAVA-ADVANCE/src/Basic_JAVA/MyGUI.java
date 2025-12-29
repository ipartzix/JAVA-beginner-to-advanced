import javax.swing.*;
public class MyGUI {
    public static void main(String[] args){
         JFrame f= new JFrame();
         JPanel p= new JPanel();
         p.add(new JLabel("hello"));
         p.add(new JButton("click"));
         f.add(p);
         f.setSize(400,150);
         f.setVisible(true);
    }
}
