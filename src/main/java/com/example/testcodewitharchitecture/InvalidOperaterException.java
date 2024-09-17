package com.example.testcodewitharchitecture;

public class InvalidOperaterException extends RuntimeException {
    public InvalidOperaterException() {
        super("연산자를 잘못 입력하셨습니다. +, -, *, / 중에서 선택하세요.");
    }
}
