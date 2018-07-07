package com.wilder.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.wilder.amazonviewer.model.Chapter;
import com.wilder.amazonviewer.model.Movie;
import com.wilder.amazonviewer.model.Serie;


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
			
			Scanner sc = new Scanner(System.in);
			int respuesta = Integer.valueOf(sc.nextLine());
			
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
		int exit = 1;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0)
				showMenu();
			
			Movie movieSelected = movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateIni = movieSelected.startToSee(new Date());

			int fullMovie = 10000;
			for (int i = 0; i < fullMovie; i++) {
				System.out.println((((i+1)*100)/fullMovie) + "%");
			}
			
			movieSelected.stopToSee(dateIni, new Date());
			System.out.println();
			System.out.println("Viste:\n" + movieSelected);
			System.out.println("Por: " + movieSelected.getTimeViewed() + " milisegundos");
		}while(exit !=0);
		
	}
	
	public static void showSeries() {
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters());
			
		}while(exit !=0);
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 0;
		
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			int fullChapters = 10000;
			for (int i = 0; i < fullChapters; i++) {
				System.out.println((((i+1)*100)/fullChapters) + "%");
			}
			
			//Termine de verla
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
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
