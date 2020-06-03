
public class Gugudan01 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 3; i <= 8; i++) {
			if (i==3 || i==5) { // 3, 5단에 [3단][5단] 표시하는 곳
				System.out.println("["+i+"단]"); // "" + ""하면 ""내용을 서로 붙힌다는 뜻으로 이해 
			}
			for (j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}

}
