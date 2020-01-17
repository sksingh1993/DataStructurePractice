package poc.hack;

public class QueenAttack {
	public static int count = 0;
	public static int p = 2;
	public static int q = 4;
	public static final int[][] mat = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13, 14, 15, 16 },
			{ 17, 18, 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30, 31, 32 }, { 33, 34, 35, 36, 37, 38, 39, 40 },
			{ 41, 42, 43, 44, 45, 46, 47, 48 }, { 49, 50, 51, 52, 53, 54, 55, 56 },
			{ 57, 58, 59, 60, 61, 62, 63, 64 }, };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMat();
		printUp(4, 4);
		printDown(4, 4);
		printLeft(4, 4);
		printRight(4, 4);
		printFirstQd(4, 4);
		printSecondQd(4, 4);
		printThirdQd(4, 4);
		printFourthQd(4, 4);
		System.out.println(count);
		

		

		//printFirstQd(4, 4);

	}

	public static void printUp(int x, int y) {
		int i = x - 1;
		while (i >= 0) {
			if (i == p && y == q) {
				break;
			}
			// System.out.println(mat[i][y]);
			count++;
			i--;
		}
	}

	public static void printDown(int x, int y) {
		int i = x + 1;
		while (i < mat.length) {
			if (i == p && y == q) {
				break;
			}
			// System.out.println(mat[i][y]);
			count++;
			i++;
		}
	}

	public static void printRight(int x, int y) {
		int i = y + 1;
		while (i < mat.length) {
			if (x == p && i == q) {
				break;
			}
			// System.out.println(mat[x][i]);
			count++;
			i++;
		}
	}

	public static void printLeft(int x, int y) {
		int i = y - 1;
		while (i >= 0) {
			if (x == p && i == q) {
				break;
			}
			// System.out.println(mat[x][i]);
			count++;
			i--;
		}
	}

	public static void printFirstQd(int x, int y) {
		int i = x - 1;
		int j = y + 1;
		while (i >= 0 && j < mat.length) {
			if (i == p && j == q) {
				break;
			}
			//System.out.println(mat[i][j]);
			count++;
			i--;
			j++;
		}

	}

	public static void printSecondQd(int x, int y) {
		int i = x + 1;
		int j = y + 1;
		while (i < mat.length && j < mat.length) {
			if (i == p && j == q) {
				break;
			}
			// System.out.println(mat[i][j]);
			count++;
			i++;
			j++;
		}

	}

	public static void printThirdQd(int x, int y) {
		int i = x + 1;
		int j = y - 1;
		while (i < mat.length && j >= 0) {
			if (i == p && j == q) {
				break;
			}
			// System.out.println(mat[i][j]);
			count++;
			i++;
			j--;
		}

	}

	public static void printFourthQd(int x, int y) {
		int i = x - 1;
		int j = y - 1;
		while (i >= 0 && j >= 0) {
			if (i == p && j == q) {
				break;
			}
			count++;
			// System.out.println(mat[i][j]);
			i--;
			j--;
		}

	}

	public static void printMat() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}

}
