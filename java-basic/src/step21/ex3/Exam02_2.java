package step21.ex3;
// 예외처리 - RuntimeException을 던질 경우
public class Exam02_2 {
    
    // RuntimeExceptio은 클래스 이름을 보더라도 Exception의 서브클래스이다.
    static void m() throws Throwable {
        throw new RuntimeException();  //ok
    }
    
    static void m2() {
        throw new RuntimeException(); //ok! 하지만 이 계열의 클래스를 사용하지 말라!
    }
    
    public static void main(String[] args) {
        
    }
}