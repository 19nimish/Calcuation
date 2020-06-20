import java.util.Scanner;


public class Calculation {

		public static void main(String[] args) {
	
	System.out.print("Input the number of minutes: ");
		
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
	
		
		int a ;
			a = (int)(min/525600) ;
		
		int b;
		b = (int)(min%365);
		
		
				
				System.out.print( min+"minutes is approx"+a+"yrs and"+b+"days");
				
				
				
			}
		}

		
