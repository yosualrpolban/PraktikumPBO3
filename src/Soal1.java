import java.io.*;
import java.util.*;
import java.util.regex.*; 
public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();
	       String[] splitString = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));
	            System.out.println(splitString.length);
	            for (String string : splitString) {
	                System.out.println(string);
	              }
	}
}


/*
 * Mengetahui cara memisahkan string menggunakan function split
 * */