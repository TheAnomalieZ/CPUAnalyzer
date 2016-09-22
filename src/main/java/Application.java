import com.jrockit.mc.flightrecorder.FlightRecording;
import com.jrockit.mc.flightrecorder.FlightRecordingLoader;
import com.jrockit.mc.flightrecorder.spi.IView;

import java.io.File;
import java.util.ArrayList;

public class Application {

    final static String FILE_PATH = "/home/mani/Documents/Semester-VII/FYP/JFR/old_big.jfr";

    public static void main(String[] args) {
        ArrayList<CPULoadEvent> eventList= new ArrayList<CPULoadEvent>();
        FlightRecording recording = FlightRecordingLoader.loadFile(new File(FILE_PATH));
        IView view = recording.createView();

        CPULoadHandler cpuLoadHandler = new CPULoadHandler(view,eventList);
        cpuLoadHandler.configureEvent();

        for(int i=0;i<eventList.size();i++){
            try{
                System.out.println(eventList.get(i).getStartTime()-eventList.get(i-1).getStartTime()+"  "+eventList.get(i).getJvmUser());
            }catch(IndexOutOfBoundsException e){

            }
        }

    }
}
