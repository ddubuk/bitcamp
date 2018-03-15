// 키보드 입력 받기 - 응용
package step02;

public class Exam02_2 {
    public static void main(String[] args){
        // 키보드에 접속하기 위해 키보드 정보를 가져온다.
        java.io.InputStream keyboard = System.in;

        // 키보드에서 값을 꺼내주는 도구를 연결한다.
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        // 팀 멤버의 정보를 입력 받아 출력
        // 이름, 전화, 이메일, 나이, 재직여부
        // 예)
        // 이름? 홍길동
        // 전화? 1111-2222
        // 이메일? hong@test.com
        // 나이? 20
        // 재직여부? y

        System.out.println("이름?");
        System.out.println(keyScan.nextLine());
        
        System.out.println("전화?");
        System.out.println(keyScan.nextLine());
        
        System.out.println("이메일?");
        System.out.println(keyScan.nextLine());
        
        System.out.println("나이?");
        System.out.println(keyScan.nextLine());
        
        System.out.println("재직여부?");
        System.out.println(keyScan.nextLine());

        
    }
}

// System.out
// - 표준 출력 장치
// - 즉, 콘솔(모니터, 명령창) 출력을 가리킨다.

// System.in
// - 표준 입력 장치
// - 즉, 키보드를 가리킨다.