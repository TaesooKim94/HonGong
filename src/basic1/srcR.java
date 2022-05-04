package basic1;

// # Class 클래스
// 자바는 클래스와 인터페이스의 메타 데이터를 java.lang 패키지에 소속된 Class 클래스로 관리한다
// 메타 데이터 => 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보

// # Class 객체 얻기( getClass(), forName())
// 1. Class clazz = 클래스이름.class
// 2. Class clazz = Class.forName("패키지...클래스이름")
// 3. Class clazz = 참조변수.getClass();
// 첫번째와 두번째 방법은 객체 없이 클래스 이름만 가지고 Class 객체를 얻는 방법이다.
// 세번째 방법은 클래스로부터 객체가 이미 생성되어 있을 경우에 사용하는 방법이다.
// ex) String 클래스의 Class 객체는
// 1. Class clazz = String.class;
// 2. Class clazz = Class.forName("java.lang.String");
// 3. String str = "감자바";
//    Class clazz = str.getClass();

// 예시)
// Car 클래스의 Class객체를 얻고, Class의 메소드를 이용해 클래스의 전체 이름과
// 간단한 이름 그리고 패키지 이름을 얻어 출력

// # 클래스 경로를 활용해서 리소스 절대 경로 얻기
// Class 객체는 해당 클래스의 파일 경로 정보를 가지고 있기 때문에 이 경로를 활용해서 다른 리소스 파일(이미지, XML, Property파일)
// 의 경로를 얻을 수 있다.
// 이 방법은 UI 프로그램에서 많이 활용된다.
// 예를 들어 Car 클래스가 위치하는 경로에 photo.jpg 파일이 있다고 가정하면
// ex) 프로그램 실행 중에 이미지 파일(photo1.jpg, photo2.jpg)의 절대 경로가 필요할 경웨 Car.class를 기준으로
//     한 상대 경로를 이용해서 절대 경로를 얻을 수 있다.
//     String photo1Path=clazz.getResource("photo1.jpg").getPath();
//     String photo2Path=clazz.getResource("images/photo2.jpg").getPath();

class Car
{
	
}

public class srcR {

	public static void main(String[] args) {
		// 첫번째 방법
		Class clazz=Car.class;
		
		// 두번째 방법
		// Class clazz = Class.forName("sec01.exam08.Car");
		
		// 세번째 방법
		// Car car;
		// Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
