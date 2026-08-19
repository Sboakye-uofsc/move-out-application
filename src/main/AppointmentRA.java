import java.util.ArrayList;

public class AppointmentRA {
    private RA ra;

    private int unavailable;
    private int startTime;
    private int endTime;
    private ArrayList<Integer> trackerTime;
    
    public AppointmentRA(){
        super();
    }

    public void setUnavailable(int unavailable){
        
        while(unavailable >= getStartTime() && unavailable <= getEndTime()){
            trackerTime.add(trackerTime.size());
            unavailable++;
        }
    }

    public int getUnavailable(){
        return unavailable;
    }

    public void undoUnavailable(){
        if(unavailable != 0){
            trackerTime.remove(trackerTime.size());
            unavailable--;
        }
    }

    public void setStartTime(int startTime){
        trackerTime.add(startTime);
    }

    public int getStartTime(){
        return startTime;
    }

    public void setEndTime(int endTime){
        trackerTime.add(endTime);
    }

    public int getEndTime(){
        return endTime;
    }
}