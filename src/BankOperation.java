public class BankOperation {

    private long id;

    private double amount;

    private long fromid;

    private long toid;
    private OperationType type;

    private static final double BASE_CREDIT_RETE = 1.0;

    public BankOperation(long id, double amount, long fromid, long toid, OperationType type)
    {
        this.id = id;
        this.amount = amount;
        this.fromid = fromid;
        this.toid = toid;
        this.type = type;
    }


    public double calculateCreditRate() {
        if (type != null) {
            return type.getCreditRate();
        }

        return BASE_CREDIT_RETE;
    }

    @Override
    public String toString() {
        return "BankOperation{" +
                "id=" + id +
                ", amount=" + amount +
                ", fromid=" + fromid +
                ", toid=" + toid +
                ", type=" + type +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getFromid() {
        return fromid;
    }

    public void setFromid(long fromid) {
        this.fromid = fromid;
    }

    public long getToid() {
        return toid;
    }

    public void setToid(long toid) {
        this.toid = toid;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankOperation that = (BankOperation) o;

        if (id != that.id) return false;
        if (Double.compare(amount, that.amount) != 0) return false;
        if (fromid != that.fromid) return false;
        if (toid != that.toid) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (fromid ^ (fromid >>> 32));
        result = 31 * result + (int) (toid ^ (toid >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
