// 게시물 관리 - 목록
package step25.ex2;

import java.sql.DriverManager;

public class Exam01_list {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false&user=java106&password=1111",
                "java106", "1111");
        
        System.out.println("DBMS와 연결됨!");
        
        java.sql.Statement stmt = con.createStatement();
        
        java.sql.ResultSet rs = stmt.executeQuery(
                "select bno,titl,rdt from ex_board");
        
        while (rs.next()) {
            System.out.printf("%d,%s,%s\n",
                    rs.getInt("bno"),   //select 결과의 컬럼 번호이다. 1부터 시작! 'bno' 컬럼 값.
                    rs.getString("titl"),    //'titl' 컬럼 값 
                    rs.getDate("rdt"));     //'rdt' 컬럼 값
            
        }
        rs.close();
        con.close();
        stmt.close();
    }

}
