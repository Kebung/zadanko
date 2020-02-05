import javax.swing.*;
import java.awt.*;

public class Gif extends JFrame
{
    public Gif()
    {
        this.setTitle("Rysowanie");
        this.setBounds(250, 200, 570, 600);
        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Gif().setVisible(true);
    }

    private PanelRysowiak panelDoRysowania = new PanelRysowiak();
}
class PanelRysowiak extends JPanel
{
        public PanelRysowiak()
        {
            super();
            this.add(new JButton("Wlacznik")
            {
                @Override
                public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                }
            });
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawString("MonkaS", 0, 0);
            g.drawImage(new ImageIcon("src/monkas.jpg").getImage(), 0, 30, null);
            g.drawRect(0, 600, 570, 499);
            g.drawLine(100, 100, 100, 100);
            setBackground(Color.black);
            Graphics2D g2 = (Graphics2D)g;
            System.out.println(i++);
        }
        public static int i = 0;
}



