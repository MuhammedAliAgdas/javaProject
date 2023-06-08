package PROJE01;
 class MaddeAyrıştırma extends TankSayısıHesapla{
	 MaddeAyrıştırma(){}
	 private static int kagıt=0,cam=0,plastik=0,metal=0,ayrıştırma=0;
	 boolean hata = false;
		public void MaddeSeçme(int seçim) {
			switch(seçim) {
			case 0: if(kagıt==0&&cam==0&&plastik==0&&metal==0) {hata =true;}  break;
			case 1: kagıt=1; hata = false; break;
			case 2: cam=1; hata = false; break;
			case 3:plastik=1; hata = false; break;	
			case 4:metal=1; hata = false;break;
			}		
		}
		public void MaddelereTankAyrıştırma() {
			if(kagıt==1) {ayrıştırma+=1;}
			if(cam==1) {ayrıştırma+=1;}
			if(plastik==1) {ayrıştırma+=1;}
			if(metal==1) {ayrıştırma+=1;}
		}
		public void MaddeTankSayısıYazdırma() {
			System.out.println(ayrıştırma);
			System.out.println("Gönderilecek geri dönüşüm tankları;");
			if(kagıt==1) {System.out.println(tankSayısı/ayrıştırma+" tank Kağıt,");}
			if(cam==1) {System.out.println(tankSayısı/ayrıştırma+" tank Cam,");}
			if(plastik==1) {System.out.println(tankSayısı/ayrıştırma+" tank Plastik,");}
			if(metal==1) {System.out.println(tankSayısı/ayrıştırma+" tank Metal,");}
			System.out.println("olarak belirlenmiştir.");
			if(tankSayısı%ayrıştırma!=0) {System.out.println(tankSayısı%ayrıştırma+" tane tank bölünemediği için çıkarılmıştır.");}
			System.out.println("Belirlenen tanklar fabrikaya sevk ediliyor...");
			System.out.println("");
		}
	public int MaddeTankSayısı() {return tankSayısı/ayrıştırma;}
	public int KagıtSecim() {
		return kagıt;
	}
	public int CamSecim() {
		return cam;
	}
	public int PlastikSecim() {
		return plastik;
	}
	public int MetalSecim() {
		return metal;
	}
}