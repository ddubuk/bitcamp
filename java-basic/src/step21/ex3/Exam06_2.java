// finally블록
package step21.ex3;

import java.io.FileReader;
import java.util.Scanner;

    public class Exam06_2 {
        
        static void m() {
            // 자원해제시키는 코드를 매번 작성하기가 귀찮다.
            // => try-with-resources 라는 문법을 사용하면
            //    굳이 close()를 직접 호출할 필요가 없다.
            //    자동으로 처리한다.
            // => 단, java.lang.AutoCloseable 구현체에 대해서만 가능하다!
            // => 문법
            //    try
            
            try (Scanner keyScan = new Scanner(System.in)) {
                
                // FileReader도 class도 java.lang.AutoCloseable 구현체이다.
                FileReader in = new FileReader("Hello.java");
                
                // 반드시 AutoCloseable는 구현체여야한다.
                //String s = "Hello"; // 컴파일 오류!
                //if (true) {} // 변수 선언만 가능하기 때문에 컴파일 오류!
                
                // 예외가 발생한다면?
                System.out.print("입력> ");
                int value = keyScan.nextInt();
                System.out.println(value * value);
                } 
            }
            
            
            
            // 프로그램을 즉시 종료하는 경우라면,
            // 스캐너를 다 사용하고 난 다음에 굳이 스캐너에 연결된 키보드와 연결을 끊을 필요는 없다.
            // 그러나 365일 24시간 내내 실행되는 시스템이라면,
            // 사용하지 않는 동안에는 다른 프로그램에서 사용할 수 있도록
            // 스캐너와 연결된 키보드를 풀어줘야한다.
            // 이것을 '자원해제'라고 부른다.
            // 보통 자원해제시키는 메서드의 이름이 "close()이다.
            // 당연히 scanner 클래스에서 자원을 해제시키는 close() 메서드가 있다.
            // 그런데 우리는 지금까지 scanner를 사용하면서 close()를 호출하지 않았다.
            // 왜? 프로그램이 바로 종료도기 때문이다
            // JVM이 종료되면 OS는 JVM이 사용한 모든 자원을 자동으로 회수하기 때문에
            // 굳이 close()를 호출하지 않는 것이다.
            // 그러나 우리가 자바로 프로그램을 짤 영역은 서버쪽이다.
            // 즉 365일 24시간 내내 실행되는 서버쪽 프로그램을 개발하는 것이기 때문에
            // 항상 자원을 사용한 후 배제시키는 것을 습관적으로 해야한다.
            //keyScan.close();
            
            // 문제는 close()를 호출하기 전에 예외가 발생한다면
            // 제대로 지원을 해제시키지도 못했다는 것이다.
            // 이것을 해결하는 방법은 finally 블록을 사용하는 것이다.
        }
    public static void main(String[] args) throws Exception {
            m();
    }

}
