import java.util.Arrays;
import java.util.Scanner;

public class TTYGolf {
	
	private Course UserCourse;
	private Clubs UserHit;
	private Putting UserPutt;
	private Scores UserScore;
	
	public TTYGolf(Course UserCourse, Clubs UserHit,Putting UserPutt, Scores UserScore) {
		this.UserCourse = UserCourse;
		this.UserHit = UserHit;
		this.UserPutt = UserPutt;
		this.UserScore = UserScore;
	}
	
	public static int testInt = 1;
	//Will help to get the final output of the game
	//and used by 'exit' command to change the output if the user quits the game without 
	//finishing the round. Defaults to 1 which implies the user did not quit before finishing
	
    public static void FirstMessage() {
		
		System.out.println("Welcome to TTY Golf!");		
	    System.out.println("Please Select A Course (1-3)");
	    System.out.println("1) Genesee Valley Park North Course"); 
	    System.out.println("2) The Old Course at St. Andrews");
	    System.out.println("3) Trump Turnberry Ailsa Course");
	    System.out.println("4) To Quit");
	}
	
	public void Implementation () {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		String play;
		System.out.println("Type 'Y' to pLay a round , 'N' to quit");
		play = scnr.next();
		while (play.equalsIgnoreCase("Y")) { //Allow user to play multiple round
			
		boolean InCourseSelectionLoop = true; //on off switch for Course Selection Loop
		int courseNumber = 0;
		int total_Score = 0;
	    String scoreTerm = "par";
	    
	    FirstMessage();
	    
	    while (InCourseSelectionLoop == true){
	    	String courseSelection = scnr.next();
		    if (courseSelection.equals("1")) {
		    	courseNumber = 1;
			    InCourseSelectionLoop = false;
		    }else if(courseSelection.equals("2")) {
			    courseNumber = 2;
			    InCourseSelectionLoop = false;
		    }else if(courseSelection.equals("3")) {
			    courseNumber = 3;
			    InCourseSelectionLoop = false;
		    }else if (courseSelection.equals("4")) { //Extra Credit:Allowing the user to quit before starting
			    System.out.println("Bye!");
		    }else {
			    System.out.println("Invalid input! Enter 1, 2, 3 or 4");
		    }
	    }
	
	    this.UserCourse.setcourseNum(courseNumber); //passes courseNumber to userCourse. 
	    System.out.println("Welcome to " + this.UserCourse.getCourseName());
	    System.out.println("Type exit at any time to leave");
	    System.out.println(" ");
	
	
	    for (int i = 0; i < 18; i++) {
	    	System.out.println("You are now at hole " + (i + 1) + ".");
		    System.out.println("Your are scoring a " + scoreTerm + ".");
		    System.out.println("Hole " + (i + 1) + " is " + this.UserCourse.getholeLen(i) + " feet long, and a par " + this.UserCourse.getHolePar(i) + ".");
		
		
		    int currentScoreCount = 0;
		    int distanceLeft = this.UserCourse.getholeLen(i);
		    int hitDirection = 1;
		    boolean isPutting = true;
		    boolean OnGreen = false;
		
		    while (OnGreen == false){  //HITTING LOOP
		    	
		    	System.out.println("Pick a club (1-10) and a power for your hit (1-10): ");
		    	System.out.println("Separate them by space.");
			    boolean inSelectClubLoop = true;    //on/off switch for selection loop
			    int selectedClub = 0;
			    String clubName = "";
			    while (inSelectClubLoop == true) { //CLUB SELECTION
			    	String clubString = scnr.next();
			    	String[] Clubs = {"3","4","5","6","7","8","9"};
				
				    if (clubString.equals("1")) {
				    	selectedClub = 1;
					    clubName = "Driver";
					    inSelectClubLoop = false;
					
				    }else if (clubString.equals("2")) {
					    selectedClub = 2;
					    clubName = "3-wood";
					    inSelectClubLoop = false;
					
				    }else if (Arrays.asList(Clubs).contains(clubString)) {
				    	selectedClub = Integer.valueOf(clubString);
					    clubName = clubString + "-iron";
					    inSelectClubLoop = false;
					
				    }else if (clubString.equals("10")) {
					
					    selectedClub = 10;
					    clubName = "Wedge";
					    inSelectClubLoop = false;
					
				    }else if (clubString.equalsIgnoreCase("exit")) {
					//Extra credit allowing the user to quit at any time
					    System.out.println("Keep typing 'exit' to quit:");
					
					    inSelectClubLoop = false;
					    OnGreen = true;
					    isPutting = false;
					    i = 17;
					    testInt = 0; 
					//sets this integer equal to 0 to exit the game
				
				     }else {
					    System.out.println("invalid input! please try again");
				     }
			     }
			
			
			     System.out.println("Your Club:  " + clubName);
			     boolean inPowerSelectionLoop = true;
			     int power = 0;
			
			     while (inPowerSelectionLoop == true) { //POWER SELECTION
			    	 String PowerString = scnr.next();
			    	 String[] Power = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
				
				     if (Arrays.asList(Power).contains(PowerString)) {
				    	 power = Integer.valueOf(PowerString);
					     inPowerSelectionLoop = false;
				     } else if (PowerString.equalsIgnoreCase("exit")) {
					//Extra credit: allowing the user to quit at any time
					     System.out.println("Keep typing 'exit' to quit:");
					
					     inPowerSelectionLoop = false;
					     OnGreen = true;
					     isPutting = false;
					     i = 17;
					     testInt = 0; //sets this integer equal to 0 to exit the game, 
				     }else {
					      System.out.println("Invalid input! please try again");
				     }
				 }
			     
			     this.UserHit.setclubNum(selectedClub);
			     this.UserHit.sethitPow(power);
			
			@SuppressWarnings("static-access")
			     int distanceTraveled = (this.UserHit.nextDistance(this.UserHit.getMeanDistance(), this.UserHit.getStandardDeviation(), this.UserHit.gethitPow())) * hitDirection; 
			
			
			     System.out.println("Your ball travelled " + Math.abs(distanceTraveled) + " feet");
			     distanceLeft = distanceLeft - distanceTraveled;
			
			     if ((distanceLeft <= 60) && (distanceLeft > 1)) { 
				//On green because distance is in between 1 and 60
			    	 OnGreen = true;
				
			     }else if ((distanceLeft <= 1) && (distanceLeft >= -1)) { 
				//When entered hole without having to put
			    	 if(currentScoreCount == 0) {
			    		 System.out.println("Hole in 1!!!!! ");
				     }else {
					     System.out.println("You made it in the hole! No need to putt!");
				     }
				     OnGreen = true;
				     isPutting = false;
				
			     }else if (distanceLeft < -1) { //When hits are past the hole
			    	 hitDirection = -1;
				     System.out.println("You went passed the hole! You are now " + Math.abs(distanceLeft) + " feet away from the hole in the opposite direction");
				     
				     if (Math.abs(distanceLeft) <= 60) {
				    	 System.out.println(" You are still on Green !");
					     OnGreen = true;
				     }
			     }else {
			    	 hitDirection = 1;
				     System.out.println("You are now " + distanceLeft + " feet from the hole");
			     }
			     currentScoreCount++;
		    }
		    System.out.println("Supposed to be putting at this point. You are " + Math.abs(distanceLeft) + " feet from the hole");
		
		    while (isPutting == true) {  //PUTTING LOOP
		    	System.out.println("Choose your putting power (1-10)");
		    	int puttingPower = 0;
			    boolean inPowerSelection = true;
			    
			    
			    while (inPowerSelection == true) {
			    	String PuttPowerString = scnr.next();
			    	
			    	String[] PuttingPower = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
					
				     if (Arrays.asList(PuttingPower).contains(PuttPowerString)) {
				    	 puttingPower = Integer.valueOf(PuttPowerString);
					     inPowerSelection = false;
					     
				    }else if (PuttPowerString.equalsIgnoreCase("exit")) {
					//Extra credit: Allowing the user to quit at any time
					    System.out.println("Keep typing 'exit' to quit:");
					
					    inPowerSelection = false;
				        OnGreen = true;
					    isPutting = false;
					    i = 17;
					
					    testInt = 0; 
					//sets this integer equal to 0, to exit the game
				    }else {
					    System.out.println("invalid input! try again");
				    }
			    }
			    
			    this.UserPutt.setPow(puttingPower);
			
			    int puttDistanceTraveled = Putting.nextDistance(this.UserPutt.getMean(), this.UserPutt.getStandardDev()) * hitDirection;
			    distanceLeft = distanceLeft - puttDistanceTraveled;
			
			    if (distanceLeft <= 1 && distanceLeft >= -1) {
			    	System.out.println("Yayyy, You made it in the hole!");
				    isPutting = false;
			    }else if (distanceLeft < -1) {
			    	System.out.println("You went passed the hole! You are " + Math.abs(distanceLeft) + " feet away on the other side");
				    hitDirection = -1;
			    }else if (distanceLeft > 1) {
				    System.out.println("You are now " + distanceLeft + " feet from the hole");
				    hitDirection = 1;
			    }
			    currentScoreCount++;
		    }
		    total_Score += currentScoreCount;
		
		    int parCounter = 0; 
		//Extra Credit: About Nomenclature with bogey and birdie
		//these next couple of lines allows to get the total score for the nomenclature
		
		    for (int u = 0; u <= i; u++) {
		    	parCounter += this.UserCourse.getHolePar(u);
		    }
		
		    scoreTerm = this.UserScore.determineName(parCounter, total_Score);
		    this.UserScore.setScore(currentScoreCount);
		    this.UserScore.setPar(this.UserCourse.getHolePar(i));
		    System.out.println("Your score is " + this.UserScore.determineName(this.UserScore.getPar(), this.UserScore.getScore()) + " for this hole.");
		}
	    if(testInt == 1) {
	    	System.out.println("Yayyy, you have finished the course! Your final score is " + scoreTerm);
	    	System.out.println("Type 'Y' to play a round , 'N' to quit");
			play = scnr.next();
	    }else {
	    	play = "N";
	    	System.out.println("**************************************************************************************************");
	    	System.out.println("Bye!");
	    }
 }
	}
}

