package software;

import java.util.ArrayList;

public class Driver {
    protected String driverLicense;
    protected String nationalId;
    protected ArrayList<Area> favArea;
    protected Rating rate;
    protected double avgUserRate;
    
    public void createRegistration(Driver driver){// initializing driver
        this.avgUserRate=driver.avgUserRate;
        this.driverLicense=driver.driverLicense;
        this.favArea=driver.favArea;
        this.nationalId=driver.nationalId;
        this.rate=driver.rate;
    }
    
    public boolean checkRegistration(){
        return false;
       
    }
    
    public boolean checkId(String nationalId){
        return this.nationalId.equals(nationalId);
    }
    
    public void addFavArea(Area area){
        
    }
    
    public void notification(){
        
        
    }
    
    public void showRates(){
        
    }


}
