//흐름 제어문 - else문의 소속
package step05;

public class Exam01_5 {
    public static void main(String[] args) {
        
        int age = 15;

        
        //else는 가장 가까운 if에 소속된다.
        //들여쓰기에 속지말라
        if (age >= 19) {
            if (age >= 70)
                System.out.println("지하철 무임승차 가능합니다.");
        else
            System.out.println("미성년입니다.");
    }
      //else문은 if없이 단독으로 사용할 수 없다. 오직 if가 있어야만 사용할 수 있다.
      //그래서 if~else 한 문장으로 취급한다.
      //그런이유로 if (age >= 70 ) ~ else는 한 문장으로 간주한다.
      //만약 else문을 첫번째 if문에 소속되게 하고 샆다면
      //다음과 같이 두 번째 if문을 블록으로 묶어라!
      if (age >= 19) {
        if (age >= 70)
            System.out.println("지하철 무임승차 가능합니다.");
        else
            System.out.println("미성년입니다.");
        }
    }
}