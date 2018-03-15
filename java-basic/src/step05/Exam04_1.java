//흐름 제어문 - for 반복문
package step05;

public class Exam04_1 {
    public static void main(String[] args) {
        // for (변수선언 및 초기화; 조건; 증감문) 문장;
        // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}
        
        //for 문의 전형적인 예
        for (int i = 0; i <= 5; i++)
        System.out.println(i);

        System.out.println("====================");
        for (int i = 0; i <= 5;)
        System.out.println(i);
        i++;

        System.out.println("====================");
        int i = 0;
        for (; i > 5; i++)
        System.out.println(i);

        System.out.println("====================");
        i = 1;              //이와 같이 적으면 안된다.
        for (;;) {
            if(i > 5)
                break;
            System.out.println(i);
            i++;
        }
    }
}