package basic1;

// 원래 equals()는 Object 클래스의 번지 비교 메소드이지만,
// String 클래스가 재정의해서 문자열을 비교하도록 변경했다.

// 매우 중요!!!!!!!!)
// String 객체의 문자열은 변경이 불가능한 특성을 갖고 있기 때문에
// repalce()메소드가 리턴하는 문자열은 원래 문자열의 수정본이 아니라 완전히 새로운 문자열이다.
// ex) String oldStr="자바 프로그래밍";
//	   String newStr=oldStr.replace("자바","java");

// String original="Java Programming";
// String lowerCase=original.toLowerCase();
// String upperCase=original.toUpperCase();


public class srcT {

	public static void main(String[] args) {
		String ssn="010624-1230123";
		
		char sex=ssn.charAt(7);
		
		switch(sex)
		{
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
		
		String strVar1=new String("신민철");
		String strVar2="신민철";
		
		if(strVar1==strVar2)
		{
			System.out.println("같은 String 객체를 참조");
		}
		else
			System.out.println("다른 String 객체를 참조");
		
		if(strVar1.equals(strVar2))
			System.out.println("같은 문자열을 가짐");
		else
			System.out.println("다른 문자열을 가짐");
	}
	

}
