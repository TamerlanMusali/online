package Online;

import java.util.Scanner;

public class GCD {
public static int GCD(int num1, int num2) {
	while (num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }
    return num1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result = GCD(num1, num2);
        System.out.println("Наибольший общий делитель: " + result);

        scanner.close();
    }
	}