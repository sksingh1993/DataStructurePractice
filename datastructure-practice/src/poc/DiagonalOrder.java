package poc;

public class DiagonalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, };
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i][0] + ",");
			int j = i - 1;
			int k = 1;
			while (!(j < 0 || j >= 5 || k >= 5 || k < 0)) {
				System.out.print(a[j][k] + ",");
				j--;
				k++;
			}
			System.out.println();
		}

		for (int i = 1; i < 5; i++) {
			System.out.print(a[5 - 1][i] + ",");
			int j = 5 - 2;
			int k = i + 1;
			while (!(j < 0 || j >= 5 || k >= 5 || k < 0)) {
				System.out.print(a[j][k] + ",");
				j--;
				k++;
			}
			System.out.println();
		}

	}

}
