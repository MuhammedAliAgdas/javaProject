package PROJE01;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GeriDönüşümTesisi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int no;
		String isim;
		System.out.println("---------------Geri Dönüşüm Servisi---------------");
		System.out.println("");
		try {	
		System.out.println("Fabrikanın no'sunu veya ismini giriniz: ");
		no = klavye.nextInt();
		System.out.println("");
	    Fabrika fabrika = new Fabrika(no);
	    fabrika.çıktı();
	    Fiyat fiyat = new Fiyat(no);
	    fiyat.FiyatYazdirma();
		EnerjiTasarrufu enerji = new EnerjiTasarrufu(no);
		enerji.EnerjiYazdırma();   
		}catch(InputMismatchException e) { 
		isim = klavye.next(); 
		System.out.println("");
	    Fabrika fabrika = new Fabrika(isim);
	    fabrika.çıktı();
	    Fiyat fiyat = new Fiyat(isim);
	    fiyat.FiyatYazdirma();
		EnerjiTasarrufu enerji = new EnerjiTasarrufu(isim);
		enerji.EnerjiYazdırma();   
		}
	}
}