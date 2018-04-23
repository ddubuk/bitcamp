// JDBC 프로그래밍 개요 - Driver 타입과 준비
package step25.ex1;

import java.sql.DriverManager;

// 드라이버 다운로드 및 설정
// 1) 직접 설정하기
// - java-basic/lib 폴더 생성
// 컴파일과 실행할 때 .jar파일을 사용할 수 있도록 CLASSPATH에 추가한다.
// 
public class Exam01_1 {

    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩
        // => java.sql.Driver 인터페이스 구현체를 만들어
        //    DriverManager가 찾을 수 있도록 등록해야 한다.
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
    }

}
