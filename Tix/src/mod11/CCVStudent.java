package mod11;

//import mod9.CampusWithPhone;

/**
 * Enumeration of CCV campuses
 * @author charlesmacfadyen
 *
 */
enum Campus {
	BENNINGTON,
	BRATTLEBORO,
	MIDDLEBURY,
	MONTPELIER,
	MORRISVILLE,
	NEWPORT,
	RUTLAND,
	SPRINGFIELD,
	ST_ALBANS,
	ST_JOHNSBURY,
	UPPER_VALLEY,
	WINOOSKI;


}

/**
 * A CCVStudent
 * @author charlesmacfadyen
 *
 */

public class CCVStudent {
	private String name;
	private int IdNumber;
	private Campus campus;

	public CCVStudent(String name, int idNumber, Campus campus) {
		this.name = name;
		IdNumber = idNumber;
		this.campus = campus;
	}
	
	public CCVStudent(String name, int idNumber, String campus) {
		this.name = name;
		IdNumber = idNumber;
		this.campus = Campus.valueOf(campus.toUpperCase());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public String toString() {
		return "Name: " + name + 
				"\nID: " + IdNumber + 
				"\nCampus: " + campus;
	}
	
	public boolean equals(CCVStudent c) {
		if(this.IdNumber == c.IdNumber) {
		return true;
		}
		return false;
	}

}