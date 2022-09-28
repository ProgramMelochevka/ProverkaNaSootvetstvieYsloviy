package by.home.maxzzzit;

import java.awt.color.CMMException;
import java.util.Scanner;

public class ProverkaNaSootvetstvieYsloviy {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[]args) throws Exception {
		System.out.print("Введите число n: ");
		int n = scn.nextInt();
		System.out.print("Введите число m: ");
		int m = scn.nextInt();
		ProverkaNaSootvetstvieYsloviy smp = new ProverkaNaSootvetstvieYsloviy();
		smp.Matrix(n, m);
	}
	public void Matrix(int n, int m) throws Exception {
		// проверка на соответствие:
		
		if ((n < 5) || (m < 10)) {
		throw new Exception();
		}
		else System.out.println("All goog!");
}
}

