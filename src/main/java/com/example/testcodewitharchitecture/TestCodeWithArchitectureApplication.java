package com.example.testcodewitharchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class TestCodeWithArchitectureApplication {

    public static void main(String[] args) {
        // SpringApplication.run(TestCodeWithArchitectureApplication.class, args);
        // 계산기
        Scanner scanner = new Scanner(System.in);
        System.out.println("두개의 숫자와 연산자를 입력하세요. (예: 3 + 4):");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        long num1 = Long.parseLong(parts[0]);
        long num2 = Long.parseLong(parts[2]);
        String operator = parts[1];
        long answer = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new InvalidOperaterException();
        };
        System.out.println("답: " + answer);


    }
}
