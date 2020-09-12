package TasKagýtMakas;

import java.util.Scanner;

public class TasKagýtMakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bilgi = new Scanner(System.in);
		
		int kullanici = 0;
		int bilgisayar = 0;
		
		System.out.println("Taþ Kaðýt Makas Oyununa Hoþ Geldiniz...");
		System.out.println("");
        System.out.println("");
        System.out.println("1. Taþ, 2. Kaðýt, 3. Makas");
        System.out.println("");
        System.out.println("");
        while(true) {
        	
        	System.out.println("Seçim Yapýnýz =  = ");
        	int kul = bilgi.nextInt();
        	
			int pc = (int) (Math.random() * 3);
			
			
			if( kul == 1 ) {
				if( pc == 1) {
				  
					System.out.println("Tur Berabere Bitti...");
					System.out.println("");
					System.out.println("");
					
					kullanici ++;
					bilgisayar ++;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
				else if( pc == 2) {
					System.out.println("Turu Kaybettiniz...");
					
					bilgisayar += 2;
					
					System.out.println("");
					System.out.println("");
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
				else {
				
					System.out.println("Turu Kazandýnýz...");
					System.out.println("");
					System.out.println("");
					
					kullanici += 2;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				
				}
				
			}
			else if ( kul == 2) {
				
				if( pc == 1) {
		
					System.out.println("Turu Kazandýnýz...");
					System.out.println("");
					System.out.println("");
					
					kullanici += 2;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
				else if( pc == 2) {
					System.out.println("");
					System.out.println("");
					System.out.println("Tur Berabere Bitti...");
					
					kullanici ++;
					bilgisayar ++;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
				else {
					System.out.println("Turu Kaybettiniz...");
					System.out.println("");
					System.out.println("");
					
					bilgisayar += 2;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				
				}
				
				
			}
			else if ( kul == 3){
				
				if( pc == 1) {
					
					System.out.println("Turu Kaybettiniz...");
					System.out.println("");
					System.out.println("");
					
					bilgisayar += 2;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
				else if( pc == 2) {
					
					System.out.println("Turu Kazandýnýz...");
					System.out.println("");
					System.out.println("");
					
					kullanici += 2;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
				else {
					System.out.println("Tur Berabere Bitti...");
					System.out.println("");
					System.out.println("");
					
					kullanici ++;
					bilgisayar ++;
					
					System.out.println("Kullanýcý Puaný = " + kullanici + "Bilgisayar Puaný = " + bilgisayar);
				}
			}
			
				
				if (kullanici == 20) {
					System.out.println("Oyunu Kazandýnýz");
					break;
				}
				else if (bilgisayar == 20){
					System.out.println("Oyunu Kaybettiniz");
					break; 
					}
        
		



	}
}
}
