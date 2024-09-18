package com.example.testcodewitharchitecture;

// 입력 길이가 3이 아닐 때 발생하는 예외
public class BadRequestException extends RuntimeException {
    public BadRequestException() {
        super("입력값이 잘못되었습니다. 숫자 연산자 숫자 형태로 입력하세요.");
    }
}
