// InputStream에 붙이는 플러그인을 다른 플러그인에 붙이려면
// 플러그인 클래스도 InputStream의 가족이 되어야 한다.
package step22.ex8;

import java.io.IOException;
import java.io.InputStream;

// 이 상속은 기능 상속의 의미로 상속 받은 것이 아니다.
// 같은 그룹으로 묶이기 위함이다.
public class DataInputStream extends InputStream {
    
    InputStream in;
    
    public DataInputStream(InputStream in) throws Exception {
        this.in = in;
    }
    
    @Override
    public int read() throws IOException {
        return in.read();
    }



    public String readUTF() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 문자열 출력
        int size = in.read(); 
        byte[] bytes = new byte[size];
        in.read(bytes); // 이름 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
        return new String(bytes, "UTF-8");
    }
    
    public int readInt() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 int 값 출력
        int value = 0;
        
        value = in.read() << 24;
        value += in.read() << 16;
        value += in.read() << 8;
        value += in.read();
        return value;
    }
    
    public long readLong() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 long 값 출력
        long value = 0;
        value += (long)in.read() << 56;
        value += (long)in.read() << 48;
        value += (long)in.read() << 40;
        value += (long)in.read() << 32;
        value += (long)in.read() << 24;
        value += (long)in.read() << 16;
        value += (long)in.read() << 8;
        value += (long)in.read();
        return value;
    }
    
    public boolean readBoolean() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
        if (in.read()==1) 
            return true;
        else 
            return false;
    }
    
    @Override
    public void close() throws IOException {
        in.close();
    }
}





