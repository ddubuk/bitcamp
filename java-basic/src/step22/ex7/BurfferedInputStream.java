// 버퍼 기능을 입출력 플러그인/장신구로 만든다.
package step22.ex7;

import java.io.IOException;
import java.io.InputStream;

public class BurfferedInputStream {
    
    InputStream in;
    
    byte[] buf = new byte[8196];
    int size;   // 배열에 저장되어 있는 바이트의 수
    int cursor; // 바이트 읽은 배열의 위치
    
    public BurfferedInputStream(InputStream in) {
        this.in = in;
    }

    public int read() throws IOException {
        if (cursor == size) {   // 버퍼에 저장되어 있는 데이터를 모두 읽었다는 의미
            if ((size = in.read(buf)) == -1) {   // 파일에서 데이터를 읽으려 했는데 데이터가 없다.
                return -1;
            }
            cursor = 0;
        }
        return 0x000000ff & buf[cursor++];
    }
    
    public void close() throws IOException {
        in.close();
    }
    
}
