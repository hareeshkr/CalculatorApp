package calculator;

public class Multiply implements Operate {
    @Override
    public Double getResult(Double... numbers){
        Double mul = 1.0;
        for(int i=0; i< numbers.length; i++){
            mul *= numbers[i];
        }
        return mul;
    }
}
