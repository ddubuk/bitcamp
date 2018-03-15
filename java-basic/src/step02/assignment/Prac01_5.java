package step02.assignment;
// 5단계: 반복문을 사용하여 입력과 출력 코드를 간단히 하라
public class Prac01_5 {
    public static void main(String[] args) {
        
        String[] name = new String[4];
        int[] kor = new int[4];
        int[] eng = new int[4];
        int[] math = new int[4];
        int[] sum = new int[4];
        float[] avg = new float[4];

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        for (int i = 0; i < 4; i++) {

            System.out.print("입력? ");
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3;
        }
        System.out.println("-------------------------");

        for (int i = 0; i < 4; i++) {
            
            System.out.print(name[i]);
            System.out.print(" ");
            System.out.print(kor[i]);
            System.out.print(" ");
            System.out.print(eng[i]);
            System.out.print(" ");
            System.out.print(math[i]);
            System.out.print(" ");
            System.out.print(sum[i]);
            System.out.print(" ");
            System.out.println(avg[i]);

        }
    }
}