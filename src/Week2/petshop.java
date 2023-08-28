package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class petshop {

	public static void main(String[] args) {
		
		//Pet p1 = new Pet();
		//System.out.println(p1.vaccinated);
		int x = 0;
		String name = "";
		Pet p2 = new Pet("Roberto", 6, "guau", false);
		Pet p1 = new Pet("Fluffy", 5, "Meow", true);
		System.out.println(p2.getAge());
		System.out.println(p2.getVoice());
		p2.setVoice("me - oooooouch");
		
		System.out.println(p2.getVoice());
	}

}
