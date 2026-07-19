package com.Google;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    static String[] board;
    static String turn;

    static String checkWinner() { // return O/X/draw
        for(int a=0;a<8;a++){
            String line = null;
            switch(a){ // 0-7 (8)
                case 0:
                    line = board[0] + board[1] + board[2];
                    break; // break the switch case
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if(line.equals("XXX")){
                return "X";
            }

            else if(line.equals("OOO")){
                return "O";
            }
        }
        for(int a=0; a<9; a++){
            if(Arrays.asList(board).contains(String.valueOf(a+1))){ // check if there is any slot left
                break;
            }
            else if(a==8){ // after checking all the slot are filled and there is no other slots to fill mean print "draw"
                return "draw";
            }
        }
        System.out.print(turn + "'s turn; enter a slot number to place " + turn + " in: ");
        return null;
    }

    static void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| "+ board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| "+ board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| "+ board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        board = new String[9];
        turn = "X"; // Starting with X
        String winner = null;


        for(int i=0;i<9;i++) {
            board[i] = String.valueOf(i+1);
        }

        System.out.println("Welcome to Tic-Tac-Toe");
        printBoard();
        System.out.print("X will play first. Enter a slot number to place X in: ");

        while(winner == null) { // If the winner value get filled mean's it come out of the loop
            int input;
            try {
                input = scan.nextInt();
                // check for valid input range
                if(!(input>0 && input<=9)){
                    System.out.println("Invalid input");
                    continue; // go back to the loop
                }

                // check if slot is free or not
                if(board[input - 1].equals(String.valueOf(input))) { // ex: input = 5 , board[4] = 5 then fill the slot (or) input = 5 , board[4] = "X" then go to else block
                    board[input - 1] = turn;
                    // change the player chance
                    turn = turn.equals("X")? "O":"X";
                    printBoard();
                    winner = checkWinner(); // "X" / "O" / "draw"
                } else {
                    System.out.println("Already occupied"); // there no other code in try block so it continue the loop again
                }
            } catch(InputMismatchException e) { // check for valid input (only int will be acceptable)
                System.out.println("Invalid input");
                scan.nextLine();
            }
            /*
                * Clear the invalid input from the buffer
                scan.nextLine();
                This is very important.
                When the user enters something invalid (like a string when an int is expected), that invalid token remains in the scanner buffer.
                If you don’t remove it, the next scan.nextInt() will immediately throw the same exception again, causing an infinite loop.
                So nextLine() consumes the bad input so the scanner can continue fresh.
            */
        }
        // After get the winner!
        // Final result:
        if(winner.equalsIgnoreCase("draw")){
            System.out.println("It's a Draw, Thanks for playing");
        }
        else{
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
        scan.close();
    }
}