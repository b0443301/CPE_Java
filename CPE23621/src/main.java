import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1;; i++) {// 可以改成while(scanner.hasNextInt())可是要加一個i++給它計數
			Boolean isSequence = true;// 預設記錄是不是B2-Sequence(過三關的概念,只要如果經過以下判斷還是微true了話,它就是B2-Sequence)
			int input = scanner.nextInt();// 只有讀入input的值
			int[] arrInput = new int[input];// 開一個int陣列存讀入的值EX:1 2 4 8
			for (int j = 0; j < input; j++) {// 把讀入的陣列值存下來
				arrInput[j] = scanner.nextInt();
			}

			scanner.nextLine();// 讀了/n句子最後都有一個斜線n
			scanner.nextLine();// 讀空白那行

			// input = InputCalc(input);
			// main test = new main();

			for (int j = 0; j < input - 1; j++) {// 檢查輸入的值是否為遞增數列
				if (arrInput[j] >= arrInput[j + 1]) {// 如果前面的人比後面的人大
					isSequence = false;// 把它記錄成錯誤的
				}
			}
			// int[] note = new int[10000];

			if (isSequence) {
				ArrayList<Integer> List = new ArrayList<Integer>();
				for (int j = 0; j < input; j++) {// 目前自己的值
					for (int k = j; k < input; k++) {// 自己跟自己不能相加k=j+1,這題是自己不能跟前面的人相加(要跟從順序在自己之後的人相加),我後面的人的值
						List.add(arrInput[j] + arrInput[k]);
					}
				}
				Collections.sort(List);// 排序從小排到大
				// Collections.reverse(List);先小排到大之後再反轉變成由大變小
				for (int j = 0; j < List.size() - 1; j++) {// 用一個for迴圈排
					if (List.get(j) == List.get(j + 1)) {// 如果前面加的值跟後面相等的話,不需要加isSequence
															// =
															// true是因為只要判斷false的條件,;
						isSequence = false;// 紀錄成錯誤的
						break;
					}
				}
			}

			if (isSequence) {// 如果isSequence為true了話
				System.out.println("Case #" + i + " It is a B2-Sequence");
				System.out.println();
			} else {// 如果isSequence為false了話
				System.out.println("Case #" + i + " It is not a B2-Sequence");
				System.out.println();
			}
		}
	}

	static int InputCalc(int i) {
		return i * i;
	}
}
// if (arrInput[j] > arrInput[j + 1]) {
//
// }
