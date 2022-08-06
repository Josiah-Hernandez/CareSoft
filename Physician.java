package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	//... imports class definition...


	    // Inside class:
	    private ArrayList<String> patientNotes;

	    // TO DO: Constructor that takes an ID
	    // TO DO: Implement HIPAACompliantUser!
	    public Physician(Integer id) { //Calling id from user class (parent) importing into physician(child) class
	        super(id);
	    }


	    public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }


	    public ArrayList<String>getPatientNotes() {

	        return patientNotes;
	    }

	    public void setPatientNotes(ArrayList<String>patientNotes) {

	        this.patientNotes = patientNotes;
	    }


	    //getters and setters
	    @Override
	    public boolean assignPin(int pin) {
	        String pinconvertedstring = Integer.toString(pin);
	        if (pinconvertedstring.length() == 4 ){
	            return true;
	        }
	        else {
	            return false;
	        }
	    }
	    //F both these algos ^ 
	    @Override
	    public boolean accessAuthorized(Integer confirmAuthID) {
	        if (this.id == confirmAuthID) {//assuming this  one is the same then returns it true
	            return true;
	        } else {
	            return false;
	        }


	    }


	 }