/* Zagadou Daniella Marie-Hermance Oyotode
* 31321815
* Project 02
* Lab section: MW 12:30 TO 1:45
*/

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    Course UserCourse = new Course(1); 
		    Clubs UserHit = new Clubs(1,1); 
		    Putting UserPutt = new Putting(1); 
		    Scores UserScore = new Scores(1,1);
		    TTYGolf Game = new TTYGolf(UserCourse, UserHit, UserPutt, UserScore);
		    Game.Implementation();
		
		   
  }

}
