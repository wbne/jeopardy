public class Player 
{
    private int points; private String name;
    public Player(int p, String n)
    {points = p; name = n;}
    public Player(String n)
    {this(0, n);}
    public Player()
    {this(0,"potato boi");}
    public void add(int a)
    {points += a;}
    public void subtract(int a)
    {points -= a;}
    public void rename(String s)
    {name = s;}
}