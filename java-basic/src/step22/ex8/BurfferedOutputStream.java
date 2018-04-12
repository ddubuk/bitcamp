// OutputStream에 붙이는 플러그인을 다른 플러그인에 붙이려면
// 플러그인 클래스도 OutputStream의 가족이 되어야 한다.
package step22.ex8;

import java.io.IOException;
import java.io.OutputStream;

// 이 상속은 기능 상속의 의미로 상속 받은 것이 아니다.
// 같은 그룹으로 묶이기 위함이다.
public class BurfferedOutputStream extends OutputStream {
    
    OutputStream out;
    
    byte[] buf = new byte[8196];
    int cursor;
    
    public BurfferedOutputStream(OutputStream out) throws Exception {
        this.out = out;
    }

    public void write(int b) throws IOException {
        if (cursor == buf.length) { 
            out.write(buf);        
            cursor = 0;
        }
        
        buf[cursor++] = (byte)b;
    }

    public void close() throws IOException {
        this.flush();
        out.close();
    }
    
    public void flush() throws IOException {
        if (cursor > 0 ) {
            out.write(buf, 0, cursor);
            cursor = 0;
        }
    }
    
}
