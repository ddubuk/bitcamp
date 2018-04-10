// 예외처리 문법을 적용하기 전 - 리턴 값으로 오류 여부를 알려준다.
package step21.ex1;

public class Calculator2 {
    public static int compute(String op, int a, int b) {
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a & b;
        default:
            // 일반적인 계산으로도 나올 수 있는 -1과 같은 흔한 값 대신에 다음과 같이
            // 일반적인 계산 결과로 나올 수 없는 값을 지정한다.
            return -12121212;
        }
    }
}
