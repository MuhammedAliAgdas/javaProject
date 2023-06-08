package PROJE01;
import java.util.InputMismatchException;
import java.util.Scanner;
class TankSayısıHesapla {
	TankSayısıHesapla(){}
	private int çalışan,ishacmi,çöp,saat,gün;
	Scanner klavye1 = new Scanner(System.in);
	protected static int tankSayısı = 0;
	public void FabrikaBilgiler() {
	    boolean Dçalışan= true,Dishacmi= true,Dçöp= true,Dsaat=true,Dgün=true;
		while(Dçalışan){
		try {
		System.out.println("Çalışan sayısını giriniz(50-1000):");
		çalışan= klavye1.nextInt();
		if(çalışan<50 || çalışan>1000) {throw new ArithmeticException(); }
		else {Dçalışan = false;}
		}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); Dçalışan = true; klavye1.next(); }
		catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dçalışan = true;}
		}
		while(Dishacmi){
			try {
			System.out.println("Günlük iş hacmini yüzde cinsinden giriniz(1-100):");
			ishacmi= klavye1.nextInt();
			if(ishacmi<1 || ishacmi>100) {throw new ArithmeticException();}
			else {Dishacmi = false;}
			}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); Dishacmi = true; klavye1.next(); }
			catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dishacmi = true;}
			}
		while(Dçöp) {
			try {
			System.out.println("Aylık çıkan çöp miktarını ton cinsinden giriniz(1-100):");
			çöp= klavye1.nextInt();
			if(çöp<1 || çöp>100) {throw new ArithmeticException();}
			else {Dçöp = false;}
			}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); Dçöp = true; klavye1.next(); }
			catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dçöp = true;}
			}
		while(Dsaat) {
			try {
			System.out.println("Aylık çalışma saatini giriniz(240-744):");
			saat= klavye1.nextInt();
			if(saat<240 || saat>744) {throw new ArithmeticException();}
			else {Dsaat = false;}
			}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); Dsaat = true; klavye1.next(); }
			catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dsaat = true;}
			}
		while(Dgün) {
			try {
			System.out.println("Ayda kaç gün çalışıldığını giriniz(10-31):");
			gün= klavye1.nextInt();
			if(gün<10 || gün>31) {throw new ArithmeticException();}
			else {Dgün = false;}
			}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); Dgün = true; klavye1.next(); }
			catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dgün = true;}
			}
		tankSayısıHesap(çalışan, çöp);
		tankSayısıHesap(ishacmi,saat,gün);
	}
    public void tankSayısıHesap(int çalışan,int çöp) {
    	if(çalışan*çöp<=10000) {tankSayısı+=4;}
    	else if(çalışan*çöp>10000 && çalışan*çöp<=20000) {tankSayısı+=8;}
    	else if(çalışan*çöp>20000 && çalışan*çöp<=30000) {tankSayısı+=12;}
    	else if(çalışan*çöp>30000 && çalışan*çöp<=40000) {tankSayısı+=16;}
    	else if(çalışan*çöp>40000 && çalışan*çöp<=50000) {tankSayısı+=20;}
    	else if(çalışan*çöp>50000 && çalışan*çöp<=60000) {tankSayısı+=24;}
    	else if(çalışan*çöp>60000 && çalışan*çöp<=70000) {tankSayısı+=28;}
    	else if(çalışan*çöp>70000 && çalışan*çöp<=80000) {tankSayısı+=32;}
    	else if(çalışan*çöp>80000 && çalışan*çöp<=90000) {tankSayısı+=36;}
    	else if(çalışan*çöp>90000) {tankSayısı+=40;}
    }
    public void tankSayısıHesap(int ishacmi,int saat,int gün) {
    	if(ishacmi*saat/gün*10<=7440) {tankSayısı+=4;}
    	else if(ishacmi*saat/gün*10>7440 && ishacmi*saat/gün*10<=14880) {tankSayısı+=8;}
    	else if(ishacmi*saat/gün*10>14880 && ishacmi*saat/gün*10<=22320) {tankSayısı+=12;}
    	else if(ishacmi*saat/gün*10>22320 && ishacmi*saat/gün*10<=29760) {tankSayısı+=16;}
    	else if(ishacmi*saat/gün*10>29760 && ishacmi*saat/gün*10<=37200) {tankSayısı+=20;}
    	else if(ishacmi*saat/gün*10>37200 && ishacmi*saat/gün*10<=44640) {tankSayısı+=24;}
    	else if(ishacmi*saat/gün*10>44640 && ishacmi*saat/gün*10<=52080) {tankSayısı+=28;}
    	else if(ishacmi*saat/gün*10>52080 && ishacmi*saat/gün*10<=59520) {tankSayısı+=32;}
    	else if(ishacmi*saat/gün*10>59520 && ishacmi*saat/gün*10<=66960) {tankSayısı+=36;}
    	else if(ishacmi*saat/gün*10>66960) {tankSayısı+=40;}
    	System.out.println("Fabrikaya yerleştirilecek tank sayısı: "+tankSayısı+" kadardır.");
    }	
}
