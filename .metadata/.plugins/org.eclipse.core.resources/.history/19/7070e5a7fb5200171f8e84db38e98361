import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		// int arr[];// 給定一個大小
		// ArrayList<Integer> array = new ArrayList<Integer>();// 初始化一個無窮Array
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int count = 0, sum1 = 0, sum2 = 0, ans = 0;
			String input = "";//string是一種arraylist裡面是存char的概念

			// read
			input = scanner.nextLine();//讀下一行
			if (input.equals("0"))//string的相等寫法
				break;

			// cal
			for (int i = 0; i < input.length(); i++) {//把string用陣列的方式,一個一個讀入
				if (i % 2 == 0)
					sum1 += input.charAt(i) - '0';//java存的陣列模式(算偶位數合)string轉成數字ascii
				else
					sum2 += input.charAt(i) - '0';//java存的陣列模式(算奇位數合)
			}

			ans = Math.abs(sum2 - sum1);//這樣不用在比sum2跟sum1大小,直接相減
			if (ans % 11 == 0) {
				System.out.println(input + " is a multiple of 11");
			}else{
				System.out.println(input + " is not a multiple of 11");
			}
		}
	}
}
