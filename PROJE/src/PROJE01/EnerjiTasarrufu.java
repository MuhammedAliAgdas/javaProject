package PROJE01;
class EnerjiTasarrufu extends Fabrika{
	EnerjiTasarrufu(int no) {
		super(no);
		System.out.println("Enerji Bilgileri:");
	}
	EnerjiTasarrufu(String isim) {
		super(isim);
		System.out.println("Enerji Bilgileri:");
	}
	private double kagıtenr=3.50,camenr=0.42,plastikenr=5.8,metalenr=64;
	public class agacKurtarma{
		private static int agacSayısı=0;
	    public static void agac(int kagıtTon) {
	    	agacSayısı = kagıtTon*17;
	    	System.out.println("");
	    	System.err.println("Teşekkürler! "+agacSayısı+" tane ağacı kesilmekten kurtardınız. :)");
	    }
	}
	
	public void EnerjiYazdırma() {
		if(madde.KagıtSecim()==1){System.out.println("Geri dönüştürülen kağıttan elde edilen enerji tasarrufu:"+kagıtenr*GDkagıt+ " kWh");}
		if(madde.CamSecim()==1) {System.out.println("Geri dönüştürülen camdan elde edilen enerji tasarrufu:"+camenr*GDcam+ " kWh");}
		if(madde.PlastikSecim()==1) {System.out.println("Geri dönüştürülen plastikten elde edilen enerji tasarrufu:"+plastikenr*GDplastik+ " kWh");}
		if(madde.MetalSecim()==1) {System.out.println("Geri dönüştürülen metalden elde edilen enerji tasarrufu:"+metalenr*GDmetal+ " kWh");}
		System.out.println("Fabrikanın bu geri dönüşümden elde ettiği toplam enerji tasarrufu:"+(kagıtenr*GDkagıt+camenr*GDcam+plastikenr*metalenr*GDmetal)+ " kWh");
		System.out.println("");
	    if(madde.KagıtSecim()==1) {EnerjiTasarrufu.agacKurtarma.agac(GDkagıt/1000);}
	}
}
