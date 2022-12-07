package Week_5;

public class Locker {
    private String nummer;
    private int cijfer;
    private String Status;

    public Locker(String nummer, int cijfer, String status) {
        this.nummer = nummer;
        this.cijfer = cijfer;
        Status = status;
    }

    public String getNummer() {
        return nummer;
    }

    public int getCijfer() {
        return cijfer;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
