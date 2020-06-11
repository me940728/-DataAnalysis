import java.io.IOException;
import java.util.Scanner;

public class WhileExer {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int a,b;
		char ch;
		
		while (true) {
			System.out.printf("계산할 첫 번째 수 입력 : ");
			a = scn.nextInt();
			System.out.printf("계산할 두 번째 수 입력 : ");
			b = scn.nextInt();
			System.out.printf("계산할 연산자 입력 : ");
			ch = (char)System.in.read();
			
			
			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d입니다.\n",a,b,a+b);
				break;
			case '-':
				System.out.printf("%d - %d = %d입니다.\n",a,b,a-b);
				break;
			case '*':
				System.out.printf("%d * %d = %d입니다.\n",a,b,a*b);
				break;
			case '/':
				System.out.printf("%d / %d = %d입니다.\n",a,b,a/b);
				break;
			case '%':
				System.out.printf("%d %% %d = %d입니다.\n",a,b,a%b);
				break;

			default:
				break;
			}
		}
	}

}
