
//用map的寫法,用linklist寫法
import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int run = Integer.parseInt(scanner.nextLine());// 讀到2/n也算一行(整行讀進來,避免接下來讀入會出錯)
		String arrrun = "";
		int[] count = new int[26];// 儲存讀到字母次數
		char[] alphet = new char[26];// 儲存字母A~Z
		// read
		for (int i = 0; i < run; i++) {// 連續讀入測資arrrun的兩行資料EX:To be or not to be.I think, therefore I am.
			
			arrrun += scanner.nextLine();
		}

		// count
		arrrun = arrrun.toUpperCase();//先把全部讀進來的資料小寫轉大寫
		for (int i = 0; i < arrrun.length(); i++) {//把句子裡的字母一個一個讀
			if (arrrun.charAt(i) >= 'A' && arrrun.charAt(i) <= 'Z') {//如果是在0~25的範圍內,因為把'A'對應為第一個位置索引數字0,'Z'對應為第25個位置索引數字25
				count[arrrun.charAt(i) - 'A']++;//如果數字在0~25的範圍內存到count陣列然後加1;
			}
		}
		for (int i = 0; i < 26; i++) {
			alphet[i] = (char) (i + 'A');//把數字0轉為字母儲存在字母第幾個位置上,強轉型為字母
		}

		// sort
		for (int i = 0; i < 26; i++) {
			for (int j = i + 1; j < 26; j++) {
				if (count[i] < count[j]) {//目前計算的數字比之前儲存的數字還要大時,則交換
					int temp = count[i];//目前計算的數字跟之前儲存的數字做交換,確保大的數在前面
					count[i] = count[j];
					count[j] = temp;

					temp = alphet[i];//字母因為跟著計數器(計算次數)所以也要跟著交換
					alphet[i] = alphet[j];
					alphet[j] = (char) (temp);
				} else if (count[i] == count[j] && alphet[i] > alphet[j]) {//如果出現相同次數,而且之前的字母排序比的目前讀到的字母排序還要大時,則交換,確保輸出排列較前字母
					int temp = count[i];//目前計算的數字跟之前儲存的數字做交換,確保大的數在前面
					count[i] = count[j];
					count[j] = temp;

					temp = alphet[i];//字母因為跟著計數器(計算次數)所以也要跟著交換
					alphet[i] = alphet[j];
					alphet[j] = (char) (temp);
				}
			}
		}

		// output
		for (int i = 0; i < 26; i++) {// 輸出
			if (count[i] != 0)// 如果計算字母數字不為0時
				System.out.println(Character.toString(alphet[i]) + " " + count[i]);// 輸出字母(正常轉型)和計算字母次數
		}
	}
}
