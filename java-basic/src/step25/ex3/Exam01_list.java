// 게시물 관리 - JDBC 코드를 별도의 클래스로 캡슐화 시킴.
// => 데이터 영속성(지속성)을 관리하는 클래스를 DAO(data access object)라고 부른다.
// => data 영속성
//    = 데이터를 저장하고 유지하는 것.
//    = '퍼시스턴스'라 부른다.
package step25.ex3;

import java.util.List;

public class Exam01_list {

    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();
        
        try {
            List<Board> list = boardDao.list();
            
            for (Board board : list) {
                System.out.printf("%d,%s,%s\n",
                        board.getNo(),
                        board.getTitle(),
                        board.getRegisteredDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
