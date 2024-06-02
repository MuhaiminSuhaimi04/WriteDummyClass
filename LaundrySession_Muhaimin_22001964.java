public class LaundrySession {
    private String start;
    private String expectedEnd;
    private String status;
    private String sessionType;
    private Machine machine;
    private Client client;

    // Constructor
    public LaundrySession(String start, String expectedEnd, String status, String sessionType) {
        this.start = start;
        this.expectedEnd = expectedEnd;
        this.status = status;
        this.sessionType = sessionType;
    }

    // Getters and Setters
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getExpectedEnd() {
        return expectedEnd;
    }

    public void setExpectedEnd(String expectedEnd) {
        this.expectedEnd = expectedEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
