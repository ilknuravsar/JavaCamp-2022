package methods;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5 };
		int aranacak = 4;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi)

		{
			System.out.println("Say� Var" +aranacak);
		} else {
			System.out.println("Say� Yok" +aranacak);
		}
	}
	
	 
}
