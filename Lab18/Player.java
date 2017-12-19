//Max Chen
//111316366
package lab18;

//**********************************************************
//Player.java
//
//Defines a Player class that holds information about an athlete.
//**********************************************************

public class Player
{
 private String name;
 private String team;
 private int jerseyNumber;

 //-----------------------------------------------------------
 // Prompts for and reads in the player's name, team, and
 // jersey number.
 //-----------------------------------------------------------

public String getname(){
	return name;
}
public String getteam(){
	return team;
}
public int getNumber(){
	return jerseyNumber;
}
 public void setName(String name)
 {
	 this.name = name;
 }

 public void setTeam (String team)
 {
	 this.team = team;
 }

 public void setNumber(int number)
 {
	 this.jerseyNumber = number;
 }
 public boolean equals(Object o){
	 String p2name = ((Player) o).getname();
	 int p2num = ((Player)o).getNumber();
	 boolean nameeq = name.equals(p2name);
	 boolean numeq = jerseyNumber==(p2num);
	 
	 if(nameeq && numeq)
		 return true;
	 else
		 return false;
		 
	 
 }

}