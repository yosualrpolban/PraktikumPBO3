import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt();
		int b = userInput.nextInt();
		int c = userInput.nextInt();
		int d = userInput.nextInt();
		
		String str = Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d);
		long jmlPlat = Long.parseLong(str);
		long result = ((jmlPlat - 999999) % 5 );
		
		if(result == 0) {
			System.out.print("Berhenti");
		}else {
			System.out.print("Jalan");
		}
	}
}


/* Awalnya saya kebingungan kenapa ketika memakai tipe data integer selalu salah
 * ternyata daya tampung untuk inputannya kurang besar jadi saya mengkonversikan string 
 * tersebut ke tipe data long
 */