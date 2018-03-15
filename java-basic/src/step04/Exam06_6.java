// 증감 연산자 : 전위(pre-fix) 감소 연산자 응용
package step04;

public class Exam06_6 {
    public static void main(String[] args) {
        int i = 7;
        
        --i;    //6
        //i메모리의 값을 먼저 감소시킨다.
        //그리고 i 메모리의 값을 그 자리에 놓는다.

        --i;    //5

        System.out.println(i); //5

        System.out.println(--i); //4
        //i = i + 1
        //System.out.println(5)
        
        System.out.println(i); //4
    }
}