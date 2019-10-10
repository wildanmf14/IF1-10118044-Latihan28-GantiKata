package latihan.gantikata;
import java.util.Scanner;
public class GantiKata {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("====Program Mengganti Kata====");
		System.out.println("");
		System.out.print("Masukan Kalimat : ");
		String kalimat = reader.nextLine();
		String ganti, menjadi;
		System.out.print("Ganti Kata : ");
		ganti = reader.next();
		System.out.print("Ganti Kata : ");
		menjadi = reader.next();
		System.out.println("");
		System.out.println("====Hasil Formatting====");
		System.out.println("Kalimat awal : " + kalimat);
		System.out.println("Kalimat baru : " + kalimat.replaceAll(ganti, menjadi));
		reader.close();

	}

}
