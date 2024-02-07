
package lab3;


public class Student {
    private String name;
    private String  phoneNumber;
    Courses[] enrolledCourses=new Courses[6];
    private int NumberOfCourses=0;
    public Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        
    
    }
    public void Enroll(Courses enrolledCourses){
        if(this.NumberOfCourses==6){
            System.out.println("You have reached the max limit");
        }
        else{
            int count=0;
            for (int i=0;i<this.NumberOfCourses;i++){
                if(this.enrolledCourses[i] == enrolledCourses){
                    count=1;
                    
                    
                }
                 
                }
            if(count == 0)
            {
                this.enrolledCourses[this.NumberOfCourses] = enrolledCourses;
                this.NumberOfCourses+=1;
            }
            else
            {
                    System.out.println("You already enrolled on this course");
                    System.out.println("");
            }
           
            
            
        }
        }
    public void printEnrolledCourses(){
        for(int i=0;i<this.NumberOfCourses;i++){
            System.out.println("Course "+(i+1)+":"+this.enrolledCourses[i].getName()+","+this.enrolledCourses[i].getCredite_hours()+","+this.enrolledCourses[i].getID()+","+this.enrolledCourses[i].getLecturerName());
            
        }
        System.out.println();
    }
    public void PrintTotalCreditHours(){
        int sum=0;
        for (int i=0;i<this.NumberOfCourses;i++){
            sum+=this.enrolledCourses[i].getCredite_hours();
            
            
        }
        System.out.println("Sum of Credit hours of his enrolled courses = "+sum);
        System.out.println("");
    }
     
    public void PrintLecturerCourses(String name){
        int count=0;
        for (int i=0;i<this.NumberOfCourses;i++){
            if(this.enrolledCourses[i].getLecturerName()==name){
                count++;
                 System.out.println("Course "+(i+1)+":"+this.enrolledCourses[i].getName()+","+this.enrolledCourses[i].getCredite_hours()+","+this.enrolledCourses[i].getID()+","+this.enrolledCourses[i].getLecturerName());
                
            }
            
        }
        if(count==0){
                System.out.println("No courses for this lecturer");
                System.out.println("");
            }
    }
            
                    
                    
    
}
