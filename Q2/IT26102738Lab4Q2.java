import java.util.Scanner;

public class IT26102738Lab4Q2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMarks;

		System.out.print("Please enter exam marks(out of 100) : ");
        examMarks = input.nextDouble();

        
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating Program");
            return;
        }

        
        System.out.print("Enter lab submission marks (out of 100): ");
        labMarks = input.nextDouble();

       
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab submission marks. Terminating Program");
            return;
        }

        
        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

       
        if (examPercentage + labPercentage != 100) {
            System.out.println("The Percentages must add up to 100. Terminating Program.");
            input.close();
            return;
        }

        
        finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.println("Final Exam mark is: "+finalMarks);

        
    }
}