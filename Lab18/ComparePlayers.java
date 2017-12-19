//Max Chen
//111316366
package lab18;

//**********************************************************
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**********************************************************

import java.util.*;

public class ComparePlayers
{
 public static void main(String[] args)
 {
   Player player1 = new Player();
   Player player2 = new Player();
   player1.setName("Bill");
   player2.setName("Bill");
   player1.setNumber(18);
   player2.setNumber(18);

   if(player1.equals(player2))
	   System.out.println("Same player");
   else
	   System.out.println("Different players");
   player1.setName("Bill");
   player2.setName("Bob");
   player1.setNumber(18);
   player2.setNumber(87);

   if(player1.equals(player2))
	   System.out.println("Same player");
   else
	   System.out.println("Different players");

   //Prompt for and read in information for player 1

   //Prompt for and read in information for player 2

   //Compare player1 to player 2 and print a message saying
   //whether they are equal

 }
}