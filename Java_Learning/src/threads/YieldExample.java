package threads;
 
public class YieldExample
{
   public static void main(String[] args)
   {
      Thread Producer1 = new Producer1();
      Thread Consumer1 = new Consumer1();
       
      Producer1.setPriority(Thread.MIN_PRIORITY); //Min Priority
      Consumer1.setPriority(Thread.MAX_PRIORITY); //Max Priority
       
      Producer1.start();
      Consumer1.start();
   }
}
 
class Producer1 extends Thread
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Producer1 : Produced Item " + i);
         Thread.yield();
      }
   }
}
 
class Consumer1 extends Thread
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Consumer1 : Consumed Item " + i);
         Thread.yield();
      }
   }
}