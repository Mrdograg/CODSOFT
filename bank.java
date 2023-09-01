import java.util.Scanner;

class ATM{
       float amount;


       public ATM(float amount){
           this.amount = amount;
       }
    public void display(){
        System.out.println("Withdrawing");
        System.out.println("Depositing");
        System.out.println("Check the balance");
        System.out.println("Enter the choice");

    }
}

public class bank{
    public static void main(String[] args) {

        ATM atm = new ATM(100);
        System.out.println(atm.amount);


        System.out.println("Enter the choice");
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        switch (n){
            case 1 : "Withdrawing";
        }

    }
}