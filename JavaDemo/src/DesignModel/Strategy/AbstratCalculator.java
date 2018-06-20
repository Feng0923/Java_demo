package DesignModel.Strategy;

public  abstract class AbstratCalculator {
    public int[] split(String expression,String opt){
        String[] split = expression.split(opt);
        int[] ints = new int[2];
        ints[0] = Integer.parseInt(split[0]);
        ints[1] = Integer.parseInt(split[1]);
        return ints;
    }
}
