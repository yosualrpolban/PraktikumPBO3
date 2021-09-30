import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int gajiPokok = 500000;
		int items = userInput.nextInt();
		int itemsPrice = items * 50000;	
		if((items >= 40) && (items<80)) {
			int gaji = (int) (gajiPokok + (itemsPrice * 0.25));
			System.out.println(gaji);
		}else if(items >= 80) {
			int gaji = (int) (gajiPokok + (itemsPrice * 0.35));
			System.out.println(gaji);
		}else if(items<=15) {
			int gaji = (int) (gajiPokok - (itemsPrice * 0.15));
			System.out.println(gaji);
		}else {
			int gaji = (int) (gajiPokok + (itemsPrice * 0.1));
			System.out.println(gaji);
		}
	}

}

/**
 * Mengetahui bagaimana penggunaan konversi tipe data double ke integer 
 */
