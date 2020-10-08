import java.util.Scanner;

public class per6 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int nilai1, nilai2, hasil;
		
		System.out.print("Masukkan nilai pertama :");
		nilai1 = input.nextInt();
		
		System.out.print("Masukkan nilai kedua :");
		nilai2 = input.nextInt();
		
		hasil = nilai1 + nilai2;
		System.out.println("Hasil: " +nilai1+ " + " +nilai2+ " = " + hasil);
	}
}