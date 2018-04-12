// 플러그인으로 전환한 BurfferedOutputStream 사용하기
package step22.ex7;

import java.io.IOException;
import java.io.OutputStream;

public class BurfferedOutputStream {
    
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
