// 에노테이션 유지정책
// => SOUCR : 소스파일에만 남긴다. 컴파일 후 제거된다.
// => CLASS : .class 파일에 남긴다. 그러나 실행 시에 추출할 수 없다.(기본)
// => RUNTIME : .class 파일에 남긴다. 실행 시에 추출할 수 있다.
package step20.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "홍길동";
                    // default 값이 있으면,
                    // 애노테이션을 사용할 때 값을 지정하지 않아도 된다.
}
