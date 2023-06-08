package PROJE01;
import java.util.InputMismatchException;
import java.util.Scanner;
class Fabrika {
	Fabrika(int no){System.out.println(no+" no'lu Fabrikanın: ");}
	Fabrika(String isim){System.out.println(isim+" Fabrikasının: ");}
	MaddeAyrıştırma madde = new MaddeAyrıştırma();
	FabrikaAraçHesapla araç=new FabrikaAraçHesapla();
	Kagıt kagıt=new Kagıt();
	Cam cam=new Cam();
	Plastik plastik=new Plastik();
	Metal metal=new Metal();
	protected static int seçim=5,GDkagıt,GDcam,GDplastik,GDmetal;
	protected int yıpranmaOranı;
	private double kagıtYıpranma,camYıpranma,plastikYıpranma,metalYıpranma;
	Scanner klavye2 = new Scanner(System.in);
   public void çıktı() {
	   madde.FabrikaBilgiler();
	   araç.AracSayısıHesapla();
	   System.out.println("");
	   while(seçim!=0){
		try {
		System.out.println("Fabrika sahibinin dönüşüm yapmak istediği maddeleri giriniz.(Kağıt için 1,Cam için 2,Plastik için 3,Metal için 4, ve seçimleriniz bitti ise 0'ı tuşlayınız.):");
		seçim = klavye2.nextInt();
		if(seçim<0||seçim>4) {throw new ArithmeticException();}
		madde.MaddeSeçme(seçim);
		if(madde.hata== true) {seçim=5;System.out.println("En az bir madde seçmeniz gereklidir!!!");}
		}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); klavye2.next();}
		catch(ArithmeticException e){System.out.println("Yanlış değer girdiniz!!");}
		}
	    madde.MaddelereTankAyrıştırma();
		madde.MaddeTankSayısıYazdırma();
		MaddelerinGDOranı();
		YıpranmaHesapla();
		GDMaddeKiloYazma();
   }
   public void MaddelerinGDOranı() {
		kagıt.GDOranı(madde.MaddeTankSayısı()*1000);
		cam.GDOranı(madde.MaddeTankSayısı()*1000);
		plastik.GDOranı(madde.MaddeTankSayısı()*1000);
		metal.GDOranı(madde.MaddeTankSayısı()*1000);
	}
   
public void YıpranmaHesapla() {
	System.out.println("--------------------------------------------");
	System.out.println("");
	System.out.println("Tanklar dolmuştur ve fabrikadan geri gönderilmiştir.");
	System.out.println("Geri gönderilen tanklardaki maddelerin yıpranma oranları hesaplanmıştır.");
	System.out.println("");
	boolean Dkagıt=true,Dcam=true,Dplastik=true,Dmetal=true;
if(madde.KagıtSecim()==1) {
	while(Dkagıt){
	try {
	System.out.println("Geri gönderilen kağıdın yıpranma oranını yüzde cinsinden giriniz(0-100)%:");
	kagıtYıpranma=klavye2.nextDouble();
	if(kagıtYıpranma<0||kagıtYıpranma>100) {throw new ArithmeticException();}
	else {kagıt.yıpranmaOranıHesapla(kagıtYıpranma);Dkagıt = false;}
	}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); klavye2.next();}
	catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dkagıt=true; }
	}
}
if(madde.CamSecim()==1) {
	while(Dcam){
	try {
	System.out.println("Geri gönderilen camın yıpranma oranını yüzde cinsinden giriniz(0-100)%:");
	camYıpranma=klavye2.nextDouble();
	if(camYıpranma<0||camYıpranma>100) {throw new ArithmeticException();}
	else {cam.yıpranmaOranıHesapla(camYıpranma);Dcam = false;}
	}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); klavye2.next();}
	catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dcam=true;}
	}
}
if(madde.PlastikSecim()==1) {
	while(Dplastik){
	try{
	System.out.println("Geri gönderilen plastiğin yıpranma oranını yüzde cinsinden giriniz(0-100)%:");
	plastikYıpranma=klavye2.nextDouble();
	if(plastikYıpranma<0||plastikYıpranma>100) {throw new ArithmeticException();}
	else {plastik.yıpranmaOranıHesapla(plastikYıpranma);Dplastik = false;}
	}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); klavye2.next();}
	catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dplastik=true;}
	}
}
if(madde.MetalSecim()==1) {
	while(Dmetal){
	try {
	System.out.println("Geri gönderilen metalin yıpranma oranını yüzde cinsinden giriniz(0-100)%:");
	metalYıpranma=klavye2.nextDouble();
	if(metalYıpranma<0||metalYıpranma>100) {throw new ArithmeticException();}
	else {metal.yıpranmaOranıHesapla(metalYıpranma);Dmetal=false;}
	}catch(InputMismatchException e) {System.out.println("Yanlış değer girdiniz!!"); klavye2.next();}
	catch(ArithmeticException e) {System.out.println("Yanlış değer girdiniz!!");Dmetal=true;}
	}
}
}
public void GDMaddeKiloYazma() {
	if(madde.KagıtSecim()==1) {
		System.out.println("Geri dönüşen Kağıt kilosu:"+kagıt.Gdonusen());
		System.out.println("");
		GDkagıt=kagıt.Gdonusen();
	}
	if(madde.CamSecim()==1) {
		System.out.println("Geri dönüşen Cam kilosu:"+cam.Gdonusen());
		System.out.println("");
		GDcam=cam.Gdonusen();
	}
	if(madde.PlastikSecim()==1) {
		System.out.println("Geri dönüşen Plastik kilosu:"+plastik.Gdonusen());
		System.out.println("");
		GDplastik=plastik.Gdonusen();
	}
	if(madde.MetalSecim()==1) {
		System.out.println("Geri dönüşen Metal kilosu:"+metal.Gdonusen());
		System.out.println("");
		GDmetal=metal.Gdonusen();
	}
}
}