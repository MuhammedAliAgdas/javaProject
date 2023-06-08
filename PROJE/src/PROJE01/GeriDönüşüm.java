package PROJE01;
abstract class GeriDönüşüm {
	protected int GDkagıt,GDcam,GDplastik,GDmetal;
	public void yıpranmaOranıHesapla(double yıpranmaOranı) {
		if(yıpranmaOranı>=0 && yıpranmaOranı<=25) {}
		else if(yıpranmaOranı>25 && yıpranmaOranı<=50) {GDcam/=2;GDkagıt/=2;GDplastik/=2;GDmetal/=2;}
		else if(yıpranmaOranı>50 && yıpranmaOranı<=75) {GDcam/=3;GDkagıt/=3;GDplastik/=3;GDmetal/=3;}
		else if(yıpranmaOranı>75 && yıpranmaOranı<=100) {GDcam/=4;GDkagıt/=4;GDplastik/=4;GDmetal/=4;}
		}
	public abstract void GDOranı(int GD);
	public abstract int Gdonusen();
}
