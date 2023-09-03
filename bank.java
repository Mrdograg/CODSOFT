import java.util.Scanner;

class ATM{
       float amount;
       float am;

       public ATM(float amount){
           this.amount = amount;
       }

       public float withdrawn(float amount) {
           if (amount > 0 && amount <= this.amount) {
               this.amount -= amount;
               System.out.println("withdrawn done amount now "+this.amount);
           } else {
               System.out.println("Invalid withdrawal amount or insufficient balance.");
           }

           return this.amount;
       }

       public float deposit(float amount){
           if (amount > 0) {
               this.amount += amount;
               System.out.println("Deposit done amount now "+this.amount);
           } else {
               System.out.println("Invalid deposit amount.");
           }
           return this.amount;
       }
    public float checkBalance()
    {
        return amount;

    }

    public void display(){
        System.out.println("  ATM SERVICES  ");
        System.out.println("1. Withdraw amount ");
        System.out.println("2. Deposit amount");
        System.out.println("3. Check the balance");
        System.out.println("4. Exit");
       }
}

public class bank {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        float x=1000f;
        int check;
        ATM atm = new ATM(x);

        do {
            atm.display();
            System.out.print("Enter your choice: ");
            check = n.nextInt();

            switch (check) {
                case 1: {
                    System.out.print("Enter the withdrawal amount: ");
                    x = n.nextFloat();
                    atm.withdrawn(x);
                    break;
                }
                case 2: {
                    System.out.print("Enter the amount to be deposited: ");
                    x = n.nextFloat();
                     atm.deposit(x);
                    break;
                }
                case 3: {
                    System.out.println("Account balance is "+atm.checkBalance());
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (check!= 4);

        n.close();
    }

    }