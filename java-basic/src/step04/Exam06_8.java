// 증감 연산자 : 전위(pre-fix) 감소 연산자 응용
package step04;

public class Exam06_8 {
    public static void main(String[] args) {
        int i = 2;
        
        int result = ++i + ++i * ++i;
        //1) int result = 3 + 4 * 5;
        //2) int result = 3 + 20;
        //3) int result = 23;
        
        System.out.println(i);  //23


//주의!
//1) pre-fix 연산자와 post-fix 연산자를 리터럴에 적용할 수 없다.
//int x = ++100;  //컴파일 오류
//x = 100++;  //컴파일 오류

//2) 변수에 동시에 적용할 수 없다.
int y = 100;
//++y++;  //컴파일 오류
//(++y)++;  //컴파일 오류 //값에 대해서 ++이 적용이 되지 않는다(리터럴에 적용x)
///++(y++); //컴파일 오류


    }
}