import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String str = userInput.nextLine();
		String[] index = str.split(" ");
		int a = Integer.parseInt(index[0]);
		int b = Integer.parseInt(index[2]);	
		int c = 0;
		if(a<=100 && b<=100) {
			switch(index[1]) {
				case "+":
					c = a+b;
					System.out.print(c);
					break;
				case "-":
					c = a-b;
					System.out.print(c);
					break;
				case "*":
					c = a*b;
					System.out.print(c);
					break;
				case "/":
					c = a/b;
					System.out.print(c);
					break;
			}
		}
	}
}

/**
 * Saya kebingungan awalnya tentang perhitungan satu baris ini karena 
 * saya tidak tau cara membaca operator yang ditengah integer ternyata
 * setelah melihat referensi dan dibantu oleh teman, penggunaan Array
 * adalah salah satu solusi nya
 */
