import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		// 讀入
		int run = scanner.nextInt();
		while (scanner.hasNextLine()) {
			for (int i = 0; i < run; i++) {
				int attendnumber = scanner.nextInt();// 參加遊戲人數
				double probability = scanner.nextDouble();// 代表擲一次骰子出現特定數的機率
				int people = scanner.nextInt();// 題目要求的第i人
				probability = (Math.pow(1 - probability, people - 1)) * probability
						/ (1 - Math.pow(1 - probability, attendnumber));// 公式Math元件
				System.out.println(probability);
			}
		}

	}
}
// float小數3位數以下2運算會不精確
// Scanner scanner = new Scanner(System.in);
// float num1 = scanner.nextFloat();
// float num2 = scanner.nextFloat();
// System.out.println(num1 * num2); // 0.1*0.1=0.010000001
// 四捨五入java寫法要做整數分割
