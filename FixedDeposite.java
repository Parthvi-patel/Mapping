package Task1;

public class FixedDeposite {

    int clientId;
    int fdId;

    public FixedDeposite(int clientId, int fdId) {
        this.clientId = clientId;
        this.fdId = fdId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getFdId() {
        return fdId;
    }

    public void setFdId(int fdId) {
        this.fdId = fdId;
    }

    @Override
    public String toString() {
        return "FixedDeposite{" +
                "clientId=" + clientId +
                ", fdId=" + fdId +
                '}';
    }
}
