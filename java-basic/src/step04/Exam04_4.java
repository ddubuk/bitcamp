// 비트 이동 연산자 : 응용1
package step04;

public class Exam04_4 {
    public static void main(String[] args) {
        int i = 0x27a130ff;
        int a, b, c, d;
        
        System.out.println(Integer.toHexString(i));
        //그냥 i라고 하면 10진수로 표현하지만 위와 같이 하면 16진수로 표현한다.

        //i변수에 들어있는 값을 1바이트씩 잘라서 16진수로 출력하라
        //a,b,c,d 변수에 넣은 다음 각 변수의 값을 16진수로 출력하라

        //27a130ff = 00100111_10100001_00110000_11111111
        a = i >> 24; //00000000_00000000+_00000000_00100111
        b = (i >> 16) & 0xff; //00000000_00000000_00100111_10100001
        c = (i >> 8) & 0xff;
        d = i & 0xff;

        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toHexString(d));
    }
}