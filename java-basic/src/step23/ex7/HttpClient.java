// HTTP 클라이언트 만들기
package step23.ex7;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// HTTP 요청 프로토콜
// --------------------------------
// GET [자원주소] HTTP/1.1 (CRLF)
// Server: [서버주소] (CRLF)
// (CRLF)
// --------------------------------
// 프로토콜
// => 클라이언트/서버 간의 통신 규칙
// => 데이터를 주고 받는 규칙
public class HttpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.naver.com", 80);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
       out.println("GET main/read.nhn?oid=001&sid1=100&aid=0010028588&mid=shm&viewType=pc&mode=LSD&nh=20180417093231");
       out.println("Host: news.naver.com");
       out.println();
       
       while (true) {
           try {
               System.out.println(in.nextLine());
           } catch (Exception e) {
               break;
           }
       }
       out.close();
       in.close();
       socket.close();
    }
}
