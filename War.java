// Programer: Sarai Ayon
// Class: CS&141 F2P
// Date:10/1/23 
// Assignment: Lab 2 : Shuffling and dealing programs
// Reference Materials: 1-1 tutoring with montana in summer, https://bicyclecards.com/how-to-play/war, ChatGB, Java Book pg 285. I chose the 2nd activity option 7.17
// Purpose: For lab 3, you'll be writing a card program using arrays. extra credit switch case, using card +deck of cards code from chapter 7 code. 

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class War {

   private DeckOfCards deck;
   Queue<Card> user = new LinkedList<>();
   Queue<Card> house = new LinkedList<>();
   
   
   public void roundSetUp() {
      deck = new DeckOfCards();
   // each round provides new deck
      deck.shuffle();
   //shuffles
      for (int i= 0; i <= 26; i++) {
         user.add(deck.dealCard());
         house.add(deck.dealCard());
      }//end for loop  
      round(); 
   }//end roundSetUp


   public void round() {
   //has users draw card and compare
     
      for (int i= 0; i <= 26; i++) {
         Card card1 = user.remove();
         System.out.println("User Card is:  " + card1.toString());
         Card card2 = house.remove();
         System.out.println("House Card is:  " + card2.toString());
         compare(card1,card2); 
         break;
   }// end of for loop
}// end of round
   
   
   public void compare(Card card1, Card card2) {
      if(card1.getValue()>card2.getValue()) {
         user.add(card1);
         user.add(card2);
      //add to card add to user1 stack 
         System.out.println("User Wins! ");
         System.out.println(); 
      }// end of if
      
      else if (card1.getValue()<card2.getValue()) {
      //add to card add to house stack 
         house.add(card1);
         house.add(card2);
         System.out.println("House Wins!");
         System.out.println(); 
      }//end of else if
      
      else {
      // return back to user and house
         user.add(card1);
         house.add(card2);
         System.out.println("Push, try again!");
      }// end of else
     
   }// end of compare method
  





} // end of CLASS


 

