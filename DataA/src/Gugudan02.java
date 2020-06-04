
public class Gugudan02 {

	public static void main(String[] args) {
		int i;
		int j;
		i=3;
		j=1;
		while(i<=8) {
			if (i == 3 || i == 5) {
				System.out.println("["+i+"´Ü]");
			}
			while (j<=9) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
	}

}
