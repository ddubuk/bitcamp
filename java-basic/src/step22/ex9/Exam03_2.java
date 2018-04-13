// Java I/O API 사용하기 - ObjectInputStream
package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam03_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test9_4.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        
        // Serialize로 출력된 데이터를 읽어 다시 원래의 객체를 생성하는 것
        Member3 member = (Member3) in.readObject();
        // Exam02_4.java의 경우와 달리
        // Member3 객체의 시리얼 데이터를 출력한 다음,
        // Member3를 변경하더라도 데이터를 읽는데 실행 오류가 발생하지 않았다.
        // 이유?
        // => 클래스 버전 번호가 같기 때문이다.
        
        in.close();
        
        System.out.println(member);
        
    }

}

// 용어 정리!
// Serialize : 객체 ===> 바이트 배열   (marshalling 이라고도 부른다.)
// Deserialize : 바이트 배열 ===> 객체 (unmarshalling 이라고도 부른다.)




