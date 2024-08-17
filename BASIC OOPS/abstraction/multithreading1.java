import java.lang.*;

class Thread1 implements Runnable {

    public void run() {
        try {
            int n = 5;
            for (int i = 0; i < n; i++) {
                Thread.sleep(100);
                System.out.println(2*i + "");
            }
        } catch (Exception e) {
        }
    }

}

public class multithreading1 {
    public static void main(String[] args) {
      
    // Thread t4=  new Thread(new Runnable() {
    //     public void run() {
    //                 try {
    //                     int n = 5;
    //                     for (int i = 0; i < n; i++) {
                            
    //                         System.out.println(i + "");
    //                         Thread.sleep(100);
    //                     }
    //                 } catch (Exception e) {
    //                 }
    //             }
    //   });
    //   t4.start();
    Thread t1=  new Thread(){
        public void run() {
                    try {
                        int n = 5;
                        for (int i = 0; i < n; i++) {
                            
                            System.out.println(i + "44");
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                    }
                }
      };
      t1.start();
    //     Thread t2 = new Thread(new Thread1(), "krg");
    //     Thread t3 = new Thread(new Thread1(), "uwg");

        
    //     t2.start();
    //     t3.start();

    }
}
