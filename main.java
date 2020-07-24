# hello-world
public class Shit()
{
    public static void main(String args[])
    {
       new Shit().shit(1000);
    }
    
    private void shit()
    {
       int shit = 1000;
       while (shit > 0)
       {
          Thread.sleep(2000);//useless hanging
          for (int i=1; i < shit; i++)
          {
              for (int j=i; j > 0; j--)
              {
                   System.out.print("_|_ \./ ");
              }
              System.out.println();
          }
          shit--;
       }
    }
}
