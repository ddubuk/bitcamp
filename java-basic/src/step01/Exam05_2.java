//정수의 리터럴2(literal) - 자릿수 표기
package step01;

public class Exam05_2{
    public static void main(String[] args) {
       // 숫자에 _를 사용하여 숫자의 자릿수롤 표시할 수 있다
       // 자리 위치는 작성자 마음
       System.out.println(12783406);
       System.out.println(1278_3406);
       System.out.println(12_783_406);

       // 2진수
       // 0b 또는 0B로 시작한다
       System.out.println(0b1100100); //100
       System.out.println(0b110_0100);
       //System.out.println(0b_110_0100); //언더바가 앞에 오는건 안된다
       
    }
}   