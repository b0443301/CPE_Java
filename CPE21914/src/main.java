
import java.util.ArrayList;
import java.util.Scanner;

//用Arraylist存資料
public class main {
	public static void main(String args[]) {
		int max = 0;
		ArrayList<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			if (input.equals("0"))// 電腦才有End Of File
				break;
			list.add(input);// 一行一行加入String的測資
		}
		// for (int i = 0; i < list.size(); i++) {
		// if (max < list.get(i).length()) {
		// max = list.get(i).length();
		// }
		// }
		for (String e : list) {// 用foreach遍歷找目前最大測資的長度
			if (max < e.length()) {
				max = e.length();
			}
		}
		// for (int i = 0; i < list.size(); i++) {
		//
		// }
		for (int i = 0; i < max; i++) {// 第幾格
			for (int j = list.size() - 1; j >= 0; j--) {// 測資在第幾行
				if (list.get(j).length() - 1 < i) {// 判斷第j行的長度<i(-1是湊出來因為陣列都是0開始算),判斷資料夠不夠長
					System.out.print(" ");// 不夠長印空白
				} else {
					System.out.print(list.get(j).charAt(i));// 拿第j行裡面第i格的字元,夠長印字元
				}
			}
			System.out.print("\n");
		}
		// for (String e : list) {
		// System.out.println(e);
		// }
	}
}
