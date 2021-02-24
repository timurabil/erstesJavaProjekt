import java.util.Scanner;


public final class IntVar {
	private IntVar()  { }
	
	private static final Scanner EINGABE = new Scanner(System.in);

	public static void main(String[] args) {
		
		final int max = 0x7FFFFFFF;
		final int min = 0x80000000;
		
		System.out.printf("Zwei ganze Zahlen zwischen %d und %d eingeben: %n" ,min, max) ;
		
		
		int z1 = 0;
		
		int z2 = 0;
		int k = 0;
		
		if (EINGABE.hasNextInt() )  {
			z1 = EINGABE.nextInt();
			k++;
		} else {
			System.out.println("ungueltige Eingabe!") ;
		}
		
		if (k == 1) {
			if (EINGABE.hasNextInt())  {
				z2 = EINGABE.nextInt();
				k++;
			} else {
				System.out.println("Ungueltige Eingabe!");
				
			}
		}
		
		if (k == 2) {
			System.out.printf("%d ist oktal %o und hexadezimal %x%n",
					z1, z1, z1);
			System.out.printf("%d ist oktal %o und hexadezimal %x%n",
					z2, z2, z2);
			System.out.println("waehlen Sie den Arithmetischen/Vergleichsoperator: ");
			String operator = EINGABE.next();
			switch (operator) {
			case "+":
				System.out.printf("%d + %d ist %d%n" , z1, z2, z1 + z2);
				break;
			case "-":
				System.out.printf("%d - %d ist %d%n", z1, z2, z1 - z2);
				break;
			case "*":
				System.out.printf("%d * %d ist %d%n", z1, z2, z1 * z2);
				break;
			case "/":
				System.out.printf("%d / %d ist %d%n", z1, z2, z1 / z2);
				break;
			case "%":
				System.out.printf("%d % %d ist %d%n", z1, z2, z1 % z2);
				break;
			case "==":
				System.out.printf("%d == %d iist %b%n", z1, z2, z1 == z2);

				break;
			case "!=":
			System.out.printf("%d != %d ist %b%n",
					z1, z2, z1 != z2);
			break;
			case "<":
				System.out.printf("d < %d ist %b%n",
						z1, z2, z1 < z2);
				break;
			case "<=":
				System.out.printf("%d <= %d ist %b%n",
						z1, z2, z1 <= z2);
				break;
			case ">":
				System.out.printf("%d > %d ist %b%n",
						z1, z2, z1 > z2);
				break;
			case ">=":
				System.out.printf("%d >= %d ist %b%n",
						z1, z2, z1 >= z2);
				break;
			default:
				System.out.println("Ungueltiger Operator!");
	    }

    } else {
    	System.out.println("Keine Berechnung aufgrund ungueltiiiger Eingabe!");
    }
    }
}
	