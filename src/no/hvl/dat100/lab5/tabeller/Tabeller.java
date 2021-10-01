package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("{");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i + 1 < tabell.length) {
				System.out.print(",");
			}
		}
		System.out.println("}");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tab = "[";
		for (int i = 0; i < tabell.length; i++) {
			tab += tabell[i];

			// legger til komma hvis flere elementer skal listes
			if (i + 1 < tabell.length) {
				tab += ",";
			}
		}
		tab += "]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
//		public static int summer2(int[] tabell) {
	//
//			int sum = 0;
//			int i = 0;
//			while (i < tabell.length ) {
//				sum += tabell[i]; }
//				return sum;
//		}

//		public static int summer3(int[] tabell) {
	//
//			int sum = 0;
//			for (int tall : tabell) {
//				sum += tall; }
//				return sum;
//		}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int i = 0;
		while (!finnes && i < tabell.length) {
			if (tabell[i] == tall)
				finnes = true;
			else
				i++;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int result = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				result = i;
				break;
			}
		}
		return result;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] revers = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			revers[i] = tabell[(tabell.length - 1) - i];
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;

		// flyttet i til en slik at man ikke begynner å teste på i = -1 i første runde
		// av while loop
		int i = 1;

		while (sortert && i < tabell.length) {
			if (tabell[i - 1] <= tabell[i])
				i++;
			else
				sortert = false;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length + j] = tabell2[j];
		}
		return nyTab;
	}

}