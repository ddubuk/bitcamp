package step02.assignment;

public class Test03_1 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] ave = new float[5];

        for(int i = 0; i < 5; i++){
            
            System.out.print("입력? ");
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
            sum[i] = kor[i] + eng[i] + math[i];
            ave[i] = sum[i] / 3;

        }

        System.out.println("==========================");

        for(int i = 0; i < 5; i++){

            System.out.printf("%s, %d, %d, %d, %d, %f", name[i], kor[i], eng[i], math[i], sum[i], ave[i]);
        }



    }
}