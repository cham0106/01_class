package class_;

public class Method01 {
	public static void disp() { ////이함수는 이렇게 생겼다고 함/구현
		System.out.println("static method...");
	}
	
	public void output() { ////이함수는 이렇게 생겼다고 함/구현
		System.out.println("non-static method...");
	}
	
	public static void main(String[] args) { //자바는 메인만 반응함 //메인에서 호출해줘야함
		Method01.disp();//호출
		
		Method01 v = new Method01();//static 없이 구현한 클래스를 출력하는법
		v.output(); // static 없이 구현한 클래스를 출력하는법
	}
}
