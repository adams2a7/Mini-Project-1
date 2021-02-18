/*
Mini Project 1
Group #3: Alyssa Adams, Jay Patel, Evan Starling, Griffin Starr
Date: 17 February 2021
*/
import java.util.Scanner; 
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter any positive whole number:");
    int userNum = s.nextInt();
    int userRand = r.nextInt(userNum);
    System.out.println("A random number to guess has been gathered.");
    playGame(userNum, userRand);
  }
  public static void playGame(int funcuserNum, int funcuserRand){
    int game = 0;
    int numTries = 1;
    System.out.println("Please guess another number between 0 and "+funcuserNum);

    while(game !=1){
    Scanner s = new Scanner(System.in);

    int userGuess = s.nextInt();
    if(userGuess < funcuserRand){
      System.out.println("Too Low. Try Again.");
      numTries++;
      System.out.println("Enter new guess:");
    } else if (userGuess > funcuserRand) {
      System.out.println("Too High. Try Again.");
      numTries++;
      System.out.println("Enter new guess:");
    } else if(userGuess == funcuserRand){
      System.out.println("Great, you win! It took you "+numTries+" tries.");
      game = 1;
    }
  }
    
    

  

  
    
    

  }
  }
  

  
