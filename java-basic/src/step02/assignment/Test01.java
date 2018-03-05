/*
# 과제(2018-03-05)
사용자로부터 이름, 국어, 영어, 수학 데이터를 입력 받고
합계와 평균을 출력하라
## 실행 결과
> java -classpath ./bin step02.assignment.Test01
이름? 홍길동
국어? 100
영어? 90
수학? 80
-------------
홍길동 100 90 80 270 90.0
*/
package step02;

public class Test01 {
    public static void main(String[] args) {

        String s1;
        int i1, i2, i3, sum, avg;

       

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("이름? ");
        s1 = keyScan.nextLine();

        System.out.print("국어? ");
        i1 = keyScan.nextInt();
      

        System.out.print("영어? ");
        i2 = keyScan.nextInt();
       

        System.out.print("수학? ");
        i3 = keyScan.nextInt();
 
        
        System.out.println("--------------------------");

        sum = (i1 + i2 + i3);
        avg = (sum / 3);
        System.out.print(s1);
        System.out.print(" ");
        System.out.print(i1);
        System.out.print(i2);
        System.out.print(i3);
        System.out.print(sum);
        System.out.print(avg);


    }
}