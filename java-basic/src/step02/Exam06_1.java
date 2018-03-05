// 문자 변수 - 유효한 값 범위
package step02;

public class Exam06_1 {
    public static void main(String[] args){
        // 0~65535까지의 UTF-16 코드 값을 저장하는 2바이트 메모리
        char c;
    
        //비록 정수 리터럴의 크기가 4바이트일지라도
        // 그 리터럴 값이 메모리에 저장될 수 있다면 허락한다.
        c = 0;
        c = 65535;

        // char(2바이트) 크기의 메모리 범위 초과하면 컴파일 오류
        c = -1; //컴파일 오류
        c = 65536; //컴파일 오류
    }
}