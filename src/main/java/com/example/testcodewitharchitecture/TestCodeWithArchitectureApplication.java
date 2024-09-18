package com.example.testcodewitharchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class TestCodeWithArchitectureApplication {

    public static void main(String[] args) {
        // SpringApplication.run(TestCodeWithArchitectureApplication.class, args);
        CalculationRequest calculationRequest = new CalculationRequestReader().read();
        long answer = new Calculator().calculate(
                calculationRequest.getNum1(),
                calculationRequest.getOperator(),
                calculationRequest.getNum2()
        );
        System.out.println("Answer: " + answer);



    }
}
