// 에노테이션 프로퍼티 - 타입
package step20.ex6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target을 사용하여 애노테이션을 붙일 수 있는 범위를 지정할 수 있다.
@Target(ElementType.METHOD, ElemementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String v1() default "가나다";
    int v2() default 100;
    float v3() default 3.14f;
}
