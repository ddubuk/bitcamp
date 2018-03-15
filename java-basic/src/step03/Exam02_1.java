// 레퍼런스 배열 - 사용 전
package step03;

public class Exam02_1 {
    public static void main(String[] args) {
        //여러개의 인스턴스 주소 저장하기
        
        class Score {       //쟁반
            String name;    //밥
            int kor;        //반찬
            int eng;
            int math;
            int sum;
            float avg;
        } 

        //Score 인스턴스(=객체, 메모리)의 주소를 저장할 배열 생성
        Score[] arr = new Score[3];
        //주의!
        //=>Score 인스턴스를 3개 만든 것이 아니다.
        //=>Score 인스턴스 주소를 저장할 
        s = new Score(); // => Score 설계도에 따라 메모리를 확보하고,
                         //그 메모리의 주소를 s에 저장한다.

        //클래스 설계도에 따라 만든 메모리에 값을 집어 넣기
        //=>주소를 이용하여 메모리에 접근한다.
        s.name = "홍길동"; //s에 저장된 주소로 찾아가서 name항목에 저장
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        s.sum = s.kor + s.eng + s.math;
        s.avg = s.sum / 3;

        //s에 저장된 주소로 찾아가서
        //=>위의 말을 줄여서 "s가 가리키는 메모리의 name항목의 값"
        //=>다른 전문적인 용어로 "s가 가리키는 인스턴스의 name 값"
        //=>다시 줄여서 "s 인스턴스의 name값"
        //=>또 다른 말로 "객체의 name값"
        System.out.printf("이름 : %s\n", s.name);
        System.out.printf("국어 : %d\n", s.kor);
        System.out.printf("영어 : %d\n", s.eng);
        System.out.printf("수학 : %d\n", s.math);
        System.out.printf("합계 : %d\n", s.sum);
        System.out.printf("평균 : %.1f\n", s.avg);
         
    }
}

//클래스(class)
// - 여러 타입을 묶어서 사용자 정의 데이터 타입을 만드는 문법이다.
// - 관련된 기능(메서드, 함수)을 관리하기 편하게 묶는 문법이다.

//배열(array)
// - 단일한 타입의 메모리를 묶는 문법이다.
// - String은 String끼리 묶고 int는 int끼리 묶는다.

//premitive 변수와 레퍼런스
// - premitive type(byte, short, int, long, float, double, boolean, char)의
// 메모리를 만들 때 변수 선언 만으로 완료된다.
// 변수 이름이 곧 메모리를 가리키는 이름이 된다.
// 예) int age;
// - class(사용자 정의 데이터 타입)으로 메모리를 만들 때는 
//   반드시 new 명령을 사용해야 한다.
// - 메모리를 만든 후에는 그 주소를 변수에 저장해서 메모리를 사용한다.
//   예) Score s; <==== 메모리의 주소를 저장하는 변수
//       s = new Score(); <=== 메모리를 확보한 후 그 주소를 s에 저장.
