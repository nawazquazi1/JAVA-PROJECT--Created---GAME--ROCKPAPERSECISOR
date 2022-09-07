import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void game3() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" <=>          --------          : --WELCOME TO MY GAME-- :          -----------       <=> ");
        System.out.println("------  ENTER YOUR NAME  ------ ");
        String name = sc.nextLine();
        System.out.println("------  ENTER YOUR AGE  ------");
        int age = sc.nextInt();
        int User_Total_Win_Points = 0;
        int Computer_Total_Win_Point = 0;

        if (age < 18) {
            System.out.println("!! SORRY THIS GAME CAN BE USED FOR MORE THAN 18 YEARS !!");
            return;
        } else {
            int i = 1;
            int match = 0;
            while (i <= 3) {
                System.out.println(i + " MATCH STARED ");
                System.out.print("PLEASE CHOSE :- \n ");
                System.out.println("1 ROCK \n 2 PAPER \n 3 SCISSOR");
                System.out.println("----- YOUR CHANCE -----");
                int userInput = sc.nextInt();
                if (userInput == 1) {
                    System.out.println("------  YOUR CHOSE IS PAPER ------");
                } else if (userInput == 2) {
                    System.out.println("------  YOUR CHOSE IS ROCK ------");
                } else if (userInput == 3) {
                    System.out.println("------  YOUR CHOSE IS SCISSOR ------");
                } else {
                    System.out.println("-------- YOUR CHOSE INVALID --------");
                    return;
                }
                System.out.println("----- COMPUTER CHANCE -----");
                Random re = new Random();
                int ComputerInput = re.nextInt(1,3);
                if (ComputerInput == 1) {
                    System.out.println("------  COMPUTER CHOSE PAPER  ------ ");
                } else if (ComputerInput == 2) {
                    System.out.println("------  COMPUTER CHOSE ROCK  ------");
                } else if (ComputerInput == 3) {
                    System.out.println("------  COMPUTER CHOSE SCISSOR  ------");
                }
                if (userInput == 2 && ComputerInput == 3 || userInput == 1 && ComputerInput == 2|| userInput == 3 && ComputerInput == 1) {
                    User_Total_Win_Points++;
                    System.out.println("-------- CONGRATULATIONS " + name.toUpperCase() + " YOU WON " + i + " MATCH !! --------");
                } else if (userInput == ComputerInput) {
                    System.out.println(" MATCH ARE DRAW");
                } else {
                    System.out.println(" ------ COMPUTER WIN ---- \n------- TRY AGAIN ------");
                    Computer_Total_Win_Point++;
                }
                i++;
            }
        }
        System.out.println("\n");
        if (User_Total_Win_Points > Computer_Total_Win_Point) {
            System.out.println("----------  CONGRATULATIONS " + name.toUpperCase() + "  YOU WIN ---------");
        } else if (User_Total_Win_Points == Computer_Total_Win_Point) {
            System.out.println(" -------  ALL THE MATCH ARE DRAW   -------");
        } else {
            System.out.println("SORRY TRY AGAIN COMPUTER WIN ");
        }
    }

    public static void main(String[] args) {
        game3();


    }
}
