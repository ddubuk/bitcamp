// 애노테이션 프로퍼티 값 지정하기 - 프로퍼티 이름 생략
// => 애노테이션이름(프로퍼티명=값, 프로퍼티명=값, ...)
package step20.ex4;

//@MyAnnotation(tel="222-2222") // OK!
@MyAnnotation("222-2222") // value 속성이 아닌 경우 생략 불가!
public class MyClass2 {

}
