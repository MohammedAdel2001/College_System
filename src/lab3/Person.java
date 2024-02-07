/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Lenovo
 */
public class Person {
   private String Name;
    
    private double Salary;
    private boolean isworking;
    private double Monthly_Expensive;
    private double Default_salary=1000;
    
    public Person(String name){
        this.Name=name;
        this.Salary=0;
        this.Monthly_Expensive=0;
        this.isworking=false;
    }
    
    public Person(String name,double salary,double monthlyexpensive,boolean isworking){
        this.Monthly_Expensive=monthlyexpensive;
        this.Salary=salary;
        this.Name=name;
        this.isworking=isworking;
        this.setSalary(salary);
        
        
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        if(this.isworking==true && Salary<=0){
            this.Salary=this.Default_salary;
        }
        else  if( this.isworking==false){
           
            this.Salary=0;
        }
        
        else{
            this.Salary = Salary;
        }
    }

    public boolean getIsworking() {
        return isworking;
    }

    public void setIsworking(boolean isworking) {
        this.isworking = isworking;
        if(this.isworking==false){
            this.setSalary(0);
        }
        else
            this.setSalary(this.Salary);
    }

    public double getMonthly_Expensive() {
        return Monthly_Expensive;
    }

    public void setMonthly_Expensive(double Monthly_Expensive) {
        this.Monthly_Expensive = Monthly_Expensive;
    }

    public double getDefault_salary() {
        return Default_salary;
    }

  
    
    public double net_income(){
        
        return (this.Salary-this.Monthly_Expensive);
    }
}
