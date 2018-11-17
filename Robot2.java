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
public class Robot2 extends Thread {
    
    RobotWarGame robotwargame;
    
    int x = 3;
    int y = 3;
    char d = 'E';
    String input = "MMRMMRMRRM";
    
    public void run(){
        
        System.out.print("Il robot parte da (" + x + ", " + y + ") verso " + d + "\n");

        for (int i = 0; i < input.length(); i++){

            char command = input.charAt(i);
                if (command == 'R'){
                    calculateDirection('R');
                }
                else if (command == 'L'){
                    calculateDirection('L');
                }
                else if (command == 'M'){
                    if ( d == 'N'){
                        y = y + 1;
                    }
                    else if ( d == 'S'){
                        y = y - 1;
                    }
                    else if ( d == 'E'){
                        x = x + 1;
                    }
                    else if ( d == 'O'){
                        x = x - 1;
                    }

                }           

            }
        System.out.print(x + " " + y + " " + d+ "\n");  

    }
    public void calculateDirection(final char direction){
        if (direction=='R') {
            if ( d == 'N'){
                    d = 'E';
                }
                else if ( d == 'S'){
                    d = 'O';
                }
                else if ( d == 'E'){
                    d = 'S';
                }
                else if ( d == 'O'){
                    d = 'N';
                }
        }
        else {
                if ( d == 'N'){
                    d = 'O';
                }
                else if ( d == 'S'){
                    d = 'E';
                }
                else if ( d == 'E'){
                    d = 'N';
                }
                else if ( d == 'O'){
                    d = 'S';
                }
                    
        } 
    }
}
