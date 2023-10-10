package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Menu Class is responsible for setting an array of foods and printing the Food Menu.
 * Modify food array if necessary.
 */
public class Menu{
	public static List<String> foodsInMenu = new ArrayList<>();

	public Menu() {
		setFood();
	}

	/**
	 * Sets the array of String with food names.
	 */
	public static void setFood() {
		foodsInMenu.add("PANSIT");
		foodsInMenu.add("PALABOK");
		foodsInMenu.add("CASSAVA CAKE");
		foodsInMenu.add("KUTSINTA");
		foodsInMenu.add("PUTO");
		foodsInMenu.add("MIXED KAKANIN");
		foodsInMenu.add("LUMPIA");
		foodsInMenu.add("BUFFALO WINGS");
		foodsInMenu.add("PORK SISIG");
		foodsInMenu.add("MACARONI SALAD");
	}

	/**
	 * Prints the Menu.
	 */
	public static void printMenu() {
		System.out.println("********************* MENU *********************");
		System.out.println("[1] Pansit                   450 \t550 \t650");
		System.out.println("[2] Palabok                  450 \t550 \t650");
		System.out.println("[3] Cassava Cake             120 \t500 \t700");
		System.out.println("[4] Kutsinta                 350 \t450 \t550");
		System.out.println("[5] Puto                     350 \t450 \t550");
		System.out.println("[6] Mixed Kakanin            350 \t450 \t550");
		System.out.println("[7] Lumpia                   300 \t400 \t500");
		System.out.println("[8] Buffalo Wings            350 \t450 \t550");
		System.out.println("[9] Pork Sisig               450 \t550 \t650");
		System.out.println("[10] Macaroni Salad          450 \t550 \t650");
		System.out.println("************************************************");
	}


}
