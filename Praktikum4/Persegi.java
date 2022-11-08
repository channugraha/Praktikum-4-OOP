public class Persegi extends BangunDatar{
	
	private int sisi = 6;
	
	public float luas(){
		System.out.println("\nMenghitung Luas Persegi");
		System.out.println("Sisi = " + sisi);
		System.out.println("Luas Persegi = " + (sisi * sisi) + " cm\n");
			return 1;
	}
	
	public float keliling(){
		System.out.println("\nMenghitung Keliling Persegi");
		System.out.println("Sisi = " + sisi);
		System.out.println("Keliling Persegi = " + (4 * sisi) + " cm\n");
		return 1;
	}
}