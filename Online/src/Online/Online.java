package Online;

import java.util.Scanner;

public class Online {
public static void main(String[] args) {
	System.out.println("Привет, мир!");
	
	
	
	int first = 0;
	for(int i = 1; i <= 10; i++) {
		first += i;
	}
	
	System.out.println(first);
	
	
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Введите 1 число: ");
	int num1 = scan.nextInt();
	
	System.out.println("Введите 2 число: ");
	int num2 = scan.nextInt();
	
	int result = num1 + num2;

	System.out.println("Сумма: " + result);
	
	
	

	
    
    
    
}
}
