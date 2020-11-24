package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			String vect[] = sc.nextLine().split(" ");
			System.out.print("Pesquisar Index: ");
			int index = sc.nextInt();
			System.out.println(vect[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index inválida");
		} catch (InputMismatchException e) {
			System.out.println("Index não pode ser uma letra");
		}
		
		System.out.println("Fim programa !");

		sc.close();

	}

}
