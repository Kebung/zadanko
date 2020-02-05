import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class But extends JFrame implements ActionListener
{
    public But()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(100, 100);
        setLocation(100, 100);

        JButton button1 = new JButton("button1");
        button1.addActionListener(this);
        add(button1);

        setVisible(true);
    }
    public static void main(String[] args)
    {
        new But();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if (command.equals("button1"))
        {
            myMethod();
        }
    }
    public void myMethod()
    {
        JOptionPane.showMessageDialog(this, "Udało się!!!!!!" );
    }
}
