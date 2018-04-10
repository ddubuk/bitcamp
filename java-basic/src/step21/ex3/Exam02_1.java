package step21.ex3;
// 예외처리 - 예외 상황을 호출자에게 알려주기
public class Exam02_1 {
    
    // throw 명령어를 사용하여 예외 정보를 호출자에게 던진다.
    // => throw [java.lang.Throwable 타입의 객체];
    //
    // java.lang.Throwable
    // => Throwable에는 두 부류의 서브 클래스가 있다.
    // 1) Error
    //    => JVM에서 발생된 오류이다.
    //    => 개발자가 사용하는 클래스가 아니다.
    //    => 이 오류가 발생하면 즉시 시스템의 현 상태를 백업하고 즉시 실행을 멈춰야 한다.
    // 2) Exception
    //    => 애플리케이션에서 발생시킨 오류이다.
    //    => 개발자가 사용하느느 클래스이다.
    //    => 적절한 조치를 취한 후 계속 시스템을 실행하게 만들 수 있다.
    
    
    static void m() throws Throwable {
        throw new Throwable();  //ok
    }
    
    // java.lang.Error 계열의 오류를 던질 때는 어떤 오류를 던지는지 선언하지 않아도 된다.
    // 물론 선언해도 된다.
    static void m2() throws Throwable {
        throw new Error(); //ok! 하지만 이 계열의 클래스를 사용하지 말라!
        // 왜? JVM 관련 오류일 때 사용하는 클래스이다.
    }
    
    static void m3() {
        throw new Error(); //ok! 하지만 이 계열의 클래스를 사용하지 말라!
    }
    
    static void m4() throws Throwable {
        throw new Exception(); // ok!
    }
    
    static void m5() throws Throwable {
        throw new String(); // 컴파일 오류!
    }
    public static void main(String[] args) {
        
        // 예외를 받았을 때 처리하는 문법
        try {
            m();
        } catch (RuntimeException e) {
            // 예외가 발생하면 catch 블록에서 적절한 조치를 취한다.
            System.out.println(e.getMessage());
        }
        System.out.println("시스템을 종료합니다.");
    }
}
