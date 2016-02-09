/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization;

/**
 *
 * @author Keya
 */
public class MyThread extends Thread{

    Display d;
    String name;
    public MyThread(Display d,String name) {
        this.d=d;
        this.name=name;
    }

    
    @Override
    public void run() {
       d.wish(name);
    }
    
}
