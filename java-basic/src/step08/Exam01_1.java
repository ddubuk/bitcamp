// 인스턴스 변수 
package step08;

public class Exam01_1 {
    public static void main(String[] args) {
       class A {
       // 인스턴스 변수
       // => new 명령을 통해 생성된다.
       // => new 명령을 실행하기 전까지는 인스턴스 변수는 존재하지 않는다.
       // => Heap 영역에 생성된다.
       // => static이 붙지 않는다.
           int v1; // 4바이트 int 값을 저장할 메모리를 만들라는 명령!
           boolean v2; // true/false 논리값을 저장할 메모리를 만들라는 명령!
       // 이 명령은 new 명령을 실행할 때 비로소 실행된다.
       }  
       
       // A 클래스에 대해 new 명령을 사용하기 전에는 v1, v2 매모리는 존재하지 않는다.
       // 단지 설계도일 뿐이다.
       A obj1 = new A(); 
       A obj2 = new A();
       A obj3 = new A();
       
       // 이렇게 생성된 메모리를 "인스턴스", "객체"라고 부른다.
       // 이 인스턴스의 주소를 저장하는 boj1, obj2, obj3를 "레퍼런스"라 부른다.
       // 인스턴스가 생성될 때 만들어지는 v1, v2 변수를 "인스턴스 변수"라 부른다.

       // 인스턴스 변수는 레퍼런스를 통해 사용할 수 있다.
       obj1.v1 = 100;
       obj2.v1 = 200;
       obj3.v1 = 300;
       
       System.out.printf("%d, %d, %d\n", obj1.v1, obj3.v1, obj3.v1);
    }
}

// 인스턴스 변수는 new 명령을 실행할 때 마다 생성되기 때문에
// 각각 구분되는 개별 데이터를 저장할 때 사용한다.