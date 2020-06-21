package Exten;

public class Overlod {
	
public static int sum(int a, int b) {
	return sum(a, b, 0, 0);
}

public static int sum(int a, int b, int c) {
	return sum(a, b, c, 0);
}

public static int sum(int a, int b, int c, int d) {
	int res = a+b+c+d;
	return res;
}
	
	public static void main(String[] args) {
		int res1=Overlod.sum(1, 2);
		int res2=Overlod.sum(1, 2, 3);
		int res3=Overlod.sum(1, 2, 3, 4);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
