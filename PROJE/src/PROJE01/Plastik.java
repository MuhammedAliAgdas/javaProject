package PROJE01;
class Plastik extends GeriDönüşüm{
	Plastik(){}
	@Override
	public void GDOranı(int GDplastik) {
		super.GDplastik=GDplastik;
    	super.GDplastik/=4;
	}
	@Override
	public int Gdonusen() {
		return super.GDplastik;
	}	
}
