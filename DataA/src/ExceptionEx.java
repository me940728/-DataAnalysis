
public class ExceptionEx {

	public static void main(String[] args) {
		int [] aa =new int[3];
		try {
			aa[2] = 100/0; // 여기 실행이 안댐
			aa[3] = 100; // 여기 실행이 안댐
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 첨자가 배열크기보다 큽니다.");
		} catch (ArithmeticException e) { // 여기 실행 
			System.out.println("0으로 나누는 등의 오류에요");
		} finally { // 무조건 실행
			System.out.println("이 부분은 무조건 나와요");
		}
	}

}
