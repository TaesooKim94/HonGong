package basic1;

import java.text.SimpleDateFormat;
import java.util.Date;

// # Wrapper(포장) 클래스
// 자바는 기본타입(byte,char,short,int,long,float,double,boolean)의 값을 갖는 객체를 생성할 수 있다
// 기본타입의 값을 내부에서 포장함
// 포장 객체의 특징은 포장하고 있는 기본 타입 값은 외부에서 변경할 수 없다.
// 만약 내부의 값을 변경하고 싶다면 새로운 포장 객체를 만들어야 한다.
// 중요!!!)
// 포장 객체는 주로 컬렉션 프레임워크에서 기본 타입 값을 객체로 생성해서 관리할 때 사용된다.

// 1.박싱(Boxing): 기본 타입의 값을 포장 객체로 만드는 과정
// 2.언박싱(Unboxing): 포장객체에서 기본 타입의 값을 얻어내는 과정
// ex)
// Byte obj=new Byte(10);
// Character obj=new Character('가');
// Short obj=new Short(100);
// Boolean obj=new Boolean(true);
// 생성자를 사용하지 않아도 각 포장 클래스마다 가지고 있는 정적 valueOf() 메소드를 사용할 수도 있다.
// Integer obj=Integer.valueOf(1000);
// Integer obj=Integer.valueOf("1000");

// #포장객체에서 다시 기본타입의 값을 얻어내는 방법(언박싱)
// byte num=obj.byteValue();
// char num=obj.charValue();
// short num=obj.shortValue();

public class srcU {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(date));
	}

}
