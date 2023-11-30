// Programer: Sarai Ayon
// Class: CS&141 F2P
// Date:10/1/23 
// Assignment: Lab 2 : Shuffling and dealing programs
// Reference Materials: 1-1 tutoring with montana in summer, https://bicyclecards.com/how-to-play/war, ChatGB, Java Book pg 285. I chose the 2nd activity option 7.17
// Purpose: For lab 3, you'll be writing a card program using arrays. extra credit switch case, using card +deck of cards code from chapter 7 code. 

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class WarMainTest {

   public static void main(String args[]) {
   
   // instructions of how to play game 
      instructions();
   //asks user if they want to play: yes, no and invalid"
      boolean isPlaying = true;
      War game = new War();
      Scanner userInput = new Scanner(System.in);
         
      while(isPlaying){
         System.out.println("Would you like to play?");
         System.out.println("Please enter: (y)yes or (n)no");
         String choice =userInput.next();
         
         switch (choice) {
            case "y":{
               System.out.println("Lets gooo!");
               game.roundSetUp();
               break;
            }//end of y
            case "n":{
               System.out.println("End of Game. Thanks for playing!");
               isPlaying = false;
               break;
            }//end of n
            default:{
               System.out.println("invalid choice, please try again!");
               System.out.println();
            }// end of default
         }// end of switch case
      }// end of while loop

   }// end of MAIN

   public static void instructions() {
   // instructions of the game WAR
      System.out.println("                   Lets play One Card WAR!");
      System.out.println();
      System.out.println("Quick and dirty game where 1 User plays against the House and each player is dealt one card");
      System.out.println("Cards are flipped and the card with the highest value wins!");
      System.out.println("Please note: in this game aces are considered the highest card");
      System.out.println();
      System.out.println("The Deal:The deck is divided evenly, with each player receiving 26 cards,");
      System.out.println("dealt one at a time, face down.");
      System.out.println();
      System.out.println("Are you ready? Lets play!");
      System.out.println();
      System.out.println("This game is brought to you by: https://bicyclecards.com/how-to-play/war/n");
      
      System.out.println();
      return;
   } // end of intructions method


} // end of CLASS


 

