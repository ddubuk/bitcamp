// 에노테이션 유지정책
// => SOUCR : 소스파일에만 남긴다. 컴파일 후 제거된다.
// => CLASS : .class 파일에 남긴다. 그러나 실행 시에 추출할 수 없다.(기본)
// => RUNTIME : .class 파일에 남긴다. 실행 시에 추출할 수 있다.
package step20.ex2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 애노테이션의 유지 정책을 지정하지 않으면 기본이 CLASS이다.
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
    String value();
}
