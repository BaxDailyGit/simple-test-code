package com.example.testcodewitharchitecture;

public class CalculationRequest {
    private final long num1;
    private final long num2;
    private final String operator;

    public CalculationRequest(String[] parts) {
        this.num1 = Long.parseLong(parts[0]);
        this.num2 = Long.parseLong(parts[2]);
        this.operator = parts[1];
    }

    public long getNum1() {
        return num1;
    }

    public long getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
