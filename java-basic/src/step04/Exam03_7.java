// 비트 이동 연산자 : >>, >>>, << 
package step04;

public class Exam03_7 {
    public static void main(String[] args) {
        // AND 연산자 
        // - 두 개의 논리 값이 모두 true일 때 결과가 true가 된다.
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("-----------------------");
        
        // OR 연산자 
        // - 두 개의 논리 값 중 한 개라도 true이면 결과는 true가 된다.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("-----------------------");
        
        // NOT 연산자 
        // - true는 false로 false는 true로 바꾼다.
        System.out.println(!true);
        System.out.println(!false);
    }
}

//비트 연산 활용 예1:
//화면을 좀 더 엔틱하게 표현하고 싶다
//누리끼리하게 만들고 싶다.
//=>방법 : 노란색 계통을 강화하는 것이다.
//즉, 빨강, 초록 빛을 강화하면 된다.
//=>다음과 같이 한 개의 점이 있다. 엔틱하게 만들자
//    10001100 10010010 10101100 (변경 전 색)
// |  10010010 01001001 00000000
//--------------------------------
//    10011110 11010011 10101100변 (변경 후 색)
