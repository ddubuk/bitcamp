package step02.assignment;
// 3단계: 변수 선언을 모아서 일괄적으로 처리하기
public class Prac01_3 {
    public static void main(String[] args) {

        String name1, name2, name3, name4;
        int kor1, kor2, kor3, kor4;
        int eng1, eng2, eng3, eng4;
        int math1, math2, math3, math4;
        int sum1, sum2, sum3, sum4;
        float avg1, avg2, avg3, avg4;

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? ");
        name1 = keyScan.next();
        kor1 = keyScan.nextInt();
        eng1 = keyScan.nextInt();
        math1 = keyScan.nextInt();   
        sum1 = kor1 + eng1 + math1;
        avg1 = sum1 / 3;

        System.out.print("입력? ");
        name2 = keyScan.next();
        kor2 = keyScan.nextInt();
        eng2 = keyScan.nextInt();
        math2 = keyScan.nextInt();
        sum2 = kor2 + eng2 + math2;
        avg2 = sum2 / 3;

        System.out.print("입력? ");
        name3 = keyScan.next();
        kor3 = keyScan.nextInt();
        eng3 = keyScan.nextInt();
        math3 = keyScan.nextInt(); 
        sum3 = kor3 + eng3 + math3;
        avg3 = sum1 / 3;

        System.out.print("입력? ");
        name4 = keyScan.next();
        kor4 = keyScan.nextInt();
        eng4 = keyScan.nextInt();
        math4 = keyScan.nextInt();   
        sum4 = kor4 + eng4 + math4;
        avg4 = sum4 / 3;

        System.out.println("--------------------------------------");
        System.out.print(name1);
        System.out.print(" ");
        System.out.print(kor1);
        System.out.print(" ");
        System.out.print(eng1);
        System.out.print(" ");
        System.out.print(math1);
        System.out.print(" ");
        System.out.print(sum1);
        System.out.print(" ");
        System.out.println(avg1);

        System.out.print(name2);
        System.out.print(" ");
        System.out.print(kor2);
        System.out.print(" ");
        System.out.print(eng2);
        System.out.print(" ");
        System.out.print(math2);
        System.out.print(" ");
        System.out.print(sum2);
        System.out.print(" ");
        System.out.println(avg2);

        System.out.print(name3);
        System.out.print(" ");
        System.out.print(kor3);
        System.out.print(" ");
        System.out.print(eng3);
        System.out.print(" ");
        System.out.print(math3);
        System.out.print(" ");
        System.out.print(sum3);
        System.out.print(" ");
        System.out.println(avg3);

        System.out.print(name4);
        System.out.print(" ");
        System.out.print(kor4);
        System.out.print(" ");
        System.out.print(eng4);
        System.out.print(" ");
        System.out.print(math4);
        System.out.print(" ");
        System.out.print(sum4);
        System.out.print(" ");
        System.out.println(avg4);
        

    }
}