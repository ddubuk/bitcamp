// 애노테이션 프로퍼티 값 지정하기 - 프로퍼티 이름 생략
// => 애노테이션이름(프로퍼티명=값, 프로퍼티명=값, ...)
package step20.ex4;

@MyAnnotation("홍길동", tel="222-2222") // 프로퍼티가 2개일 땐, 생략불가
                                      // value 외 다른 프로퍼티 값도 지정할 경우, value 이름 생략 불가!
public class MyClass3 {

}