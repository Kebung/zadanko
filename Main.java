import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        super("Układ graficzny (Layout)");
        this.setBounds(300, 320, 300, 200);
        initComponents();
        this.setDefaultCloseOperation(3);
    }
    public void initComponents(){
        centrum = new JButton("Anuluj");
        gora = new JButton("jestem na górze");
        dol = new JButton("jestem na dole");
        prawa = new JButton("jestem po prawej stronie");
        lewa = new JButton("jestem po lewej stronie");

        Container kontener = this.getContentPane();

        centrum.setLocation(0, 0);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);

        gora.setLocation(50, 50);
        gora.setSize(gora.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(gora);

        dol.setLocation(100, 100);
        dol.setSize(dol.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(dol);

        prawa.setLocation(50, 200);
        prawa.setSize(prawa.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(prawa);

        lewa.setLocation(250, 200);
        lewa.setSize(lewa.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(lewa);

    }
    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;

    public static void main(String[] args){
        new Main().setVisible(true);
    }
}
