import java.util.Scanner;
//set也是linklist的一種
public class main {
	public static void main(String arg[]) {

		String alphet = "`123456789-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";// 查表法
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();// 讀一行測資句子

		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {// 搜尋測資長度
			char temp = input.charAt(i);// 把測資它的位置存下來
			for (int j = 0; j < alphet.length(); j++) {// j從0開始,因為要遍利所有人要跟外層i一樣,兩條陣列都要開始跑
				if (temp == alphet.charAt(j)) {// 如果測資數值跟查表的數值相同
					System.out.print(alphet.charAt(j - 2));// 就輸出查表位移減二
					break;// 加break比較快,一找到k就直接輸出
				} else if (temp == ' ') {
					System.out.print(temp);
					break;
				}
			}
		}
	}
}
