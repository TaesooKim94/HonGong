package basic1;

import java.util.HashMap;

// 중요!!!!)
// hashCode()값이 같고, equals()가 true이어야 동등한 객체로 판단된다.

// # 객체 해시코드 hashCode()
// => 객체를 식별하는 하나의 정수값
// Object 클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문에
// 객체마다 다른 값을 가지고 있다.
// 논리적 동등 비교시 hashCode()를 오버라이딩할 필요가 있는데
// 13장에서 배울 컬렉션 프레임워크에서 HashSet, HashMap, Hashtable은 다음과 같은 방법으로 두 객체가 동등한지 비교한다.

// 우선 hashCode() 메소드를 실행해서 리턴된 해시코드 값이 같은지를 본다.
// 해시코드 값이 다르면 다른 객체로 판단하고, 해시코드 값이 같으면 equals() 메소드로 다시 비교한다.
// 그렇기 때문에 hashCode() 메소드가 true가 나와도 equals()의 리턴값이 다르면 다른 객체가 된다.

class Key
{
	public int number;
	
	Key(int number)
	{
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Key)
		{
			Key key=(Key)obj;
			
			if(number==key.number)
				return true;
		}
		
		return false;
	}

	// hashCode()의 리턴값을 number 필드값으로 했기 때문에 저장할 때의 new Key(1)과 
	// 읽을 때의 new Key(1)로 같은 해시코드가 리턴된다.
	// 저장할 때의 new Key(1)와 읽을 때의 new Key(1)은 사실 서로 다른 객체이지만 HashMap은
	// hashCode()의 리턴값이 같고, equals()의 리턴값이 true가 되기 때문에 동등한 객체로 평가한다
	// 즉, 같은 식별키로 인식한다는 뜻이다.
	
	// 결론적으로 객체의 동등 비교를 위해서는
	// Object의 equals() 메소드만 재정의하지 말고 hashCode() 메소드도 재정의해서 논리적으로
	// 동등한 객체일 경우 동일한 해시코드가 리턴되도록 해야 한다.
	@Override
	public int hashCode() {
		return number;
	}
	
	
}
public class srcO {

	public static void main(String[] args) {
		
		// Key 객체를 식별키로 사용해서 String값을 저장하는 HashMap 객체 생성
		HashMap<Key,String> hashMap=new HashMap<Key,String>();
		
		// 식별키 new Key(1)로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 new Key(1)로 "홍길동"을 읽어옴
		String value=hashMap.get(new Key(1));
		
		System.out.println(value);
	}
}
