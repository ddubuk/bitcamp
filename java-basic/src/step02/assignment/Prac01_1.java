package step02.assignment;
// 1단계: 1명의 성적 데이터 입력 받아서 처리하기
public class Prac01_1 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? ");
        String name = keyScan.next();
        int kor = keyScan.nextInt();
        int eng = keyScan.nextInt();
        int math = keyScan.nextInt();

        int sum = kor + eng + math;
        int avg = sum / 3;

        System.out.println("-------------------------");
        System.out.print(name);
        System.out.print(" ");
        System.out.print(kor);
        System.out.print(" ");
        System.out.print(math);
        System.out.print(" ");
        System.out.print(sum);
        System.out.print(" ");
        System.out.println(avg);



    }
}