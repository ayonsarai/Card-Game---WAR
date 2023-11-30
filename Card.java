// Programer: Sarai Ayon
// Class: CS&141 F2P
// Date:10/1/23 
// Assignment: Lab 2 : Shuffling and dealing programs
// Reference Materials: 1-1 tutoring with montana in summer, https://bicyclecards.com/how-to-play/war, ChatGB, Java Book pg 285. I chose the 2nd activity option 7.17
// Purpose: For lab 3, you'll be writing a card program using arrays. extra credit switch case, using card +deck of cards code from chapter 7 code. 
// I used a combination of Fig. 7.11: Card.java and added a getValue method
// Card class represents a playing card.

public class Card {
    private final String face;
    private final String suit;


    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }// end of Card method

    public String toString() {
        return face + " of " + suit;
    }//end of toString method

    public int getValue() {
        switch (face) {
            case "Ace":
                return 14;
            case "King":
                return 13;
            case "Queen":
                return 12;
            case "Jack":
                return 11;
            case "Ten":
                return 10;
            case "Nine":
                return 9;
            case "Eight":
                return 8;
            case "Seven":
                return 7;
            case "Six":
                return 6;
            case "Five":
                return 5;
            case "Four":
                return 4;
            case "Three":
                return 3;
            case "Two":
                return 2;
            default:
                return 0;
        }// end of switch
    }//end of method
}// end of class


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
