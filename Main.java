package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int gidilenYol,acilisUcreti;
		double toplamTutar,kmBasiUcret;
		kmBasiUcret=2.2;//toplam tutar i�erisinde gidilen yolu2.2 ile �arparak da yapabilirdik ama km �creti de�i�irse her zaman u�ra��r�z
		acilisUcreti=10;
		System.out.println("Gidece�iniz yerin uzakl���n� KM cinsinden giriniz:");
		gidilenYol=scanner.nextInt();
		toplamTutar=acilisUcreti+(gidilenYol*kmBasiUcret);
		if(toplamTutar<20) {
			toplamTutar=20;
			System.out.println("�ndi-bindi 20 tl");
		}else {
			System.out.println("Yolculuk sonunda �denecek �cret:" + toplamTutar);
		}
		

	}

}
