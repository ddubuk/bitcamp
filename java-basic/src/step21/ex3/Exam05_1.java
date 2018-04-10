// finally블록
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam05_1 {

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
    
    public static void main(String[] args) throws Exception {
        try {
            m(0);
            System.out.println("try");
        } catch (RuntimeException | SQLException | IOException e) {
            // OR 연산자를 사용하여 여러 개의 예외를 받을 수 있다.
            System.out.println("catch1");
        } catch (Exception e) {
            System.out.println("catch2");
        } finally {
            // 정상적으로 실행하든, 아니면 예외가 발생하여 catch 블록을 실행하든
            // finally 블록은 무조건 실행한다.
            // 즉, try catch 블록을 나가기 전에 반드시 실행한다.
            System.out.println("finally");
            
        }
    
    }

}
