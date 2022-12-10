/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.ArrayList;
import com.model.Enterprise;

/**
 *
 * @author ajitpatil//stores Enterprises
 */
public class EnterpriseDirectory {
    
    private ArrayList <Enterprise> enterpriselist;
    
    public EnterpriseDirectory(){
        
        this.enterpriselist= new ArrayList <Enterprise>();
    }
    
    public ArrayList<Enterprise> getEnterprise() {
		return enterpriselist;
	}
    
    public Enterprise addNewEnterprise() {
		 

		Enterprise newEnt= new Enterprise();
		enterpriselist.add(newEnt);
		return newEnt;
		
		
	}
    
    public void deleteEnterprise (int p) {
		enterpriselist.remove(p);
	}
	
	/*public void deleteCommunity (Community com) {
		communityList.remove(com);
	}*/
	
	
	public int getPosition(int pos) {
		enterpriselist.indexOf(pos);
		return pos-1;
		
	}
	
	public int getSize() {
	int size=enterpriselist.size();
	return size;
	}
	
	
    public void modifyEnterprise(Enterprise currentEnterprise, Enterprise newEnterprise,int position) 
    {
        //System.out.println(position);
        if(position >= 0) {
            modifyCommunity(position, newEnterprise);
        }
        
    }
        
        private void modifyCommunity(int position, Enterprise newEnterprise) {
            enterpriselist.set(position, newEnterprise);
           // System.out.println("Grocery item " + (position+1) + " has been modified.");
        }
	
        
       
    
    
}
