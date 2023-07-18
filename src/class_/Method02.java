package class_;

public class Method02 {

	public static void main(String[] args) {
		Method02 m = new Method02();
		
		int s1 = m.sum(25,36);//호출
		System.out.println("합 = " + s1);
		int s2 = m.sub(25,36);//호출
		System.out.println("차 = " + s2);
		int s3 = m.mul(25,36);//호출
		System.out.println("곱 = " + s3);
		double s4 = m.div(25,36);//호출
		//System.out.println("몫 = " + s4);
		System.out.println("몫 = " + String.format("%.3f", s4)); //0.694 //%5.3f = 전체 5자리에서 소수점이하 3자리만 나오게할거라는 형식임
		//%10.3f로 하면 앞에 공백으로 띄어쓰기 후 출력하게됨 //.앞에는 없어도 자릿수 맞춰주기때문에 . 뒤에 소수점이하 자리만 맞춰주면됨
	}

	public int sum(int a, int b) { //괄호 안에있는 것은 인수라고 함 //인수는 개별 선언해야함 // return에서 int형이 반환되기에 public뒤에 int
		return a+b; //리턴값이 m.sum에 들어가고 s1에 저장됨
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public double div(int a, int b) {
		return (double)a / b; //잠깐 강제로 형변환을 하는 방법 (Cast 연산)
	}
	
}
