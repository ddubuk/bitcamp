//흐름 제어문 - for 반복문과 컬렉션
package step05;

import java.util.ArrayList;

public class Exam04_4 {
    public static void main(String[] args) {
        //배열은 같은 타입의 값만 보관할 수 있지만
        //컬렉션은 다른 타입의 값도 보관할 수 있다.
        //
        //배열은 크기가 고정되지만
        //컬렉션은 크기가 가변적이다.
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(3.14f);
        list.add(true);
        list.add(365);

        String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
            //특정범위꺼를 꺼내고 싶을 때
            
        System.out.println("=====================");

        //for 문에 컬렉션도 적용할 수 있다.
        //for (변수 선언 : 컬렉션객체) 문장;
        //인덱스 꺼낼 필요 없이 다 출력하고 싶을 때
        for (Object value : list)
            System.out.println(value);

    }
}