package bitcamp.java106.pms;

public class app2 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        
        String s1, s2, s3, s4, s5;
        
        System.out.print("팀명? ");
        s1 = keyScan.nextLine();

        System.out.print("설명? ");
        s2 = keyScan.nextLine();

        System.out.print("최대인원? ");
        s3 = keyScan.nextLine();

        System.out.print("시작일? ");
        s4 = keyScan.nextLine();

        System.out.print("종료일? ");
        s5 = keyScan.nextLine();
        
        System.out.println("---------------");
        
        System.out.print("팀명: ");
        System.out.println(s1);
        System.out.print("설명: ");
        System.out.println(s2);
        System.out.print("최대인원: ");
        System.out.println(s3);
        System.out.print("일자: ");
        System.out.print(s4);
        System.out.print(" ~ ");
        System.out.print(s5);

    }    
}
