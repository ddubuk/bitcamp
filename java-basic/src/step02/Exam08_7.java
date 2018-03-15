// 형 변환 - 명시적 형 변환이 가능한 경우
package step02;

public class Exam08_7 {
    public static void main(String[] args){
        // 1) 정수 메모리끼리 형변환이 가능하다.
        // 2) 부동소수점을 정수로 형변환이 가능하다.
        // 3) 형변환 없이 정수는 부동소수점 메모리에 저장할 수 있다.
        // 4) 숫자를 문자 코드로 형변환 가능하다.
        char ch;
        int i = 0x41;
        ch = (char)i;

        // 그 외에는 형변환 불가!
        // => 정수나 부동소수점을 boolean 값으로 변환할 수 없다.
        boolen bool;
        bool = (boolean) 1;
        
        // => 문자열을 정수나 부동소수점, 문자, boolean 값으로 변환할 수 있다.
        boolean v1 = (boolean) "true"; // 컴파일 오류
        char v2 = (char)"가"; // 컴파일 오류
        int v3 = (int) "123"; // 컴파일 오류
        float v4 = (int)"3.15f"; // 컴파일 오류
    }
}