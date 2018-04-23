// 게시판 관리 - 삭제
package step25.ex2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam02_delete {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("삭제할 게시물 번호? ");
        String no = keyScan.nextLine();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
        // 2) DBMS에 연결하기
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false&user=java106&password=1111",
                "java106", "1111");
        
        PreparedStatement stmt = con.prepareStatement(
                "delete from ex_board where bno=?");
        stmt.setString(1, no);
        int count = stmt.executeUpdate();
        
        System.out.printf("%d 개 삭제 성공!", count);
        
        // 지원해제
        // => 파일과 마찬가지로 DBMS에 연결한 후 더이상 사용하지 않으면 연결을 해지해야 한다.
        stmt.close();
        con.close();
        keyScan.close();
    }

}
