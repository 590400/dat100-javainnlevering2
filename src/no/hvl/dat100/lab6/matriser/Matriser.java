package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String args[]) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { {10,11,12}, {13,14,15}, {16,17,18} };
		skrivUt(a, true);
		System.out.println();
		a = multipliser(a , b);
		skrivUt(a, true);
	}

	// a)
	public static void skrivUt(int[][] matrise, boolean brukNøsted) {
		if (brukNøsted == true) {
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

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				matrise[i][j] = matrise[i][j] * tall;
			}
		}
		return matrise;
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
	public static int[][] speile(int[][] matrise) {

		int[][] tmp = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {


				tmp[i][j] = matrise[j][i];
			}
		}
		return tmp;
		
		//skjønner fortsatt ikke hvorfor denne ikke blir riktig i junit test

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] tmp = new int[a.length][b[0].length];
		int hold = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b.length) System.out.println("lengden på matisene passer ikke sammen");
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < b.length; k++) {
					hold += a[i][k] * b [k][j];
				}
				tmp[i][j] = hold;
				hold = 0;
			}
		}


	return tmp;
	//jeg har en galakse hjerne
	}
}
