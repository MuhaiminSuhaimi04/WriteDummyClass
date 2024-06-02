import java.util.ArrayList;
import java.util.List;

public class Machines {
    private List<Machine> machines;

    // Constructor
    public Machines() {
        this.machines = new ArrayList<>();
    }

    // Methods
    public void add(Machine machine) {
        machines.add(machine);
    }

    public void remove(Machine machine) {
        machines.remove(machine);
    }

    public void print() {
        for (Machine machine : machines) {
            System.out.println(machine.getName() + " - " + machine.getStatus());
        }
    }

    public Machine find(String name) {
        for (Machine machine : machines) {
            if (machine.getName().equals(name)) {
                return machine;
            }
        }
        return null;
    }
}

