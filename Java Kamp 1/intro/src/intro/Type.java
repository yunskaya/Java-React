package intro;

public class Type {
	public static void main(String[] args) {

	// Deger Tip
	int sayi1 = 10;
	int sayi2 = 20;
	
	sayi1 = sayi2;
	sayi2 = 100;
	System.out.println(sayi1);
	
	// Referans Tip
	int[] sayilar1 = {1,2,3,4,5};
	int[] sayilar2 = {10,20,30,40,50};
	
	sayilar1 = sayilar2;
	sayilar2[0] = 100;
	System.out.println(sayilar1[0]);
	
	// Referans tiplerde "String"ler "Deger Tip" gibi davranir.
	String sehir1 = "Ankara";
	String sehir2 = "istanbul";
	sehir1 = sehir2;
	sehir2 = "izmir";
	System.out.println(sehir1);
	
	}
}
