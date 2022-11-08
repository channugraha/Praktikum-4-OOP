public class Lingkaran extends BangunDatar {
	private int r = 15;
	
	
	public float luas() {
		System.out.println("\nMenghitung Luas Lingkaran");
		System.out.println("r = " + r);	
		System.out.println("Luas Lingkaran = " + (3.14 * r * r ) + " cm^2\n");
			return 1;
	}
		
	public float keliling(){
		System.out.println("\nMenghitung Keliling Lingkaran");
		System.out.println("r = " + r);	
		System.out.println("Keliling Lingkaran = " + (2 * 3.14 * r) + " cm\n");
			return 1;
	}
}