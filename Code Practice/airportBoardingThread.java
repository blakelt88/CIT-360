
/*
 * Blake Turley
 * 4/4/2017
 */

package Threads;

class airport extends Thread {
    private Thread thread;
    private String boardingCall;

    // Program will start after this comment.

    airport( String attendantSpeak) {
        boardingCall = attendantSpeak;
        System.out.println("Now serving " +  boardingCall + ".");
    }

    public void run() {
        System.out.println(boardingCall + " passengers finish taking their seats." );
        try {
            // Using the loops we can create as many threads as we want.
            for(int i = 3; i > 0; i--) {
                System.out.println("Someone from " + boardingCall + " uses the restroom.");
                // Let the thread sleep for a while.
                Thread.sleep(100);
            }
        }catch (InterruptedException baby) {
            System.out.println("a baby screams and cries.");
        }
        System.out.println(boardingCall + " gets their snacks and beverages.");
    }

    public void start () {
        System.out.println(boardingCall + " attention gained." );
        if (thread == null) {
            thread = new Thread (this, boardingCall);
            thread.start ();
        }
    }
}

public class boardingClass {

    public static void main(String args[]) {
        airport T1 = new airport("First Class");
        T1.start();

        airport T2 = new airport("Business Select");
        T2.start();

        airport T3 = new airport( "Premium and Families");
        T3.start();

        airport T4 = new airport( "Economy");
        T4.start();
    }
}