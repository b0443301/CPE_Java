import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i < input; i++) {
			Boolean isMatrix = true;
			// String[] matrix=new String[100];
			String matrix = scanner.nextLine();// �Φr��Ū�J
			String[] matrixSplit = matrix.split(" ");// �b�Ϊťհ�����
			int matrixSize = Integer.parseInt(matrixSplit[2]);// �u�n���X���Ϋ�matrixSplit[2]���ƭ�EX:3��r���ର�Ʀr

			int[][] matrixArray = new int[matrixSize][matrixSize];// Ū�J�x�}���Ʀr
			for (int j = 0; j < matrixSize; j++) {
				for (int k = 0; k < matrixSize; k++) {
					matrixArray[j][k] = scanner.nextInt();
				}
			}
			scanner.nextLine();// ��׽un/n�M��,�]���q���̫�Ū��1�᭱��/n

			Loop1: for (int j = 0; j < matrixSize; j++) {
				Loop2: for (int k = 0; k < matrixSize; k++) {// �P�_�u�n���@�Ӥ������b��٦�m�W�Ʀr���۵�,�Ψ�̳��p��0����
					if (matrixArray[j][k] != matrixArray[matrixSize - 1 - j][matrixSize - 1 - k]
							|| matrixArray[j][k] < 0 || matrixArray[matrixSize - 1 - j][matrixSize - 1 - k] < 0) {
						isMatrix = false;// �⥦�O���U��,���O�j��
						// isMatrix =
						// !isMatrix;(���Эק窱�A���覡,���A�|��^��)

						// System.out.println("Test #" + i + "Non-:Symmertric");
						break Loop1;// �������X�j��,�����F�]���D��ٯx�}
					}
				}
			}

			if (isMatrix) {// ��Boolean�P�_���A,�p�G�O��ٯx�}����
				System.out.println("Test #" + i + ": Symmertric.");
			} else {
				System.out.println("Test #" + i + " Non-:Symmertric.");
			}
		}
	}
}