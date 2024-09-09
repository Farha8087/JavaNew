public class LoopCountDown 
{
 public static void main(String[] args) 
  {
    int countdown = 10;

    while (countdown > 10)
    {
      System.out.println(countdown);

      countdown --;
       try
       {
        Thread.sleep(1000);
       }
       catch (InterruptedException e)
       {
        e.printStackTrace();
       }
    }
    System.out.println("Happy Birthday");
  
  }

}

