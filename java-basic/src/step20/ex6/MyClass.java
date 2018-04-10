// 애노테이션 프로퍼티 값 지정하기 - 프로퍼티 이름 생략
// => 애노테이션이름(프로퍼티명=값, 프로퍼티명=값, ...)
package step20.ex6;

// @MyAnnotation은 메서드와 타입(인터페이스와 클래스)에만 붙일 수 있다.
@MyAnnotation // ok!
public class MyClass {
    @MyAonnotation int i; // 컴파일 오류!
    
    // @MyAnnotation은 메서드에서만 붙일 수 있다.
    @MyAnnotation public void m() {}
}