/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotwargame;
/**
 *
 * @author Awais
 */
public class RobotWarGame {
    
  
    
    public static void main (String[] args)
    {
        RobotWarGame robot1 = new RobotWarGame();
        
        //ResourceLock lock = new ResourceLock();
        
        Robot1 a = new Robot1();
        Robot2 b = new Robot2();
        try{
        
            a.start();
            a.join();
            b.start();
            b.join();
        
        }catch (InterruptedException e){}
        
    }
}    