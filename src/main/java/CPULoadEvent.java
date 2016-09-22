/**
 * Created by mani on 9/15/16.
 */
public class CPULoadEvent {


    private long startTime;
    private long endTime;
    private String jvmUser;
    private String jvmSystem;
    private String machineTotal;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getJvmUser() {
        return jvmUser;
    }

    public void setJvmUser(String jvmUser) {
        this.jvmUser = jvmUser;
    }

    public String getJvmSystem() {
        return jvmSystem;
    }

    public void setJvmSystem(String jvmSystem) {
        this.jvmSystem = jvmSystem;
    }

    public String getMachineTotal() {
        return machineTotal;
    }

    public void setMachineTotal(String machineTotal) {
        this.machineTotal = machineTotal;
    }


}
