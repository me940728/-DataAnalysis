import java.util.Scanner;

public class MethExer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res;
		int oper, a, b;
		
		System.out.println("��� �Է�(1:+, 2:-, 3:*, 4:/) : ");
		oper=sc.nextInt();
		
		System.out.println("ù��° ���� �Է� : ");
		a=sc.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		b=sc.nextInt();
		
		res=culc(a,b,oper);
		System.out.printf("��� ����� : %d\n",res);
		}
	public static int culc(int v1, int v2, int op) {
		int result;
		switch (op) {
		case 1:
			result=v1+v2; break;
		case 2:
			result=v1-v2; break;
		case 3:
			result=v1*v2; break;
		case 4:
			result=v1/v2; break;
		default: result=0; break;
		}
		return result;
	}
}
