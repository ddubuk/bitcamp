// 사용자로부터 년, 월, 일 데이터를 입력받아서
// 요일과 몇 번째 주인지 출력하라!
// 그리고 1년 중에 몇일 째인지 출력하라!
//
package step09.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("년, 월, 일? (예: 2018 3 21)");
        int year = keyScan.nextInt();
        int month = keyScan.nextInt();
        int day = keyScan.nextInt();
        
        Calendar c = Calendar.getInstance();    // 이것만 하면 오늘 날짜가 나온다.
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, day);
        
        String[] weeks = {"", "일", "월", "화", "수", "목", "금", "토"};
        
        //int i = c.get(Calendar.DAY_OF_WEEK);
        //System.out.printf("주차: %d주차\n", weeks[i]);
        System.out.printf("요일: %s요일\n", weeks[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("주차: %d주차\n", c.get(Calendar.WEEK_OF_MONTH));
        System.out.printf("일차: %d일차\n", c.get(Calendar.DAY_OF_YEAR));
        
        
        System.out.println();
    }
}
