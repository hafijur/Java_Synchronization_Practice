
package synchronization;

public class Synchronization {

    public static void main(String[] args) {
        Display d=new Display();
       MyThread a1=new MyThread(d, "Ripon");
       MyThread a2=new MyThread(d, "Jamil");
       MyThread a3=new MyThread(d, "Lalin");
       a1.start();
       a2.start();
       a3.start();
    }
    
}

