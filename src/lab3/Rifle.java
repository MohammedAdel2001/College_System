
package lab3;

public class Rifle {
    
    private String Name;
    private int Damage;
    private int DPS;
    private int Speed;

    public Rifle(String Name, int Damage, int Speed) {
        this.Name = Name;
        this.Speed = Speed;
        
        this.Damage = Damage;
        
        this.DPS=this.Speed*this.Damage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        if(Damage>0 &&Damage<100){
            this.Damage = Damage;
            this.DPS=this.Speed*this.Damage;
            }
        else{
            System.out.println("Damage should be a positive number less than 100");
            System.out.println("");
        }
        }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
        this.DPS=this.Speed*this.Damage;
    }

    public int getDPS() {
        return DPS;
    }
    
    public void hit(){
        System.out.println("hit");
        System.out.println("");
    }
    
    public void PrintData(){
        System.out.print(this.Name+","+this.Damage+","+this.Speed+","+this.DPS);
        
        
    }
    
}
