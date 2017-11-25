package Main;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static double e;
	private static int n = 1;
	private static double r = 1;
	private static int i;
	
	public static void main(String[] args) {
		System.out.println("Veuillez entrer le degré de précision souhaité");
		
		while(e == 0){
            try {
            		String test = sc.nextLine();
                    e = Double.parseDouble(test);
            }catch(NumberFormatException e) {
                    System.out.println("veuillez entrer un nombre différent de 0");
            }
		}
		
		while(1/Math.pow(2, n) >= e) {
			r = Math.sqrt(1+r);
			n = n+1;
		}
	
		i = (int) (r*(1/e));
		r = i * e;
		
		System.out.println("la valeur du nombre d'or a " + e + " prés est donc " + r);
	}

}
