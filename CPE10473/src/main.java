import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {// 一直重複讀,計算,輸出
			int sum = 0;
			String input = scanner.nextLine();// String在java有陣列的概念在,不需要事先知道長度,多長的長度都可以用

			if (input.equals("0")) {// 字串的寫法equals,一定事true
				break;
			}

			if (input.length() == 1) {// 輸入值的長度為1時,EX:2
				sum = input.charAt(0) - '0';// 把字元轉成整數(String是字元組成)
			}

			while (input.length() != 1) {// 輸入值的長度不為1時,EX:11,47,則做以下的事while(判斷式為true才會進去以下程式),有if(判斷式)
				sum = 0;
				for (int i = 0; i < input.length(); i++)
					sum += input.charAt(i) - '0';
				input = String.valueOf(sum);// 把數字轉為字串
			}

			System.out.println(sum);// 輸出整數
		}
	}
}
