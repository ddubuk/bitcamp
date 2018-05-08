// 프로퍼티 에디터 - 기본으로 내장된 프로퍼티 에디터 
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam01 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-01.xml");
        
        System.out.println(iocContainer.getBean("c1"));
    }

}




