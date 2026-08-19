public class AppointmentRA {
    private RA ra;

    private int unavailable;
    private int startTime;
    private int endTime;
    
    public AppointmentRA(){
        this.unavailable = unavailable;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setUnavailable(int unavailable){
        if(startTime != 0){
            for(int i = 0; i < 10; i++){
                unavailable.getRAUnavailable();
            }
        }
    }

    public int getUnavailable(){
        return unavailable;
    }

    public void undoUnavailable(){
        if(unavailable != 0){
            unavailable--;
        }
    }

    public void setStartTime(int startTime){
        int startTime = 0;

        
    }

    public int getStartTime(){
        return startTime;
    }

    public void setEndTime(int endTime){

    }

    public int getEndTime(){
        
    }
}