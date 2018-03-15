// 논리 연산자 : && vs &, || vs |
package step04;

public class Exam03_3 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean r = a && (b = true); //a가 false이므로 b는 실행하지 않는다.
                                     //2개 짜리는 효율 연산이다.
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
                
        a = false;
        b = false;
        r = a & (b = true); //뒤에 있는 (b = true)가 실행되면서 b가 true가 된다. //끝까지 실행
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    }
}

//&&, ||
//앞의 피연산자의 값으로 결과를 알 수 있다면 뒤의 명령은 실행하지 않는더,

//&, ||
//앞의 피연산자로 결과를 알 수 있을 지라도, 뒤에 놓인 명령까지 모두 실행한다.