
public class Gugudan03 {

	public static void main(String[] args) {
		int [] a = new int [90];
		int i;
		int hap=0;
		for (i = 0; i < a.length; i++) { // <90 || <=89로 해도 된다.
			a[i] += i+11;
		}
		i=0;
		while (i<a.length) {
			hap +=a[i];
			System.out.println("a["+i+"]"+"="+a[i]);
			i++;
		}
		System.out.println(hap);
	}

}
