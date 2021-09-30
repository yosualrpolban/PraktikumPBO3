import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) //batas 3x input
        {
            String s1=sc.next(); 
            int x=sc.nextInt();
            System.out.printf( "%-15s%03d %n", s1, x);
        }
        System.out.println("================================");

	}

}
/**
 * Jika kita menggunakan .next() 
 * maka ketika menginput lebih dari 1 kata (dipisah dengan spasi) 
 * maka hanya bisa menerima 1 (satu) kata saja pada output
 */
