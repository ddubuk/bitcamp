// 게시물 관리 - 목록 - PreparedStatement
package step25.ex2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam02_list {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false&user=java106&password=1111",
                "java106", "1111");
        // 당장 select할 때 파라미터 값을 넣지 않는다 하더라도
        // 나중에 넣을 것을 대비해서 그냥 PreparedStatement를 사용하라!
        PreparedStatement stmt = con.prepareStatement(
                "select bno,titl,rdt from ex_board");
                
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            System.out.printf("%d,%s,%s\n",
                    rs.getInt("bno"),   //select 결과의 컬럼 번호이다. 1부터 시작! 'bno' 컬럼 값.
                    rs.getString("titl"),    //'titl' 컬럼 값 
                    rs.getDate("rdt"));     //'rdt' 컬럼 값
            
        }
        stmt.close();
        rs.close();
        con.close();
    }

}
