//리터럴(literal)
package step01;

public class Exam04{
    public static void main(String[] args) {
        // 정수
        // => 4바이트 크기의 정수
        System.out.println(10);
        System.out.println(+10);
        System.out.println(-10);
        
        // => 8바이트 크기의 정수
        //   숫자 뒤에 l 또는 L을 붙인다.
        System.out.println(10L);
        System.out.println(+10l);
        System.out.println(-10L);
        
        // 부동소수점
        // => 4바이트 크기
        //    숫자 뒤에 F, f를 붙인다.
        System.out.println(3.14F);
        System.out.println(3.14f);

        // 부동소수점
        // => 8바이트 크기의 정수
        System.out.println(3.14);
        System.out.println(31.4e-1);


        System.out.println("오호라..");

        System.out.println('가');

        System.out.println(true);
        System.out.println(false);

    }
}