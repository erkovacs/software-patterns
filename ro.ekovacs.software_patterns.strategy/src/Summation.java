public class Summation implements Operation {
    @Override
    public double execute(double[] args) {
        double sum = 0;
        for(double arg : args){
            sum += arg;
        }
        return sum;
    }
}
