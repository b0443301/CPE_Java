import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		// Ū�J
		int run = scanner.nextInt();
		while (scanner.hasNextLine()) {
			for (int i = 0; i < run; i++) {
				int attendnumber = scanner.nextInt();// �ѥ[�C���H��
				double probability = scanner.nextDouble();// �N���Y�@����l�X�{�S�w�ƪ����v
				int people = scanner.nextInt();// �D�حn�D����i�H
				probability = (Math.pow(1 - probability, people - 1)) * probability
						/ (1 - Math.pow(1 - probability, attendnumber));// ����Math����
				System.out.println(probability);
			}
		}

	}
}
// float�p��3��ƥH�U2�B��|����T
// Scanner scanner = new Scanner(System.in);
// float num1 = scanner.nextFloat();
// float num2 = scanner.nextFloat();
// System.out.println(num1 * num2); // 0.1*0.1=0.010000001
// �|�ˤ��Jjava�g�k�n����Ƥ���