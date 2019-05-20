public class Interpreter
{
    private GUI gui; private Game gg;
    public Interpreter(GUI gui)
    {this.gui = gui; this.gg = gui.getGame();}
    
    public void interpret(String s)
    {
        String[] commands = s.split("\\.");
        if(commands[0].equals("g")) g(commands);
        else if(commands[0].equals("p")) p(commands);
        else if(commands[0].equals("c"))c(commands);
        else gui.update("ohno");
    }
    
    private void g(String[] s)
    {
    
    }
    
    private void p(String[] s)
    {
        
    }
    
    private void c(String[] s)
    {
        if(s[1].equals("print"))gui.update(s[2].split(" "));
        else gui.update("ohno");
    }
}