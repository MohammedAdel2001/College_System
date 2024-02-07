
package lab3;


public class Courses {
    private String Name;
    private int credite_hours;
    private int ID;
    private String LecturerName;
    
   public Courses(String name,int credite_hours,int id,String lecturername){
       
       this.LecturerName=lecturername;
       this.Name=name;
       this.credite_hours=credite_hours;
       this.ID=id;
   }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCredite_hours() {
        return credite_hours;
    }

    public void setCredite_hours(int credite_hours) {
        this.credite_hours = credite_hours;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLecturerName() {
        return LecturerName;
    }

    public void setLecturerName(String LecturerName) {
        this.LecturerName = LecturerName;
    }
   
   
}