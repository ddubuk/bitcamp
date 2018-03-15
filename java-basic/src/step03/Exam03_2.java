// 레퍼런스와 인스턴스 - 인스턴스 주소 주고 받기
package step03;

public class Exam03_2 {
    public static void main(String[] args) {
        //여러개의 인스턴스 주소를 저장하려면?
       
        class Score {       //쟁반
            String name;    //밥
            int kor;        //반찬
            int eng;
            int math;
            int sum;
            float avg;
        } 

        //Score 레퍼런스 선언 + 인스턴스 생성(사용할 메모리 확보)
        Score s1 = new Score();

        //s1에 저장된 주소를 s2에도 저장한다. //레퍼런스를 저장하는 것이 아니라 주소를 저장하는 것이다.
        Score s2 = s1;

        s1.name = "홍길동";

        System.out.println(s2.name);
    }
}