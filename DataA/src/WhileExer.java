import java.io.IOException;
import java.util.Scanner;

public class WhileExer {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int a,b;
		char ch;
		
		while (true) {
			System.out.printf("����� ù ��° �� �Է� : ");
			a = scn.nextInt();
			System.out.printf("����� �� ��° �� �Է� : ");
			b = scn.nextInt();
			System.out.printf("����� ������ �Է� : ");
			ch = (char)System.in.read();
			
			
			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d�Դϴ�.\n",a,b,a+b);
				break;
			case '-':
				System.out.printf("%d - %d = %d�Դϴ�.\n",a,b,a-b);
				break;
			case '*':
				System.out.printf("%d * %d = %d�Դϴ�.\n",a,b,a*b);
				break;
			case '/':
				System.out.printf("%d / %d = %d�Դϴ�.\n",a,b,a/b);
				break;
			case '%':
				System.out.printf("%d %% %d = %d�Դϴ�.\n",a,b,a%b);
				break;

			default:
				break;
			}
		}
	}

}
