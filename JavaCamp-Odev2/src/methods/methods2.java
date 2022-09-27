package methods;

public class methods2 {

	public static void main(String[] args) {
		String mesaj = "Ýlknur";
		String yenimesaj = mesaj.substring(0,2);
		System.out.println(yenimesaj);
		
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5);
		System.out.println(toplam);
	}
	
	public static void add() {
		System.out.println("added");
	}
	public static void delete() {
		System.out.println("deleted");
	}
	public static void update() {
		System.out.println("updated");
	}
	
	public static int topla(int a, int b) {
		return a+b;
	}
	
	public static int topla2(int...sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}
}
