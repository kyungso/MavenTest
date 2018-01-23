import java.util.Scanner;

public class List {
	public int sum(int num1, int num2){
		return num1 + num2;
	}

	public int minus(int num1, int num2){
		return num1-num2;
	}
	
	public static void main(String[] args) {
		System.out.println("Please input num1:");
		Scanner num =new Scanner (System.in);
		int num1=num.nextInt();
			
	 
		System.out.println("Please input num2:");
		num=new Scanner (System.in);
		int num2=num.nextInt();
		 
		
		List cal = new List();
		
		System.out.println("Calculator result is :"+ cal.sum(num1, num2));
		num.close();

		System.out.println("End.");
		return;		
	}
	
}