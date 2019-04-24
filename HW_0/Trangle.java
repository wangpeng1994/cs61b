public class Trangle {
	public static void main(String[] args) {
		int SIZE = 10;
		int row = 0;
		int col = 0;
		while (SIZE > 0) {
			row = row + 1;
			col = row;
			while (col > 0) {
				System.out.print('*');
				col = col - 1;
			} 

			System.out.println();
			SIZE = SIZE - 1;
		}
	}
}
