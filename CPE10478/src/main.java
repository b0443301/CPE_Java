import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i < input; i++) {
			Boolean isMatrix = true;
			// String[] matrix=new String[100];
			String matrix = scanner.nextLine();// 用字串讀入
			String[] matrixSplit = matrix.split(" ");// 在用空白做切割
			int matrixSize = Integer.parseInt(matrixSplit[2]);// 只要拿出切割後matrixSplit[2]的數值EX:3把字串轉為數字

			int[][] matrixArray = new int[matrixSize][matrixSize];// 讀入矩陣的數字
			for (int j = 0; j < matrixSize; j++) {
				for (int k = 0; k < matrixSize; k++) {
					matrixArray[j][k] = scanner.nextInt();
				}
			}
			scanner.nextLine();// 把斜線n/n清除,因為電腦最後讀到1後面的/n

			Loop1: for (int j = 0; j < matrixSize; j++) {
				Loop2: for (int k = 0; k < matrixSize; k++) {// 判斷只要有一個元素不在對稱位置上數字不相等,或兩者都小於0的話
					if (matrixArray[j][k] != matrixArray[matrixSize - 1 - j][matrixSize - 1 - k]
							|| matrixArray[j][k] < 0 || matrixArray[matrixSize - 1 - j][matrixSize - 1 - k] < 0) {
						isMatrix = false;// 把它記錄下來,不是迴圈
						// isMatrix =
						// !isMatrix;(反覆修改狀態機方式,狀態會改回來)

						// System.out.println("Test #" + i + "Non-:Symmertric");
						break Loop1;// 直接跳出迴圈,不做了因為非對稱矩陣
					}
				}
			}

			if (isMatrix) {// 用Boolean判斷狀態,如果是對稱矩陣的話
				System.out.println("Test #" + i + ": Symmertric.");
			} else {
				System.out.println("Test #" + i + " Non-:Symmertric.");
			}
		}
	}
}
