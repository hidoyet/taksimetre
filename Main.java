package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int gidilenYol,acilisUcreti;
		double toplamTutar,kmBasiUcret;
		kmBasiUcret=2.2;//toplam tutar içerisinde gidilen yolu2.2 ile çarparak da yapabilirdik ama km ücreti deðiþirse her zaman uðraþýrýz
		acilisUcreti=10;
		System.out.println("Gideceðiniz yerin uzaklýðýný KM cinsinden giriniz:");
		gidilenYol=scanner.nextInt();
		toplamTutar=acilisUcreti+(gidilenYol*kmBasiUcret);
		if(toplamTutar<20) {
			toplamTutar=20;
			System.out.println("Ýndi-bindi 20 tl");
		}else {
			System.out.println("Yolculuk sonunda ödenecek ücret:" + toplamTutar);
		}
		

	}

}
