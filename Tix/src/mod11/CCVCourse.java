package mod11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CCVCourse {
	
	private int courseNumber;
	private String instructor;
	private List<CCVStudent> roster;
	
	public CCVCourse(int courseNumber, String instructor) {
		this.courseNumber = courseNumber;
		this.instructor = instructor;
		
		//instantiate roster
		roster = new ArrayList<CCVStudent>();
		
	}
	
	public static void main(String[] args) {
		//create a CCVCourse called interJ with course number 2272
		//and instructor MacFadyen
		CCVCourse interJ = new CCVCourse(2272,"macFadyen");
		
		//create a new CCVStudent
		CCVStudent matt = new CCVStudent("Matt", 227, "Bennington");
		
		//add the student to the roster (note-- use interJ.roster to access the roster)
		interJ.roster.add(matt);
		
		//create another new CCVStudent and add  to the roster
		CCVStudent courtney = new CCVStudent("Courtney", 102, "Bennington");
		interJ.roster.add(courtney);
		
		//create another new CCVStudent & to the FIRST position in the roster
		CCVStudent jack = new CCVStudent("Jack", 457, "Bennington");
		interJ.roster.add(0,jack);
		
		//print the size of the roster
		System.out.println(interJ.roster.size());
		
		//use an iterator or for-each loop to print the ID of each student
		Iterator<CCVStudent> iter = interJ.roster.iterator();
		for(CCVStudent s : interJ.roster) {
			System.out.println(s.getIdNumber());
		}
		
		//remove the 2nd student from the roster
		interJ.roster.remove(1);
		
		//again, print the size of the roster
		System.out.println(interJ.roster.size());
				
	}

}
