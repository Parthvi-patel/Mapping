package Task1;

public class Insurance {
    int cilentId;
    int insuranceId;
    String insuranceType;

    public Insurance(int cilentId, int insuranceId, String insuranceType) {
        this.cilentId = cilentId;
        this.insuranceId = insuranceId;
        this.insuranceType = insuranceType;
    }

    public int getCilentId() {
        return cilentId;
    }

    public void setCilentId(int cilentId) {
        this.cilentId = cilentId;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "cilentId=" + cilentId +
                ", insuranceId=" + insuranceId +
                ", insuranceType='" + insuranceType + '\'' +
                '}';
    }
}
