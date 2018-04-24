// 게시물 관리 - JDBC 코드를 별도의 클래스로 캡슐화 시킴. DAO적용
package step25.ex3;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam01_delete {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("삭제할 게시물 번호? ");
        String no = keyScan.nextLine();
        
       try {
           BoardDao boardDao = new BoardDao();
           int count = boardDao.delete(Integer.parseInt(no));
           System.out.printf("%d개 삭제 성공!", count);
       } catch (Exception e) {
           e.printStackTrace();
       }
        
        System.out.printf("%d 개 삭제 성공!", no);
        
    }

}
