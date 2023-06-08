package PROJE01;
class Kagıt extends GeriDönüşüm{
	Kagıt(){
    }
	@Override
	public void GDOranı(int GDkagıt) {
		super.GDkagıt=GDkagıt;
		super.GDkagıt/=2;
	}
	@Override
	public int Gdonusen() {
		return super.GDkagıt;
	}
}
