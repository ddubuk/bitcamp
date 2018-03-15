package step02.assignment;
// 4단계: 배열을 사용하여 같은 종류의 메모리를 쉽게 만들기
public class Prac01_4 {
    public static void main(String[] args) {

        String[] name = new String[4];
        int[] kor = new int[4];
        int[] eng = new int[4];
        int[] math = new int[4];
        int[] sum = new int[4];
        float[] avg = new float[4];

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? ");
        name[0] = keyScan.next();
        kor[0] = keyScan.nextInt();
        eng[0] = keyScan.nextInt();
        math[0] = keyScan.nextInt();
        sum[0] = kor[0] + eng[0] + math[0];
        avg[0] = sum[0] / 3;

        System.out.print("입력? ");
        name[1] = keyScan.next();
        kor[1] = keyScan.nextInt();
        eng[1] = keyScan.nextInt();
        math[1] = keyScan.nextInt();
        sum[1] = kor[1] + eng[1] + math[1];
        avg[1] = sum[1] / 3;

        System.out.print("입력? ");
        name[2] = keyScan.next();
        kor[2] = keyScan.nextInt();
        eng[2] = keyScan.nextInt();
        math[2] = keyScan.nextInt();
        sum[2] = kor[2] + eng[2] + math[2];
        avg[2] = sum[2] / 3;

        System.out.print("입력? ");
        name[3] = keyScan.next();
        kor[3] = keyScan.nextInt();
        eng[3] = keyScan.nextInt();
        math[3] = keyScan.nextInt();
        sum[3] = kor[3] + eng[3] + math[3];
        avg[3] = sum[3] / 3;

        System.out.println("------------------------------");
        System.out.print(name[0]);
        System.out.print(" ");
        System.out.print(kor[0]);
        System.out.print(" ");
        System.out.print(eng[0]);
        System.out.print(" ");
        System.out.print(math[0]);
        System.out.print(" ");
        System.out.print(sum[0]);
        System.out.print(" ");
        System.out.print(avg[0]);
        System.out.println();

        System.out.print(name[1]);
        System.out.print(" ");
        System.out.print(kor[1]);
        System.out.print(" ");
        System.out.print(eng[1]);
        System.out.print(" ");
        System.out.print(math[1]);
        System.out.print(" ");
        System.out.print(sum[1]);
        System.out.print(" ");
        System.out.print(avg[1]);
        System.out.println();

        System.out.print(name[2]);
        System.out.print(" ");
        System.out.print(kor[2]);
        System.out.print(" ");
        System.out.print(eng[2]);
        System.out.print(" ");
        System.out.print(math[2]);
        System.out.print(" ");
        System.out.print(sum[2]);
        System.out.print(" ");
        System.out.print(avg[2]);
        System.out.println();

        System.out.print(name[3]);
        System.out.print(" ");
        System.out.print(kor[3]);
        System.out.print(" ");
        System.out.print(eng[3]);
        System.out.print(" ");
        System.out.print(math[3]);
        System.out.print(" ");
        System.out.print(sum[3]);
        System.out.print(" ");
        System.out.print(avg[3]);
        System.out.println();

    }
}