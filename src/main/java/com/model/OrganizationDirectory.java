/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.ArrayList;
import com.model.Organization;

/**
 *
 * @author ajitpatil//stores Enterprises
 */
public class OrganizationDirectory {
    
    private ArrayList <Organization> organizationlist;
    
    public OrganizationDirectory(){
        
        this.organizationlist= new ArrayList <Organization>();
    }
    
    public ArrayList<Organization> getOrganization() {
        
		return organizationlist;
	}
    
    public Organization addNewOrganization() {
		 

		Organization newOrg= new Organization();
		organizationlist.add(newOrg);
		return newOrg;
		
		
	}
    
    public void deleteOrganization (int p) {
		organizationlist.remove(p);
	}
	
	/*public void deleteCommunity (Community com) {
		communityList.remove(com);
	}*/
	
	
	public int getPosition(int pos) {
		organizationlist.indexOf(pos);
		return pos-1;
		
	}
	
	public int getSize() {
	int size=organizationlist.size();
	return size;
	}
	
	
    public void modifyOrganization(Organization currentOrganization, Organization newOrganization,int position) 
    {
        //System.out.println(position);
        if(position >= 0) {
            
            modifyOrganization(position, newOrganization);
        }
        
    }
        
        private void modifyOrganization(int position, Organization newOrganization) {
            organizationlist.set(position, newOrganization);
           // System.out.println("Grocery item " + (position+1) + " has been modified.");
        }
	
        
       
    
    
}
