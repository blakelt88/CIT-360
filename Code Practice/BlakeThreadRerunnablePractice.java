
/*
 * Blake Turley
 * 4/4/2017
 */

class BlakesRunnableDemo implements Runnable {
   private Thread t;
   private String BlakesthreadName;
   
   BlakesRunnableDemo( String name) {
      BlakesthreadName = name;
      System.out.println("Gathering ingredients for " +  BlakesthreadName + "." );
   }
   
   public void run() {
      System.out.println("Combining " +  BlakesthreadName + " ingredients.");
      try {
         for(int i = 1; i > 0; i--) {
            System.out.println("Baking " + BlakesthreadName + "." );
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Making" +  BlakesthreadName + " interrupted by the kids.");
      }
      System.out.println("Time to eat some " +  BlakesthreadName + ".");
   }
   
   public void start () {
      System.out.println("Prepping " +  BlakesthreadName + " ingredients." );
      if (t == null) {
         t = new Thread (this, BlakesthreadName);
         t.start ();
      }
   }
}

public class TestThread {

   public static void main(String args[]) {
      BlakesRunnableDemo R1 = new BlakesRunnableDemo( "Enchilada");
      R1.start();
      
      BlakesRunnableDemo R2 = new BlakesRunnableDemo( "Pizza");
      R2.start();
   }   
}