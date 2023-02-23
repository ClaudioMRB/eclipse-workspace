package application;

import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args) {

		Contract contract = new Contract();
		Scanner sc = new Scanner(System.in);
		
		
		//System.out.println("Digite uma data ");
		//contract.setX1(sc.next());
		
		
		
		System.out.println("x1 " +contract.getX1());
		System.out.println("x2 " + contract.getX2());
		System.out.println("x3 " +contract.getX3());
		System.out.println("x4 " +contract.getX4());
	
		
		
	}

}
