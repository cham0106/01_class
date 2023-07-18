package class_;

class Person{
	private	String name; //필드, 초기화(null)
	private	int age;	//필드, 초기화(0)
	
	public void setName(String n) {//private인데 받겠다setter //밑에 홍길동은 문자열이기때문에 setter안에 String 선언
		name = n;
	}
	public void setAge(int i) {
		age = i;
	}
	public void setData(String n, int i) { //하나의 클래스에 똑같은 이름이 2개면 오버로딩 이라고함
		name = n;
		age = i;
	}
	public void setData(){
		
	}
	public String getName(){ //출력하기 위한 반환getter
		return name; //string 형이 return이라 public String 붙혀줌
	}
	public int getAge(){ //반환getter
		return age; //int 형이 return
	}

} //여기까진 메뉴판
//--------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa = new Person();
		aa.setName("홍길동"); //호출
		aa.setAge(25);
		System.out.println("객체 aa=" +aa);
		System.out.println(aa.getName()+ "\t" + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		bb.setName("라이언");
		bb.setAge(30);
		System.out.println("객체 bb=" +bb);
		System.out.println(bb.getName()+"\t"+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("코난", 35);
		System.out.println("객체 cc=" +cc);
		System.out.println(cc.getName()+"\t"+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData(); //괄호 안에 인자가 없으면 위에서 선언햇던 setData 사용불가 따라서 새로 만들어야함
		System.out.println("객체 dd=" +dd);
		System.out.println(dd.getName()+"\t"+dd.getAge());//dd는 초기화값
		System.out.println();
	}

}
