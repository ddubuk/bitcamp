// 증감 연산자 : 후위(post-fix) 감소 연산자
package step04;

public class Exam06_2 {
    public static void main(String[] args) {
        int i = 7;

        i--;    //6저장
        // 현재 위치 i 메모리에 들어 있는 값을 꺼내 놓는다.
        // i 메모리의 값을 1 감소시킨다.
        
        i--;    //5저장

        System.out.println(i);  //5출력

        System.out.println(i--);    //5출력 후 1 감소된 4가 저장
        //i에 먼저 넣고 다음 값이 1감소

        System.out.println(i);      //4
    }
}