import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			int[] count1 = new int[26];// 計算第一筆測資字母出現次數
			int[] count2 = new int[26];// 計算第二筆測資字母出現次數
			String arrrun1 = scanner.nextLine();
			String arrrun2 = scanner.nextLine();

			for (int i = 0; i < arrrun1.length(); i++) {// 計算第一個測資字母次數有哪些用for迴圈遍利
				count1[arrrun1.charAt(i) - 'a']++;// 找出a的偏移量算出對應a-->arrrun1[0],b--->arrrun1[1],c-->arrrun1[2]
			}
			for (int i = 0; i < arrrun2.length(); i++) {// 計算第二個測資字母次數有哪些用for迴圈遍利
				count2[arrrun2.charAt(i) - 'a']++;// 找出a的偏移量算出對應a-->arrrun2[0],b--->arrrun2[1],c-->arrrun2[2]
			}
			for (int i = 0; i < 26; i++) {// 比對兩組測資(a~z)26筆
				if (count1[i] > 0 && count2[i] > 0) {// 當兩筆資料都存在的時候,不能==1式因為有可能有2,3,4
					System.out.print(Character.toChars(i + 'a'));// 對應位置索引轉成字元
				}
			}
			System.out.print('\n');// 換行
		}
	}
}
