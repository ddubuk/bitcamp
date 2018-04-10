// RuntimeException 예외 던지고 받기
package step21.ex4;

public class Exam03 {
    static void m1() {
        m2();
    }
    static void m2() {
        // RuntimeException 예외를 받을 경우
        // try-catch-예외를 처리하지 않으면
        m3();
    }
    static void m3() {
        // m4()에서 어떤 예외가 발생하는지 구체적으로 선언되어 있지 않기 때문애
        // m4()를 호출할 때는 예외퍼리를 고민할 필요가 없다.
        // 그냥 예외를 덙지 않는 메서드인 것 처럼 사용하면 된다.
        // => 그러
        m4();
    }
    static void m4() throws Exception {
        // 이 메서드에서 Exception 계열의 예외를 던진다면
        // => 상위 호출자에게 전달하려면 여기서 catch 해서는 안된다.
        // => 여기서 예외를 처리하지 않으면 메서드 선언부에 어떤 예외가 발생하는지 선언해줘야 한다.
        throw new Exception("m4()에서 예외 발생!");
    }
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
