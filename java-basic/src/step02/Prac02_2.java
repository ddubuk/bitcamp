package step02;

public class Prac02_2 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.println("이름? ");
        System.out.println(keyScan.nextLine());
        System.out.println("나이? ");
        System.out.println(keyScan.nextline());
        System.out.println("학번? ");
        System.out.println(keyScan.nextLine());


    }
}