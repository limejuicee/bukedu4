package collection;

import java.util.*;

public class Sample5 {
	public static void main(String[] args) {
		//List	:	순서엄격, 중복허락
		//Set	:	순서없음, 중복불가
		//Map	:	검색어(key)와 값(value)이 한 쌍으로 저장되는 방법
		//	데이터의 검색이 편해서 개발에 이용하기 좋음. ***
		//	순서는 존재하지 않고 value는 중복이 가능하지만 key는 중복될 수 없다
		Map<String, Student> m=new HashMap<String, Student>();
		//Map<key, value> 제네릭 지정 시 두개를 지정해야 한다
		//Map.put(key, value); key와 value를 한쌍으로 붂어 데이터 입력
		//Map.get(key) 			검색어를 기준으로 해당하는 value를 출력
		m.put("B", new Student("김철수",105));
		m.put("A", new Student("이영준",110));
		m.put("C", new Student("홍길동",65));
		m.put("D", new Student("김북부",500));
//		m.put("E", 100);	//value는 중복되어도 상관 없다
//		m.put("C",999);		//key는 중복되면 이전의 값이 소멸한다
		System.out.println(m);
		System.out.println(m.get("B"));
		//Map을 for문으로 운행하기 위해서는 key들이 들어가 있는 Set을 추출한 뒤에 사용하여야 한다
	}
}
class Student {
	String name;
	int number;
	Student(String a, int b) {
		name=a;
		number=b;
	}
	//System.out.println(Object);
	//매개변수로 전달된 Object는 Object.toString()을 수행한 결과물을 콘솔에 출력하게 된다
	//따라서 객체 내부의 toString()을 오버라이드 하면 원하는 내용이 콘솔에 출력되게 수정 가능하다
	//extends부분이 적히지 않은 모든 class는 extends Object와 같으므로 println의 매개변수로 전달 가능하다
	public String toString() {
		return " ["+name+","+number+"] ";
	}
}