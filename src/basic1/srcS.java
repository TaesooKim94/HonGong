package basic1;

import java.io.IOException;

// # String 클래스
// 자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리된다

// 파일의 내용을 읽거나, 네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 이것을 문자열로 변환하기 위해 사용된다

public class srcS {

	public static void main(String[] args) throws IOException{
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		
		String str1=new String(bytes);
		System.out.println(str1);
		
		String str2=new String(bytes, 6, 4);
		System.out.println(str2);
		
		// # System.in.read()
		// => 키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴한다.
		
		byte[] bytess=new byte[100];		// 읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.println("입력: ");
		int readByteNo=System.in.read(bytes);	// 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		String str=new String(bytess,0,readByteNo-2);	// 배열을 문자열로 변환
		System.out.println(str);
	}

}
