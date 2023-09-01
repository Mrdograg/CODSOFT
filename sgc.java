import java.util.Scanner;
public class sgc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks out of 100");
        System.out.print("Enter marks for maths: ");
        int maths = input.nextInt();
        System.out.print("Enter marks for English: ");
        int eng = input.nextInt();
        System.out.print("Enter marks for Science: ");
        int sci = input.nextInt();
        System.out.print("Enter marks for Social Studies: ");
        int sst = input.nextInt();

        int sum = maths+eng+sci+sst;
        float avg = sum/4f;
        char grade;
        if (avg<=25.0){
            grade = 'D';
        }
        if (avg<=50.0){
            grade = 'C';
        }
        else if (avg<=75.0){
            grade = 'B';
        }
        else {
            grade = 'A';
        }
         System.out.println("Final grade: "+grade);
        System.out.println("Total marks: "+sum);
        System.out.println("Final avg: "+avg);


    }
}
