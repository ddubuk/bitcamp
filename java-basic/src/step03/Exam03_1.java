// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_1 {
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

        //Score 레퍼런스 선언
        Score s1 ;

        //인스턴스를 만들어 그 주소를 레퍼런스에 저장한다.
        s1 = new Score();

        //그러면 기존에 들어있던 주소는 잃어버린다.
        //주소를 잃어버려 사용할 수 없는 메로리를
        //가비지(garbage)라 부른다.

        //가비지는 가비지 컬렉터에 의해 메모리에서 해제된다.
        //가비지컬렉터의 실행
        // - 메모리 부족할 때
        // - CPU가 한가할 때
        // - System.gc()를 호출하여 가비지 실행을 요청할 때
        // 물론 이 경우에 바로 실행하는 것이 아니라,
        // 빠른 시간 내에 실행할 것을 종용하는 것이다.
        // 아무래도 원래의 시간보다는 앞단겨 청소를 하게 될 것이다.
        
    }
}