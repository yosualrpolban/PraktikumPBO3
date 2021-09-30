import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Scanner sc = new Scanner(System.in);
        String numOne = sc.nextLine();
        String numTwo = sc.nextLine();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));
	}	

}

/*
 * Saya mendapat pemahaman baru dari Class BigInteger 
 * yang mana digunakan untuk menampung dan memanipulasi tipe data integer
 * dengan kapasitas yang sangat besar
*/