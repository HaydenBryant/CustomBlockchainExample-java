package Ex2;

import java.util.Objects;

public class Transaction {

    private String sourceName;
    private String destination;
    private Long amount;

    @Override
    public String toString() {
        return "Transaction{" +
                "sourceName='" + sourceName + '\'' +
                ", destination='" + destination + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Transaction(String sourceName, String destination, Long amount) {
        this.sourceName = sourceName;
        this.destination = destination;
        this.amount = amount;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(sourceName, that.sourceName) &&
                Objects.equals(destination, that.destination) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceName, destination, amount);
    }
}
