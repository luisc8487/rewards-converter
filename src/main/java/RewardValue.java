public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return (int) (this.milesValue);
    }
}