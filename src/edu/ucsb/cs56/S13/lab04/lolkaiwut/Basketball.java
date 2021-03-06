package edu.ucsb.cs56.S13.lab04.lolkaiwut;

/**
   Baskeetball is a program that display the current NBA teams name and wins.
*/

public class Basketball {

    private String team = "Lakers"; 
    private int numOfWins = 44; 

    /** Default Constructor creates a Basketball with team Lakers and numOfWins 44 */

    public Basketball() {} ; 

    /** 
	@param team shows team names, (e.g. Warriors, Kings, Suns, Lakers)
	@param numOfWins  (e.g. 54, 43, 43, 45) I made up the numbers.
    */
    public Basketball(String team, int numOfWins) { 
	this.team = team;
	this.numOfWins = numOfWins;
    }

    /**
       @return team names  (e.g. Warriors, Kings, Suns, Lakers)       
    */
    public String getTeam() { 
	return team; 
    }
    /**
       @return numOfWins (e.g. 54, 43, 43, 45) 

    */
    public int getNumOfWIns() { 
	return numOfWins; 
    }
 
    /**
       Convert to a string representation.  Examples: "[Lakers, 44 wins]", "[Warriors, 54]"
       @return String represntation of team.
    */

    public String toString() {
	java.text.DecimalFormat amFormat = new java.text.DecimalFormat("0");
	java.text.DecimalFormat fmFormat = new java.text.DecimalFormat("0.0");
	return "[" + this.team + ", " 
	      + fmFormat.format(this.numOfWins) +  " wins]"; 
    }

    /** 
	A sample main that uses the class.
    */
    public static void main(String [] args) { 
        Basketball Lakers = new Basketball("Lakers", 44);
	Basketball Warriors = new Basketball("Warriors", 54);
	System.out.println(Lakers);
    }

    /**
       Are the teams equal?
       @param o another object to compare 
       @return true if this object is the same team as o
    */
    public boolean  equals(Object o) { 

	double tol = 0.01; 
	if (! (o instanceof Basketball) )
	    return false;
	Basketball other = (Basketball) o;
	return (other.getTeam().equals(this.getTeam()) &
		Math.abs(other.getNumOfWins() - this.getNumOfWins()) < tol ); 
    }
}
