/* ROCK-PAPER-SCISSOR IN JAVA */

import java.io.PrintStream;
import java.lang.Math;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        int i=0, you=0, comp=0;
        int min=1;
        int max=3;
        while (i<5) {

            Scanner scnr = new Scanner(System.in);

            System.out.println("enter your choice :");
            int x = scnr.nextInt();
            switch (x) {
                case 1:
                System.out.println("you choosed ROCK");
                    break;

                case 2:
                System.out.println("you choosed PAPER");
                    break;

                case 3:
                System.out.println("you choosed SCISSOR");
                    break;

                default:
                System.out.println("Some error");
                    break;
            }


            int num = (int)(Math.random() * (max-min+1)+min); //
            
            System.out.println(num);

            switch (num) {
                case 1:
                System.out.println("computer choosed ROCK");
                    break;

                case 2:
                System.out.println("computer choosed PAPER");
                    break;

                case 3:
                System.out.println("computer choosed SCISSOR");
                    break;

                default:
                System.out.println("Some error");
                    break;
            }
            //sysout to get the print stream code //
            int a=x;
            int b=num;
            if(a==b){
                System.out.println("Match Drawn!");
            }
            else{
                if(a==1 && b==2){
                    System.out.println("you lose");
                    comp++;
                }
                else if(a==1 && b==3){
                    System.out.println("you won");
                    you++;
                }
                else if(a==2 && b==1){
                    System.out.println("you won");
                    you++;
                }
                else if(a==2 && b==3){
                    System.out.println("you lose");
                    comp++;
                }
                else if(a==3 && b==1){
                    System.out.println("you lose");
                    comp++;
                }
                else if(a==3 && b==2){
                    System.out.println("you won");
                    you++;
                }
                else{
                    System.out.println("Invalid");
                }
            }
            i=i+1;
        }
        
        if(you>comp){
            System.out.println("You won the series");
        }
        else if(comp>you){
            System.out.println("Computer won the series");
        }
        else{
            System.out.println("Series Drawn");
        }
    }
}
