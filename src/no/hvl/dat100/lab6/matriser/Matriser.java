package no.hvl.dat100.lab6.matriser;

public class Matriser {


	// a)
	public static void skrivUt(int[][] matrise, boolean brukN�sted) {
		if (brukN�sted == true) {
			for (int a[] : matrise) {
				for (int b : a) {

					System.out.print(b + "\t");
				}
				System.out.println();
			}
		}

		else {
			for (int i = 0; i < matrise.length; i++) {

				for (int j = 0; j < matrise[i].length; j++) {
					System.out.print(matrise[i][j] + "\t");
				}
				System.out.println();

			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String a = "";
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[0].length; j++) {
				a += matrise[i][j] + " ";
			}
			a += "\n";
		}
		return a;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] tmp = matrise;
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				tmp[i][j] = matrise[i][j] * tall;
			}
		}
		return tmp;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] != b[i][j]) {
						erLik = false;
					}
				}
			}
		} else
			erLik = false;

		return erLik;
	}

	
	// e)
	public static int[][] speile(int[][] c) {

		int[][] tmp = new int[c.length][c[0].length];

		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c[i].length; j++) {

				tmp[i][j] = c[j][i];
			}
		}
		return tmp;

		// skj�nner fortsatt ikke hvorfor denne ikke blir riktig i junit test (grrrrrrrr)

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] tmp = new int[a.length][b[0].length];
		int hold = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b.length)
				System.out.println("lengden p� matisene passer ikke sammen");
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < b.length; k++) {
					hold += a[i][k] * b[k][j];
				}
				tmp[i][j] = hold;
				hold = 0;
			}
		}

		return tmp;
		// jeg har en galakse hjerne
	}
}
