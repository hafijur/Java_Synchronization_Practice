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
public class Display {
    public synchronized void wish(String name){
        for (int i = 0; i < 10; i++) {
        
        System.out.print("Happy Birthtday : ");
        try{
        Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.print(e);
        }
        System.out.println(name);
        }
    }
}
