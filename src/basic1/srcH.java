package basic1;

// # 중첩 클래스의 접근 제한
// 멤버 클래스 내부에서 바깥 클래스의 필드와 메소드에 접근할 때는 제한이 따른다.
// 또한 메소드의 매개 변수나 로컬 변수를 로컬 클래스에서 사용할 때도 제한이 따른다.

// 1.인스턴스 멤버 클래스 => 바깥 클래스의 인스턴스 필드의 초기값이나 인스턴스 메소드에서 객체를 생성할 수 있으나,
//					  정적 필드의 초기값이나 정적 메소드에서는 객체를 생성할 수 없다
// 반면에
// 2.정적 멤버 클래스 => 모든 필드의 초기값이나 모든 메소드에서 객체를 생성할 수 있다.

// 1.인스턴스 멤버 클래스 안에서는 바깥 클래스의 모든 필드와 모든 메소드에 접근할 수 있지만
// 2.정적 멤버 클래스 안에서는 바깥 클래스의 정적필드와 메소드에만 접근할 수 있고, 인스턴스 필드와 메소드에는 접근할 수 없다.

// # 중첩 클래스에서 바깥 클래스 참조 얻기
// 클래스 내부에서 this는 객체 자신의 참조이다
// 중첩 클래스에서 this 키워드를 사용하면 바깥 클래스의 객체 참조가 아니라, 중첩 클래스의 객체 참조가 된다
// 중첩 클래스 내부에서 바깥 클래스의 객체 참조를 얻으려면 바깥 클래스의 이름을 this 앞에 붙여준다
// ex) 바깥클래스.this.필드     바깥클래스.this.메소드()

class Outter
{
	String field="Outter-field";
	
	void method()
	{
		System.out.println("Outter-method");
	}
	
	class Nested
	{
		String field="Nested-field";;
		void method()
		{
			System.out.println("Nested-method");
		}
		
		void print()
		{
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
public class srcH {

	public static void main(String[] args) {
		Outter outter=new Outter();
		Outter.Nested nested=outter.new Nested();
		nested.print();
	}

}
