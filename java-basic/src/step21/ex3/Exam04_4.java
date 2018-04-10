// 던지는 예외를 메서드에 선언하기
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_4 {

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
    
    public static void main(String[] args) {
        try {
            // 예외가 try블록에서 예외가 발생할 수 있는 메서드를 호출한다.
            m(1);
        } catch (Exception e) {
            // 여러개의 예외를 받을 때 수퍼클래스 변수로 먼저 받지말라!
            // 그러면 그 수퍼 클래스의 모든 서브클래스 객체도 다 받게 된다.
            // 즉, 서브 클래스의 변수에서 받을 기회조차 없다.
            // => 예외 객체를 정확하게ㅐ 받고 싶다면 서브 클래스 예외부터 받아라
        } catch (IOException e) {
            
        } catch (SQLException e) {
            
        } catch (RuntimeException e) {
            
        }

    }
}
