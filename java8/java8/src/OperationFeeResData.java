
public class OperationFeeResData {


    public static void main(String[] args) {
        OperationFeeResData operationFeeResData = new OperationFeeResData(null);

    }

    protected double feeAmount;

    public OperationFeeResData() {
    }

    public OperationFeeResData(Double feeAmount) {
        this.feeAmount = feeAmount;
    }
    /**
     * Gets the value of the feeAmount property.
     *
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     *
     */
    public void setFeeAmount(double value) {
        this.feeAmount = value;
    }

}
