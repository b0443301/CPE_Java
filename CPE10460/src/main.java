import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		// int arr[];// ���w�@�Ӥj�p
		// ArrayList<Integer> array = new ArrayList<Integer>();// ��l�Ƥ@�ӵL�aArray
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int count = 0, sum1 = 0, sum2 = 0, ans = 0;
			String input = "";//string�O�@��arraylist�̭��O�schar������

			// read
			input = scanner.nextLine();//Ū�U�@��
			if (input.equals("0"))//string���۵��g�k
				break;

			// cal
			for (int i = 0; i < input.length(); i++) {//��string�ΰ}�C���覡,�@�Ӥ@��Ū�J
				if (i % 2 == 0)
					sum1 += input.charAt(i) - '0';//java�s���}�C�Ҧ�(�ⰸ��ƦX)string�ন�Ʀrascii
				else
					sum2 += input.charAt(i) - '0';//java�s���}�C�Ҧ�(��_��ƦX)
			}

			ans = Math.abs(sum2 - sum1);//�o�ˤ��Φb��sum2��sum1�j�p,�����۴�
			if (ans % 11 == 0) {
				System.out.println(input + " is a multiple of 11");
			}else{
				System.out.println(input + " is not a multiple of 11");
			}
		}
	}
}
