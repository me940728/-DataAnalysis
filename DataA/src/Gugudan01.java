
public class Gugudan01 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 3; i <= 8; i++) {
			if (i==3 || i==5) { // 3, 5�ܿ� [3��][5��] ǥ���ϴ� ��
				System.out.println("["+i+"��]"); // "" + ""�ϸ� ""������ ���� �����ٴ� ������ ���� 
			}
			for (j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}

}
