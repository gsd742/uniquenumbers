package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String[] game = new String [10];
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("game");
        int amount = 0;
        boolean people = false;
        while (people == false) {
            System.out.println("how many people are playing?");
            try {
                amount = Integer.parseInt(input.nextLine());
                people = true;
            } catch (Exception e) {
                System.out.println("needs to be a number");
            }
        }
        for (int i = 0; i<4; i++){
            playerturn();
            computerturn();
        }
    }

    private static void computerturn(){
        Random rand = new Random();
        int computerG = rand.nextInt(10);
        if (game[computerG]==" "){
            game[computerG]=("computer");
        }
        else {
            System.out.println("computer place was taken");
        }
    }

    private static void playerturn (){
        System.out.println("what number do you choose?");
        int playerG = 0;
        try{
            playerG = Integer.parseInt(input.readLine());
        }
        catch (Exception e){
            System.out.println(e);
        }
        if (game[playerG]==" "){
            game[playerG]=("playerG");
        }
        else {
            System.out.println("sorry its taken");
        }
    }
}
