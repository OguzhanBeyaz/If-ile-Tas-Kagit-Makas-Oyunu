package TasKag�tMakas;

import java.util.Scanner;

public class TasKag�tMakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bilgi = new Scanner(System.in);
		
		int kullanici = 0;
		int bilgisayar = 0;
		
		System.out.println("Ta� Ka��t Makas Oyununa Ho� Geldiniz...");
		System.out.println("");
        System.out.println("");
        System.out.println("1. Ta�, 2. Ka��t, 3. Makas");
        System.out.println("");
        System.out.println("");
        while(true) {
        	
        	System.out.println("Se�im Yap�n�z =  = ");
        	int kul = bilgi.nextInt();
        	
			int pc = (int) (Math.random() * 3);
			
			
			if( kul == 1 ) {
				if( pc == 1) {
				  
					System.out.println("Tur Berabere Bitti...");
					System.out.println("");
					System.out.println("");
					
					kullanici ++;
					bilgisayar ++;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
				else if( pc == 2) {
					System.out.println("Turu Kaybettiniz...");
					
					bilgisayar += 2;
					
					System.out.println("");
					System.out.println("");
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
				else {
				
					System.out.println("Turu Kazand�n�z...");
					System.out.println("");
					System.out.println("");
					
					kullanici += 2;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				
				}
				
			}
			else if ( kul == 2) {
				
				if( pc == 1) {
		
					System.out.println("Turu Kazand�n�z...");
					System.out.println("");
					System.out.println("");
					
					kullanici += 2;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
				else if( pc == 2) {
					System.out.println("");
					System.out.println("");
					System.out.println("Tur Berabere Bitti...");
					
					kullanici ++;
					bilgisayar ++;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
				else {
					System.out.println("Turu Kaybettiniz...");
					System.out.println("");
					System.out.println("");
					
					bilgisayar += 2;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				
				}
				
				
			}
			else if ( kul == 3){
				
				if( pc == 1) {
					
					System.out.println("Turu Kaybettiniz...");
					System.out.println("");
					System.out.println("");
					
					bilgisayar += 2;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
				else if( pc == 2) {
					
					System.out.println("Turu Kazand�n�z...");
					System.out.println("");
					System.out.println("");
					
					kullanici += 2;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
				else {
					System.out.println("Tur Berabere Bitti...");
					System.out.println("");
					System.out.println("");
					
					kullanici ++;
					bilgisayar ++;
					
					System.out.println("Kullan�c� Puan� = " + kullanici + "Bilgisayar Puan� = " + bilgisayar);
				}
			}
			
				
				if (kullanici == 20) {
					System.out.println("Oyunu Kazand�n�z");
					break;
				}
				else if (bilgisayar == 20){
					System.out.println("Oyunu Kaybettiniz");
					break; 
					}
        
		



	}
}
}
