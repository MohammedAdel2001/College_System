
package lab3;


public class  suppressedRifle extends Rifle{
    private String suppressorBrand;
    public suppressedRifle(String Name, int Damage, int Speed,String suppressorBrand)
    {
        super(Name ,Damage ,Speed);
        this.suppressorBrand=suppressorBrand;
        
    }
    @Override
    public void hit(){
        System.out.println("suppressed hit");
        
        System.out.println("");
    }

    public void IncreaseDamage(){
        this.setDamage(this.getDamage()+1);
    }
    @Override
    public void PrintData()
    {
        super.PrintData();
        System.out.println(","+this.suppressorBrand);
    }

    
    
}
