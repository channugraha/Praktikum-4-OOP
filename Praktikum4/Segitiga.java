public class Segitiga extends BangunDatar{
	private int alas = 8;
	private int tinggi = 5;
	
	public float luas(){
		System.out.println("\nMenghitung Luas Segitiga");
		System.out.println("Alas = " + alas);
		System.out.println("Tinggi = " + tinggi);
		System.out.println("Luas Segitiga = " + (alas * tinggi / 2) + " cm\n");
			return 1;
	}
	
	public float keliling(){
		double sisi = Math.sqrt(alas*alas + tinggi*tinggi);
		System.out.println("\nMenghitung Keliling Segitiga");
		System.out.println("Alas = " + alas);
		System.out.println("Tinggi = " + tinggi);
		System.out.println("Keliling Segtiga = " + (sisi + tinggi + alas) + " cm\n");
		return 1;
	}
}