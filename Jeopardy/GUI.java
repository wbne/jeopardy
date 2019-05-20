import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GUI implements ActionListener
{
    private JFrame f; 
    private JLabel l; 
    private JButton b; 
    private JTextField t; 
    private Interpreter in; 
    private Game gg;
    public GUI(Game gg)
    {
        f = new JFrame("Jeopardy");
            f.setLayout(null);
            f.setSize(500,500);
        l = new JLabel("Console Output here.");
            l.setBounds(10,0,400,400);
        t = new JTextField();
            t.setBounds(10,400,300,20);
        b = new JButton("Enter");
            b.setBounds(310,400,100,20);
            b.addActionListener(this);
        
        f.add(l);
        f.add(t);
        f.add(b);
        f.show();
        in = new Interpreter(this);
        this.gg = gg;
    }
    
    public GUI(){this(new Game());}
    
    public void update(String s)
    {
        l.setText("<html>" + s + "</html>");
    }
    
    public void update(String[] s)
    {
        String ss = "";
        for(String sss : s)        
            ss += (sss + "<br>");
        update(ss);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        in.interpret(t.getText());
    }
    
    public Game getGame(){return gg;}
}