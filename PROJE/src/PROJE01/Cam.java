package PROJE01;
public class Cam extends GeriDönüşüm{
	Cam(){}
	@Override
	public void GDOranı(int GDcam) {
		super.GDcam=GDcam;
		super.GDcam/=3;
		}
	@Override
	public int Gdonusen() {
		return super.GDcam;
	}
}
