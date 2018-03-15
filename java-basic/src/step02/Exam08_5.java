// 형 변환 - 명시적 형 변환
package step02;

public class Exam08_5 {
    public static void main(String[] args){
        float f = 3.14f;
        double d = 9876.56789;

        // 부동소수점 메모리의 값을 정수 메모리에 저장할 수 없는데,
        // 값이 잘릴 수 있음을 알면서도
        // 부동소수점 값을 정수메모리에 저장하고 싶을 때,
        // 컴파일러에게 강조로 값을 넣을 것을 명시한다!
        int i = (int)f; // 소수점 이하가 제거된다.
        long l = (long)d; // 소수점 이하가 제거된다.

        System.out.println(i);
        System.out.println(l);
    }
}
