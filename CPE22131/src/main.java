import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		Boolean flag = true;// 當flag是true的時候,輸出''

		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			// if (input.equals("0")) {
			// break;
			// }
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '\"') {// input的字元是"的話
					// count++;
					// if (count % 2 == 1) {
					// System.out.print("``");
					// } else {
					// System.out.print("''");
					// }

					flag = !flag;// 判斷兩種狀態而已,不是真的對與錯的觀念,true是1,false是0,反轉(原本是true,到這行變成false)
					if (!flag) {// 當false的時候輸出``
						System.out.print("``");// 奇數次的輸出EX:第一次輸出,第三次輸出...
					} else {
						System.out.print("''");// 偶數次的輸出EX:第一次輸出,第三次輸出...
					}
				} else {
					System.out.print(input.charAt(i));// 輸出字元
				}
			}
			System.out.print('\n');// print可以輸出字串跟字元符,所以'答案輸出',"答案輸出"包起來都沒關西
		}
	}
}