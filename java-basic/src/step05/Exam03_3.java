//흐름 제어문 - 중첩된 반복문 탈출
package step05;

import java.util.Scanner;

public class Exam03_3 {
    public static void main(String[] args) {
        
        int x = 2, y = 1;

        //5 * 5까지만 출력한다.
        //라벨명: 반복문1 () { 반복문2 {break 라벨명;}}
        
        myloop: 
        while (x <= 9) {
            while (y <= 9) {
                System.out.printf("%d * %d = %d\n", x, y, x * y);

                if (x == 5 && y == 5)
                //break; //이 break는 자신이 소속된 가장 가까운 반복문을 나간다.
                break myloop; //myloop라벨에 소속된 문장을 나간다.
                y++;
            }
            System.out.println();
            x++; //2단이 끝나면 3단으로
            y = 1; //9까지 끝나면 다시 1로 시작
        }

    }
}