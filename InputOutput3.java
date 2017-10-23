import java.util.Scanner;
public class InputOutput3 {
	public static void main (String[] args){
	Scanner input = new Scanner (System.in);
	String nama;
	char jenisKelamin;
	int tinggiBadan;
	boolean menikah;
System.out.print("Masukan Nama 		:");
nama = input.nextLine();
System.out.print("Masukan jenis kelamin :");
jenisKelamin = input.nextLine().charAt(0);
System.out.print("Masukan Tinggi Badan  :");
tinggiBadan = input.nextInt();
System.out.print("Masukan Status Menikah :");
menikah = input.nextBoolean();

System.out.println("Nama :"+nama);
System.out.println(jenisKelamin);
System.out.println(tinggiBadan);
System.out.println(menikah);

}
}