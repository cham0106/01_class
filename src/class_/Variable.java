package class_;

public class Variable {
	//int b;    메인이랑 변수가 같아도 전역변수라서 에러 없음 단 static없으면 밑에서 출력못함 // 필드라고함, 초기화(0가지고있음)
	static int b;
	static double c;
	int d; //static 없으면 메인에서 출력할때 new 사용해야함
	public static void main(String[] args) {
		//지역변수 (Local variable)
		short a = 65; //메모리가 2바이트 짜리 2byte = 16bit
		int b = 65 ; //메모리가 4바이트 짜리
		
		System.out.println("지역변수 a=" +a);
		System.out.println("지역변수 b=" +b);
		
		System.out.println("필드 b=" + Variable.b); //클래스 전역변수 값을 출력하려면 클래스명.변수
		System.out.println("필드 c=" + c);  //지역변수에는 c가 없으므로 클래스명 안써도 전역변수 c를 가져옴
		//System.out.println("필드 d=" + new Variable().d); //위에 전역변수 int d 해서(static안함) 출력하려면 new Variable().d
		
		Variable v = new Variable(); //생성, 주소가 v//이렇게된 형태는(변수생성x 객체생성o)
		System.out.println("객체 v="+v); 
		System.out.println("필드 d=" + v.d); //v주소 안에(클래스) 있는 d값을 출력
	}
}
