// 증감 연산자 : 후위(post-fix) 증감 연산자1
package step04;

public class Exam06_1 {
    public static void main(String[] args) {
        int i = 2;

        i++;    //3
        // 현재 위치 i 메모리에 들어 있는 값을 꺼내 놓는다.
        // i 메모리의 값을 1 증가시킨다.
        
        i++;    //4

        System.out.println(i);  //4

        System.out.println(i++);    //4
        //i에 먼저 넣고 다음 값이 1증가

        System.out.println(i);      //5
    }
}