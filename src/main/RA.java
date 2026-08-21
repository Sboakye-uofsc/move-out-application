import java.util.Scanner;

public class RA extends User {

    private Resident residentAssigned;
    private AppointmentRA unavailable;
    private RA otherRA;
    private static AppointmentRA ra = new AppointmentRA();

    public RA(){
        super();
    }

    public RA(String username, String password){
        super(username, password);
        this.type = "RA";
    }

    public void setRAUnavailable(int unavailable, int unRA){
        
        if(ra.getUnavailable() <= 0){
           ra.setStartTime(unavailable);
           ra.setEndTime(unRA);
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
        Scanner keyboard = new Scanner(System.in);
        RA raVeiw = new RA();
        int start = keyboard.nextInt();
        int end = keyboard.nextInt();
        
        raVeiw.setRAUnavailable(start, end);
        
        System.out.println(ra.getUnavailable());
    }
}