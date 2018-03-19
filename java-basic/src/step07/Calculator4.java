// 메서드를 분류 - 인스턴스 메서드 사용 
// => 관련된 기능을 수행하는 메서드르르 한 그룹으로 묶는다.
package step07;

public class Calculator4 {
    int result = 0;
    
    // 인스턴스 변수를 다루는 메서드는 작업을 수행할 때 그 인스턴스 주소를 받아야 한다.  
    public static void plus(int value) {
        // result 는 더이상 클래스 변수가 아니기 때문에 직접 접근할 수 없다. 
        // 오직 인스턴스 주소를 통해서만 접근할 수 있다. 
        this.result += value;
    }
    public static void minus(int value) {
        this.result -= value;
        }
    public static void multiple(int value) {
        this.result *= value;
        }
    public static void divide(int value) {
        this.result /= value;
        }
}
