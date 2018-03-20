// 생성자 활용 예 -java.uil.
package step09;

import java.util.Date;

import javax.xml.crypto.Data;

public class Exam01_2 {
    
    public static void main(String[] args) throws Exception {
        // java.util.Date 클래스는 날짜 데이터를 다루는 클래스이다.
        // => 이 클래스에는 날짜 데이터를 다룰 수 있는 다양한 메서드가 들어있다.
        
        Date d1 = new Date();
        System.out.println(d1);
        
        // 년, 월, 일 값으로 날짜 인스턴스를 초기화시킨다.
        Date d2 = new Date(118, 2, 20);
        System.out.println(d2);
 
        // 1970년 1월 1일 0시 0초부터 측정된 밀리초를 가지고
        // 날짜 인스턴스(객체=메모리) 초기화한다.
        Date d3 = new Date(1000L * 60 * 60 * 24 * 365 * 50);
        System.out.println(d3);
        
        
    }
}

// 생성자
// => 인스턴스 변수를 초기화시키기 위해 여러 개의 생성자를 만들어 제공할 수 있다.
// > 자신에게 맞는 적절한 생성자를 호출하여 