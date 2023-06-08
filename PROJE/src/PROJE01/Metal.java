package PROJE01;
class Metal extends GeriDönüşüm{
	Metal(){}
    @Override
	public void GDOranı(int GDmetal) {
		super.GDmetal=GDmetal;
		super.GDmetal/=5;	
	}
	@Override
	public int Gdonusen() {
		return super.GDmetal;
	}
}
