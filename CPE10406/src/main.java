import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		// init
		int run = 0, count = 0, temp = 0;
		int[] x;
		
		Scanner scanner = new Scanner(System.in);

		// read
		run = scanner.nextInt();

		for (int i = 0; i < run; i++) {
			count = scanner.nextInt();
			x = new int[count];
			for (int j = 0; j < count; j++) {
				x[j] = scanner.nextInt();
			}
			for (int k = 0; k < count; k++) {//��ܱƧǥѤj�ƨ�p
				for (int l = k + 1; l < count; l++) {
					if (x[l] > x[k]) {//�ثeŪ�쪺�Ʀr>���eŪ�쪺�Ʀr,�h�洫
						temp = x[l];
						x[l] = x[k];
						x[k] = temp;
					}
				}

			}

			
			System.out.println(x[count / 2]);//��X���������,�]�����|�|�ˤ��J
			
		}
	}
}
