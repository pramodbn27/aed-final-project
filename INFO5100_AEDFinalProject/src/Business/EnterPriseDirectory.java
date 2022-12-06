/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author ajitpatil
 */
public class EnterPriseDirectory {
    
    private ArrayList  <Enterprise> enterpriseDirectory;
    
    
    
	public EnterPriseDirectory() {
		
		this.enterpriseDirectory= new ArrayList<Enterprise>();
		
	}
    public ArrayList<Enterprise> getEnterPrise() {
		return enterpriseDirectory;
	}
        
    
    
	public Enterprise addNewEnterPrise() {
		 

		Enterprise newEnt= new Enterprise();
		enterpriseDirectory.add(newEnt);
		return newEnt;	
	}
	
      public void deleteEnterPrise (int e) {
		enterpriseDirectory.remove(e);
	}  
        
        
       public void modifyEnterPrise(Enterprise currentEnterPrise, Enterprise newEnterprise,int position) 
    {
        //System.out.println(position);
        if(position >= 0) {
            modifyCommunity(position, newEnterprise);
        }
        
    }
        
        private void modifyCommunity(int position, Enterprise newEnterprise) {
            enterpriseDirectory.set(position, newEnterprise);
           // System.out.println("Grocery item " + (position+1) + " has been modified.");
        }
	
}
