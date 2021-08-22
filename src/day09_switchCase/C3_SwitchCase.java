package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
		Scanner scan = new Scanner(System.in);

		System.out.println("bir gün adı soyle hadi durma");

		String gunAdi = scan.next().toLowerCase();

		switch (gunAdi) {
		case "Pazartesi":
		case "Sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("girdiginiz gun haftaici");

			break;

		case "cumartesi":
		case "pazar":
			System.out.println("das ist wochenende");

			break;
		default:
			System.out.println("duzgun bi gun ismi gir");
		}

	}

}
