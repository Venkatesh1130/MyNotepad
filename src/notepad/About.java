package notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    JButton b1;

    About() {
        setBounds(600,200,600,500);
        setLayout(null);
        ImageIcon i1=new ImageIcon("src/notepad/icons/windows.png");
        Image i2=i1.getImage().getScaledInstance(400,80,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(150,40,400,80);
        add(l1);

        ImageIcon i4=new ImageIcon("src/notepad/icons/logonotepad.png");
        Image i5=i4.getImage().getScaledInstance(400,80,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(50,180,70,70);
        add(l2);

        JLabel l3=new JLabel("<html>This is Simple version of Notepad<br>Version 2021. All Rights are reserved to Venkatesh_R<br>Notepad is word processing program<br> which allows changing text and computer file<br> It is simple text editor<br>which enables computer user to create documents</html>");
        l3.setBounds(150,130,400,200);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        add(l3);

        b1=new JButton("Ok");
        b1.setBounds(450,400,80,25);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);

    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }


}
