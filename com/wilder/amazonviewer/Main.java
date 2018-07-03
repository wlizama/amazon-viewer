package com.wilder.amazonviewer;

import java.util.Date;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() {
		int exit = 0;
		
		do {
			
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			int respuesta = 1; // temporal
			
			switch (respuesta) {
				case 0:
					// Salir
					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					makeReport(new Date());
					break;
				default:
					System.out.println();
					System.out.println("....¡¡Selecciona una opción!!....");
					System.out.println();
					break;
			}
			
		} while (exit !=0);
	}
	
	public static void showMovies() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
		}while(exit !=0);
		
	}
	
	public static void showSeries() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();
		}while(exit !=0);
		
	}
	
	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
		}while(exit !=0);
		
	}
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
		}while(exit !=0);
		
	}
	
	public static void makeReport() {
		System.out.println("::Make report");
	}
	
	public static void makeReport(Date date) {
		System.out.println("::Make report date");
	}

}
