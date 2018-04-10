// finally블록
package step21.ex3;

import java.io.FileReader;
import java.util.Scanner;

    public class Exam06_3 {
        
        static class A {}
        
        static class B implements AutoCloseable {
            public void close() {}
            
        }
        
        static void m() throws Exception {
            
            try (A obj = new A();) {
                System.out.println("try 블록 실행... ");
                
                } 
            }
            
    public static void main(String[] args) throws Exception {
        
    }
}