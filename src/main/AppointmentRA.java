import java.util.ArrayList;

public class AppointmentRA {

    private int unavailable;
    private int startTime;
    private int endTime;
    private ArrayList<Integer> trackerTime = new ArrayList<>();
    
    public AppointmentRA(){
        startTime = -1;
        endTime = -1;
    }

    public void setUnavailable(){
        unavailable = 0;
        if(startTime != -1 && endTime != -1){
            if(getStartTime() < getEndTime()) {
                for(int i = getStartTime(); i <= getEndTime(); i++){
                    trackerTime.add(i);
                    unavailable++;
                }
            }
        }
    }

    public int getUnavailable(){
        return unavailable;
    }

    public void undoUnavailable(){
        if(unavailable != 0){
            trackerTime.remove(trackerTime.size() - 1);
            unavailable--;
        }
    }

    public void setStartTime(int startTime){
        this.startTime = startTime;
        trackerTime.add(startTime);
    }

    public int getStartTime(){
        return startTime;
    }

    public void setEndTime(int endTime){
        this.endTime = endTime;
        trackerTime.add(endTime);
    }

    public int getEndTime(){
        return endTime;
    }

    public static void main(String[] args){
        AppointmentRA appointment = new AppointmentRA();
        appointment.setStartTime(11);
        appointment.setEndTime(13);
        appointment.setUnavailable();
        System.out.println(appointment.getUnavailable());
        
        appointment.setStartTime(15);
        appointment.setEndTime(18);
        appointment.setUnavailable();
        System.out.println(appointment.getUnavailable());
    }
}