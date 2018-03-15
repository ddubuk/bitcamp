//흐름 제어문 - if ~ else문
package step05;

public class Exam01_4 {
    public static void main(String[] args) {
        
        int age = 17;
        
        //if문은 else문 없이 단독으로 사용할 수 있다.
        if (age < 19)
            System.out.print("미성년입니다.");
        //아주 모범적인 사용
        if (age >= 19) //조건이 거짓이면 다음 else문을 실행한다.
            System.out.println("성인입니다.");
        else
            System.out.println("미성년입니다.");

        //잘못 사용한 예
        //else문만 단독으로 사용할 수 없다.
        //항상 if문과 짝을 이뤄 사용
        //else
        //    System.out.println("컴파일 오류");

        //if문과 else 문 사이에 다른 문장이 올 수 없다.
        /*
        if (age >= 19)
        System.out.println("성인입니다.");
        System.out.println("---------------");
        else
        System.out.println("미성년입니다.");
        */
        
        //블록에 들어있는 문장은 if문에 소속되기 때문에 상관없다.

    }
}