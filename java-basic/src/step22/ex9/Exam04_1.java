// Java I/O API 사용하기 - Serialize와 transient 변경자
package step22.ex9;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam04_1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test9_5.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufOut);
        
        Score s = new Score();
        s.name = "홍길동";
        s.kor = 99;
        s.eng = 80;
        s.math = 92;
        s.coumpute();
        
        out.writeObject(s);
        
        out.close();
    }
    
    
}

