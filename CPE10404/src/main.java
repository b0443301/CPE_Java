import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		// init

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int[] arr1;
			int[] arr2;
			int num1 = 0, num2 = 0, temp = 0, count1 = 1, count2 = 1;
			int carry = 0;
			
			
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			
			if(num1==0 && num2==0){
				break;
			}

			temp = num1;
			while (true) {
				temp = temp / 10;
				count1++;
				if (temp == 0)
					break;
			}
			temp = num2;
			while (true) {
				temp = temp / 10;
				count2++;
				if (temp == 0)
					break;
			}

			arr1 = new int[count1];
			for (int i = 0; i < count1; i++) {
				arr1[i] = num1 % 10;
				num1 = num1 / 10;
			}
			arr2 = new int[count2];
			for (int i = 0; i < count2; i++) {
				arr2[i] = num2 % 10;
				num2 = num2 / 10;
			}

			if (count1 > count2)
				count1 = count2;

			for (int i = 0; i < count1; i++) {
				arr1[i] += arr2[i];
				if (arr1[i] >= 10) {
					arr1[i] -= 10;
					carry++;
					arr1[i + 1]++;
					
				}
			}
			System.out.println(carry);
		}
	}
}
