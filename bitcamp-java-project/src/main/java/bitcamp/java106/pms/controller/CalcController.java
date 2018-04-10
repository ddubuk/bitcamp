package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;

@Component("calc")
public class CalcController implements Controller {
    Scanner keyScan;
    
    public CalcController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
        System.out.printf("식을 입력하세요?", option);
    }

}

/*
switch (op) {
case "+": return a + b;
case "-": return a - b;
case "*": return a * b;
case "/": return a / b;
default:
    throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
}*/