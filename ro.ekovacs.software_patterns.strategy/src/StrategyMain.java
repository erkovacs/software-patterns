public class StrategyMain {
    public static void main(String[] args){
        final double[] vector = {1.2, 2.5, 5, 6, 21, 43, 55, 87, 102.5};
        VectorMaths vectorMaths = new VectorMaths(vector);

        vectorMaths.setOperation(new Summation());
        double sum = vectorMaths.getResult();
        System.out.println(String.format("The sum is : %.2f", sum));

        vectorMaths.setOperation(new Averaging());
        double avg = vectorMaths.getResult();
        System.out.println(String.format("The average is : %.2f", avg));
    }
}
