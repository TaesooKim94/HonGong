package basic1;

// # 매개 변수의 개수를 모를 경우
// => 매개변수를 배열 타입으로 선언

// 메소드 오버로딩의 조건은 매개변수의 타입, 개수, 순서 중 하나가 달라야한다.
// 오버로딩된 메소드를 호출할 경우 JVM은 매개값의 타입을 보고 메소드를 선택한다.
// JVM은 일차적으로 매개 변수의 타입을 보지만, 매개 변수의 타입이 일치하지 않을 경우 자동 타입 변환이 가능한지 검사
// 리턴 타입만 다르고 매개변수가 동일하다면 이것도 오버로딩이 아니다.
// 메소드 오버로딩의 가장 대표적인 예는 System.out.println() 메소드이다.

class Computer
{
	int sum1(int[] values)
	{
		int sum=0;
		for(int i=0;i<values.length;i++)
			sum+=values[i];
		
		return sum;
	}
}

public class src4 {

	public static void main(String[] args) {
		Computer myCom=new Computer();
		int[] values1= {1,2,3};
		System.out.println(myCom.sum1(values1));
		
		int result2=myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
	}

}
