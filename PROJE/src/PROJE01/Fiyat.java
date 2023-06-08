package PROJE01;
class Fiyat extends Fabrika{
	Fiyat(int no) {
		super(no);
	    System.out.println("Fiyat Bilgileri:");
	}
	Fiyat(String isim) {
	    super(isim);
		System.out.println("Fiyat Bilgileri:");
	}
	private double kagıtf=3.80,camf=1.9,plastikf=6.20,metalf=120,aracfiyati=500;
	public void FiyatYazdirma(){
	if(madde.KagıtSecim()==1){System.out.println("Geri dönüştürülen kağıt fiyatı:"+kagıtf*GDkagıt+ "tl");}
	if(madde.CamSecim()==1){System.out.println("Geri dönüştürülen cam fiyatı:"+camf*GDcam+ "tl");}
	if(madde.PlastikSecim()==1){System.out.println("Geri dönüştürülen plastik fiyatı:"+ plastikf*GDplastik+ "tl");}
	if(madde.MetalSecim()==1){System.out.println("Geri dönüştürülen metal fiyatı:"+ metalf*GDmetal+ "tl");}
	System.out.println("Lojistikte kullanılan araçların toplam maliyeti: "+araç.AracSayısıVer()*aracfiyati+ "tl");
	System.out.println("Fabrikanın geri dönüşümden elde ettiği toplam kar: "+(kagıtf*GDkagıt+camf*GDcam+plastikf*GDplastik+metalf*GDmetal-araç.AracSayısıVer()*aracfiyati)+ " tl");
	System.out.println("");
	}
}
