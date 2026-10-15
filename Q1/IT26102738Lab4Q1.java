import java.util.Scanner;

public class IT26102738Lab4Q1{
	public static void main(String []args){
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int number=input.nextInt();
		
		 if(number > 0){
            System.out.println("Number is Positive");
		 }else  if (number < 0) {
            System.out.println("Number is Negative");
		 }else{
			 System.out.println("Number is Zero");
		 }
	}
}
	