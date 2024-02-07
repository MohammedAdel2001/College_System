
package lab3;


public class Lab3 {

    
    public static void main(String[] args) {
        Person p1=new Person("adel",15000,2000,false);
        System.out.println(p1.getSalary()); 
        p1.setIsworking(true);
        System.out.println(p1.getSalary());
        System.out.println("net income:"+p1.net_income());
        Person p2=new Person("adel",15000,2000,true);
        System.out.println(p2.getSalary());
        System.out.println("net income:"+p2.net_income());      
        
        Person p3=new Person("mohamed");
        System.out.println(p3.getSalary());
        System.out.println("net income:"+p3.net_income()); 
        
        
        
         
        Courses first=new Courses("dataStructure", 3,7375 , "dr.Amr");
        Courses second=new Courses("algorithm", 3,7253 , "dr.Amr");
        Courses third=new Courses("os", 3, 2344, "dr.hossam");
        Courses fourth=new Courses("data1", 3,7375 , "dr.Amr");
        Courses fifth=new Courses("data2", 3,7253 , "dr.Amr");
        Courses six=new Courses("os", 3, 2344, "dr.hossam");
        Courses seventh=new Courses("math", 3,7375 , "dr.Amr");
        Student s1=new Student("adel", "0125464656");
        s1.Enroll(first);
        s1.printEnrolledCourses();
        //enroll same course
        
        s1.Enroll(third);
        s1.printEnrolledCourses();
        s1.Enroll(fourth);
        s1.printEnrolledCourses();
        s1.Enroll(fifth);
        s1.printEnrolledCourses();
        s1.Enroll(six);
        s1.printEnrolledCourses();
         s1.Enroll(seventh);
        s1.printEnrolledCourses();
        
        
        
        s1.PrintTotalCreditHours();
        System.out.println("courses of lecturer:");
        s1.PrintLecturerCourses("dr.hossam");

       Rifle p=new Rifle("m5",3,4);
       p.PrintData();
        System.out.println();
       suppressedRifle s = new suppressedRifle("m4", 3, 4, "Gemteck");
       
       s.PrintData();
        
        
    }
    
}
