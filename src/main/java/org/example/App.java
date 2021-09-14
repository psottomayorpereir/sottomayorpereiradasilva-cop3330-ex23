/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String answer="";
        System.out.print("Is the car silent when you turn the key? ");
        answer=sc.nextLine();

        if(answer.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            answer=sc.nextLine();
            if(answer.equals("y")){
                System.out.print("Clean terminals and try starting again.\n ");
            }
            else{
                System.out.print("Replace cables and try again.\n");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            answer=sc.nextLine();
            if(answer.equals("y")){
                System.out.print("Replace the battery.\n");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                answer=sc.nextLine();
                if(answer.equals("y")){
                    System.out.print("Check spark plug connections.\n");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    answer=sc.nextLine();
                    if(answer.equals("y")){
                        System.out.print("Does you car have fuel injection? ");
                        answer=sc.nextLine();
                        if(answer.equals("y")){
                            System.out.print("Get it in for service.\n");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.\n");
                        }
                    }
                    else{
                        System.out.print("This should not be possible.\n");
                    }
                }
            }

        }
    }
}