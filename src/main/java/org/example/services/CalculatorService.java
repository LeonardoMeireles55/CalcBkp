package org.example.services;
import org.example.enums.Sign;
import java.util.ArrayList;
public class CalculatorService {
    private final ArrayList<Double> memory = new ArrayList<>();

    //By: Leonardo.
    public Double operation(Sign sign, Double x, Double y) {
        double result = switch (sign) {
            case SUM -> x + y;
            case MINUS -> x - y;
            case MULTIPLY -> x * y;
            case DIVISION -> x / y;
            case MODULUS -> x % y;
        };

        memory.add(result);
        return result;
    }

    public Double getMemory() {
        return new ArrayList<>(memory).stream().reduce(0.0, Double::sum);
    }
}