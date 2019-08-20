package com.qa;

import java.util.Scanner;
import java.io.*;



public class Blackjack {

    public static void main(String[] args) {

        boolean blackjack_game = true;
        boolean hitting = true;

        int player_1_Cards [] = new int [5];
        int player1_Total = 0;
        int counter_Player1 = 0;

        int player_2_Cards [] = new int [5];
        int player2_Total = 0;
        int counter_Player2 = 0;

        while(blackjack_game)
        {

            for(int i = 0; i < 2; i++)
            {
                player_1_Cards[i] += newCard();
                player1_Total += player_1_Cards[i];
                counter_Player1++;

                player_2_Cards[i] += newCard();
                player2_Total += player_2_Cards[i];
                counter_Player2++;
            }

            String input  = "";

            do
            {
                System.out.println("Player1 Total : " + player1_Total);
                System.out.println("Hit or Stick?");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                try {
                    input = reader.readLine();

                } catch (IOException e) {

                    e.printStackTrace();
                }


                if(input.equals("Hit"))
                {
                    player_1_Cards[counter_Player1] += newCard();
                    player1_Total += player_1_Cards[counter_Player1++];
                }
                else if(input.equals("Stick"))
                {
                    hitting = false;
                }

                System.out.println("Player1 Final Total is : " + player1_Total);

            }
            while(hitting);
        }
    }
    public static int newCard()
    {
        return (int)(Math.random() * 11) + 1;
    }


}
