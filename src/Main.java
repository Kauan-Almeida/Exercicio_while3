import java.util.Scanner;
public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
			
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		
		while (x > 0 && x != 4) {
			if (x == 1) {
				cont1 = cont1 + 1;			
				System.out.println("Alcool:"+ cont1);
				x = sc.nextInt();
			}
			else if ( x == 2) {
				cont2 = cont2 + 1;
				System.out.println("Gasolina:"+ cont2);
				x = sc.nextInt();
			}
			else if (x == 3 ) {
				cont3 = cont3 + 1;
				System.out.println("Diesel:"+ cont3);
				x = sc.nextInt();
			}
			else if (x > 4 ) {
				System.out.println("MUITO OBRIGADO");
				x = sc.nextInt();
			}
			 
		}
			if (x == 4) {
				System.out.println("Fim");
			
		}		
			sc.close();
		}
	}

