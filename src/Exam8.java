
public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		int[][] num = new int[3][4];// = {{1,2,3}};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = i * j + 5;
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("num[" + i + "][" + j + "]=" + num[i][j] + " , ");
				if (j == num[i].length - 1) {
					sum += num[i][j];
				}
			}
		}
//2
		System.out.println();
		System.out.println("sum is " + sum);
	}

}
