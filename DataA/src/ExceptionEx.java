
public class ExceptionEx {

	public static void main(String[] args) {
		int [] aa =new int[3];
		try {
			aa[2] = 100/0; // ���� ������ �ȴ�
			aa[3] = 100; // ���� ������ �ȴ�
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ÷�ڰ� �迭ũ�⺸�� Ů�ϴ�.");
		} catch (ArithmeticException e) { // ���� ���� 
			System.out.println("0���� ������ ���� ��������");
		} finally { // ������ ����
			System.out.println("�� �κ��� ������ ���Ϳ�");
		}
	}

}
