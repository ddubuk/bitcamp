// Java I/O API 사용하기 - ObjectInputStream
package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam02_4 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test9_3.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        
        // Serialize로 출력된 데이터를 읽어 다시 원래의 객체를 생성하는 것
        Member2 member = (Member2) in.readObject();
        // serialize 데이터를 읽어 Member2 인스턴스를 생성하려고 하면
        // 실행 오류가 발생한다.
        // 이유?
        // => Serialize 데이터를 출력할 때 사용한 Member2 클래스의 데이터 버전과
        //    Serialize 데이터를 읽을 때 사용한 Member2 클래스의 버전이 다르기 때문이다.
        // 어? Member2를 작성할 때 버전 번호를 등록한 적이 없는데요?
        // => 개발자가 클래스를 작성할 때 버전을 지정하지 않으면 컴파일러가 자동으로 임의의 번호를 지정한다.
        // => private static final int serialVersionUID 변수를 만들어
        //    임의의 값을 저장한다.
        //
        // 그러면 모든 클래스가 serialVersionUID라는 변수를 가지고 있나요?
        // => 아니다. java.io.Serializable 인터페이스를 구현한 클래스인지
        //    해당 변수를 가진다.
        
        in.close();
        
        System.out.println(member);
        
    }

}

// 용어 정리!
// Serialize : 객체 ===> 바이트 배열   (marshalling 이라고도 부른다.)
// Deserialize : 바이트 배열 ===> 객체 (unmarshalling 이라고도 부른다.)




