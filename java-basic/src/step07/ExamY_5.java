// 메서드 분류 - 인스턴스 변수와 인스턴스 메서드 
package step07;

public class ExamY_5 {
    public static void main(String[] args) {
        // 클래스 변수는 오직 한 개만 존재하기 때문에
        // 여러 개의 작업을 분리하여 진행할 수 없다.
        
        // 다음 두 개의 식을 분리하여 계산해보자.
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
        // => 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
        
        // 두 개의 식의 계산 결과를 따로 관리하기 위해서는
        // result 변수를 개별적으로 생성해야 한다.
        Calculator4 c1 = new Calculator4(); //식1의 계산 결과를 보관할 메모리 준비 
        Calculator4 c2 = new Calculator4(); //식2의 계산 결과를 보관할 메모리 준비 
        
        // 계산을 수행할 때 계산 결과를 보관할 메모리를 전달하라!
        // => 인스턴스 메서드를 사용하면 파라미터로 메모리 주소를 전달할 필요가 없다. 
        c1.plus(2);
        c2.plus(3);
        
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);
        
        // 식 1의 계산 결과는 c1 인스턴스의 result에 들어 있고,
        // 식 2의 계산 결과는 c2 인스턴스의 result에 들어 있다. 
        System.out.printf("c1.result = %d\n", c1.result);
        System.out.printf("c2.result = %d\n", c2.result);

    }
}

// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타압 만들 때
//  - 즉, 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
//  - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.