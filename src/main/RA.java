public class RA extends User {

    private Resident residentAssigned;
    private AppointmentRA unavailable;
    private RA otherRA;

    public RA(){
        super();
    }

    public RA(String username, String password){
        super(username, password);
        this.type = "RA";
    }

    public void setRAUnavailable(AppointmentRA unavailable){
        if(unavailable){
            
        }
    }

    public AppointmentRA getRAUnavailable(){
        return unavailable;
    }

    public void veiwOtherRA(RA otherRa){

    }

    public void assignedResident(Resident residentAssigned){

    }

    public static void main(String[] args) {
        
    }
}