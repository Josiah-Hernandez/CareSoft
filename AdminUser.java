package com.caresoft.clinicapp;
import java.util.*;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{
	//... imports class definition...

	    private Integer employeeID;
	    private String role;
	    private ArrayList<String> securityIncidents;




	    public AdminUser(Integer id, String role) {
	        super(id);
	        this.role = role;
	    }
	    // Inside class:




	    // TO DO: Implement a constructor that takes an ID and a role

	    // TO DO: Implement HIPAACompliantUser!
	    // TO DO: Implement HIPAACompliantAdmin!




	    public void newIncident(String notes) {
	        String report = String.format(
	            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
	            new Date(), this.id, notes
	        );
	        securityIncidents.add(report);
	    }



	    public void authIncident() {
	        String report = String.format(
	            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
	            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
	        );
	        securityIncidents.add(report);


	    // TO DO: Setters & Getters
	    }
	    public Integer getEmployeeID() {
	        return employeeID;
	    }
	    public void setEmployeeID(Integer employeeID) {
	        this.employeeID = employeeID;
	    }
	    public String getRole() {
	        return role;
	    }
	    public void setRole(String role) {
	        this.role = role;
	    }



	    public ArrayList<String> getSecurityIncidents() {
	        return securityIncidents;
	    }



	    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
	        this.securityIncidents = securityIncidents;
	    }

	    @Override
	    public boolean accessAuthorized(Integer confirmAuthID) {
	        if (this.id == confirmAuthID) {//assuming this  one is the same then returns it true
	            return true;
	        } else {
	            return false;
	        }
	    }

	    @Override
	    public boolean assignPin(int pin) {
	        String pinString=Integer.toString(pin);
	        if (pinString.length() == 6) {
	            return true;
	        }
	        else {
	            return false;

	    }
	    }


//	    public boolean accessAuthorized(Integer confirmedAuthID) {
//	        // TODO Auto-generated method stub
//	        if (this.id == confirmedAuthID) {
//	            return true;
//	            }
////	            this.authIncident();


	    @Override
	    public ArrayList<String> reportSecurityIncidents() {
	        // TODO Auto-generated method stub
	        return null;
	    }
	}

