public class VectorMaths {
    private double[] vector;
    private Operation operation;

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public VectorMaths(double[] vector) {
        this.vector = vector;
    }

    public double getResult(){
        if(operation == null){
            throw new UnsupportedOperationException();
        }
        return operation.execute(vector);
    }
}
