class Machine {
    private String type;
    private String name;
    private int load;
    private boolean currentSession;
    private String status;

    public Machine(String type, String name, int load, boolean currentSession, String status) {
        this.type = type;
        this.name = name;
        this.load = load;
        this.currentSession = currentSession;
        this.status = status;
    }

    public void startSession() {
        if (status.equals("ok")) {
            currentSession = true;
            System.out.println(f"Machine {name} session started successfully.");
        } else {
            System.out.println(f"Machine {name} is not in OK status. Please fix the issue before starting a session.");
        }
    }

    public void endSession() {
        if (currentSession) {
            currentSession = false;
            System.out.println(f"Machine {name} session ended successfully.");
        } else {
            System.out.println(f"Machine {name} is not currently in a session.");
        }
    }

    public void checkStatus() {
        System.out.println(f"Machine {name} status: {status}");
    }
}

// Create a dummy washing machine
Machine washingMachine = new Machine("Washing Machine", "My Washer", 5, false, "ok");

// Start a session
washingMachine.startSession();

// Check status
washingMachine.checkStatus();


washingMachine.endSession();