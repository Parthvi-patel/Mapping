package Task1;

public class mutual_fund {
    int clientId;
    int mfId;


    public mutual_fund(int clientId, int mfId) {
        this.clientId = clientId;
        this.mfId = mfId;
    }



    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getMfId() {
        return mfId;
    }

    public void setMfId(int mfId) {
        this.mfId = mfId;
    }

    @Override
    public String toString() {
        return "mutual_fund{" +
                "clientId=" + clientId +
                ", mfId=" + mfId +
                '}';
    }
}
