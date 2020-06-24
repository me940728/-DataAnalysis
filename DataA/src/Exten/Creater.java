package Exten;

public class Creater {
// 생성자 연습
	Creater(){
		System.out.println("나는 기본 메모리 올림");
	}
	Creater(String pName){
		System.out.println("나는 변경");
	}
	public static void main(String[] args) {
		Creater ca = new Creater("ㅗ");
	}
}
