import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		// read
		while (scanner.hasNextInt()) {// �s���J
			// int[] arr;
			int countmax = 0;// �M��,��l�Ƽg��ϰ��ܼ�
			int num1 = scanner.nextInt();// �ߺD�g�ϰ��ܼ�
			int num2 = scanner.nextInt();
			// arr = new int[num2 - num1 + 1];// arr[]�}�Ŷ�����,���D���h�֭ӭ�
			if (num2 < num1) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			// calc
			for (int i = num1; i <= num2; i++) {
				int ans = i;
				int count = 1;
				while (ans != 1) {
					if (ans % 2 == 1) {
						ans = (ans * 3) + 1;
						count++;
					} else {
						ans = ans / 2;
						count++;
					}
				}
				if (countmax < count)// �O���̤j��,���pŪ�i�Ӫ���ڤ��e�O�����̤j���٭n�j,�h�s�ثeŪ�쪺�̤j��
					countmax = count;

				// arr[i - num1] = count;// �qarr[0]�}�lŪ,��Ū�쪺�Ȧs�U��,��Ӧb��L�d�̤߳j��
			}

			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
			System.out.print(countmax);

			// int max = 0;
			// for (int j = 0; j < num2 - num1 + 1; j++) {
			// if (max < arr[j]) {// �O���̤j��,���pŪ�i�Ӫ���ڤ��e�O�����̤j���٭n�j,�h�s�ثeŪ�쪺�̤j��
			// max = arr[j];
			// }
			// }
			// System.out.print(num1);
			// System.out.print(num2);
			// System.out.print(max);
		}
	}
}