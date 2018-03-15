// 산술 연산자 : 명시적 형변환
package step04;

public class Exam01_6 {
    public static void main(String[] args) {
        byte b = (byte)128;
        //0000 0000 0000 0000 0000 0000 1000 0000
        //1000 0000 (128)
        //0111 1111 (1의 보수)
        //1000 0000 (2의 보수)

        System.out.println(b); // -128


    }
}
