import com.jrockit.mc.flightrecorder.spi.IEvent;
import com.jrockit.mc.flightrecorder.spi.IView;

import java.util.ArrayList;
import java.util.List;


public class CPULoadHandler {

    private final IView view;
    private final List<CPULoadEvent> eventList;
    private final String EVENT_TYPE = "CPU Load";

    public CPULoadHandler(IView view, ArrayList<CPULoadEvent> eventList){
        this.eventList = eventList;
        this.view = view;
    }

    public void configureEvent() {
        for (IEvent event : view) {
            if(EVENT_TYPE.equals(event.getEventType().getName())){
                CPULoadEvent cpuLoadEvent = new CPULoadEvent();

                cpuLoadEvent.setStartTime(event.getStartTimestamp());
                cpuLoadEvent.setEndTime(event.getEndTimestamp());
                cpuLoadEvent.setJvmUser(event.getValue("jvmUser").toString());
                cpuLoadEvent.setJvmSystem(event.getValue("jvmSystem").toString());
                cpuLoadEvent.setMachineTotal(event.getValue("machineTotal").toString());

                eventList.add(cpuLoadEvent);

            }
        }
    }
}
