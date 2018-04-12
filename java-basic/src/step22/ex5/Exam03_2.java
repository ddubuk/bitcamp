// BurfferedInputStream
package step22.ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam03_2 {

    public static void main(String[] args) throws Exception {
        BurfferedInputStream in = new BurfferedInputStream("temp/jls8.pdf");
        FileOutputStream out = new FileOutputStream("temp/jls8_4.pdf");

        int b;
        
        long startTime = System.currentTimeMillis(); // 밀리초
        
        while ((b = in.read()) != -1) { // 파일을 끝까지 읽는다.
            out.write(b);
        }
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
        
        in.close();
        out.close();
    }

}
