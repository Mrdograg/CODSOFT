import java.util.Scanner;
import java.util.Random;
public class numbergame {

  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
   Random n = new Random();
   int number;
     number = n.nextInt(100);
     System.out.println(number);
         int i=0;
       for(i=1;i<=5;i++) {
           System.out.println(" Guess the number between 1-100");

           int a = input.nextInt();

           if (number == a) {
               System.out.println("Correct");
               break;
           } else if (number<a) {
               System.out.println("too high");

           } else {
               System.out.println("too low");
           }

       }
           System.out.println("Number of attempts left: "+i);
  }
}

