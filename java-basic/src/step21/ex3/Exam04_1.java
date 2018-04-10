// 던지는 예외를 메서드에 선언하기
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_1 {

    // 메서드에서 발생되는 모든 예외를 나열하기
    static void m(int i) 
            throws Exception, RuntimeException, SQLException, IOException {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }
    
    // 공통 분모를 사용하여 퉁치는 방법
    // => 메서드에서 발생하는 예외의 공통 수퍼 클래스를 지정하면 된다.
    // => 호출자에게 어떤 오류가 발생하는지 정확하게 알려주는 것이 유지보수에 도움이 된다.
    //    따라서 가능한 그 메서드에서 발생하는 예외를 모두 나열하라!
    static void m2(int i) throws Exception {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }
    
    public static void main(String[] args) throws Exception {
        // 예외를 처리하고 싶지 않다면 이전 호출자에게 책임을 떠넘길 수 있다.
        // => main() 호출자는  JVM이고
        //    JVM은 main() 예외를 던지는 순간 즉시 실행을 멈춘다.
        //    그래서 main()의 호출자에게 책임을 떠넘기는 것은 바람직하지 않다.
        //    즉, main()은 예외 처리의 마지막 보류이다.
        m(1);
    }

}
