// 에노테이션 유지정책
// => SOUCR : 소스파일에만 남긴다. 컴파일 후 제거된다.
// => CLASS : .class 파일에 남긴다. 그러나 실행 시에 추출할 수 없다.(기본)
// => RUNTIME : .class 파일에 남긴다. 실행 시에 추출할 수 있다.
package step20.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
    String value(); // default 값을 지정하지 않으면 필수 프로퍼티
                    // 즉, 애노테이션을 사용할 때 반드시 값을 지정해야 한다.
}
