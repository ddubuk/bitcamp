package step02.assignment;
// 6단계: 형식을 갖춘 문자열 출력하기
public class Prac01_6 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String[] name = new String[4];
        int[] kor = new int[4];
        int[] eng = new int[4];
        int[] math = new int[4];
        int[] sum = new int[4];
        float[] avg = new float[4];

        for (int i = 0; i < 4; i++) {

            System.out.print("입력? ");
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3;
        }
        System.out.println("--------------------");

        for (int i = 0; i < 4; i++){

            System.out.printf("%s %d %d %d %d %f\n", name[i], kor[i], eng[i], math[i], sum[i], avg[i]);
        }
    }
}