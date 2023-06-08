package PROJE01;
class FabrikaAraçHesapla extends TankSayısıHesapla{
	FabrikaAraçHesapla(){}
	private static int aracSayısı=0 ;
	public void AracSayısıHesapla(){
		if(tankSayısı<=8) {aracSayısı +=1;}
		else if(tankSayısı>8 && tankSayısı<=16) {aracSayısı +=2;}
		else if(tankSayısı>16 && tankSayısı<=24) {aracSayısı +=3;}
		else if(tankSayısı>24 && tankSayısı<=32) {aracSayısı +=4;}
		else if(tankSayısı>32 && tankSayısı<=40) {aracSayısı +=5;}
		else if(tankSayısı>40 && tankSayısı<=48) {aracSayısı +=6;}
		else if(tankSayısı>48 && tankSayısı<=56) {aracSayısı +=7;}
		else if(tankSayısı>56 && tankSayısı<=64) {aracSayısı +=8;}
		else if(tankSayısı>64 && tankSayısı<=72) {aracSayısı +=9;}
		else if(tankSayısı>72 && tankSayısı<=80) {aracSayısı +=10;}
		System.out.println("Bu geri dönüşüm tankları "+aracSayısı+" tane tır ile fabrikaya gönderilecektir.");
	}
	public int AracSayısıVer() {return aracSayısı;}
}
