package DesignModel.Strategy;

public class Minus extends AbstratCalculator implements ICalculator {
    @Override
    public int calculate(String expression) {

        int[] split = split(expression, "-");
        return split[0]-split[1];
    }
}
