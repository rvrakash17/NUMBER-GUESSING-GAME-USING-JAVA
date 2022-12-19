//OASIS INFOBYTE TASK 1 : NUMBER GUESSING GAME
//BY AKASH R...
import java.util.Random;
import java.util.Scanner;
public class NGG{
    public static void main(String[] args) {
      Random Random_number = new Random();
      int right_guess = Random_number.nextInt(100) ;
      int turns=0;
      Scanner scan=new Scanner(System.in);
      System.out.println("Guess a number between 1 to 100, You will have 10 turns!");
      System.out.println("Best Of Luck!!!");
      System.out.print("Enter the Number:");
      int guess;
      int i = 0;
      boolean win = false;
      while(win==false){
        guess=scan.nextInt();
        turns++;
        if(guess==right_guess)
        {
            win=true;
        }
        else if(i>8){
            System.out.println("You Loose... The Right Answer Was - "+right_guess);
            return;
        }
        else if(guess<right_guess){
            i++;
            System.out.println("Your Guess Is Lower Than The Right Guess...  Turns left - "+(10-i));

        }
        else if(guess>right_guess){
            i++;
            System.out.println("YOur Guess Is Higher Than The Right Guess...  Turns left - "+(10-i));

        }

      }
            System.out.println("Congracts You Win!!!");
            System.out.println("The Number is - "+right_guess);
            System.out.println("You Used "+turns+" Turns TO Guess The Right Number");
            System.out.println("Your Score Is :"+((11-turns)*10)+"/100");      
    }}
