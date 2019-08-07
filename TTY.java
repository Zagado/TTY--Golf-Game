/* Zagadou Daniella Marie-Hermance Oyotode
 * 31321815
 * Project 1
 * Lab section: MW : 12:30 TO 1:45
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TTY {
	double distance;
	double height;
	int score;
	double angle;
	double speed;
	double wallSpeed;
	double sumReach = 0.0;
	int total = 0;
	
	
	public TTY(double distance, double height, int score, double angle, double speed, double wallSpeed) {
		this.distance = distance;
		this.height = height;
		this.score = score;
		this.angle = angle;
		this.speed = speed;
		this.wallSpeed = wallSpeed;
	}
	public double getDistance(){
		return distance;
	}
	
	public void SetDistance(double distance) {
		this.distance = distance;
	}
	
	public double getheight() {
		return height;
	}
	
	public void Setheight(double height) {
		this.height = height;
	}
	
	public int getscore() {
		return score;
	}
	
	public void Setscore(int score) {
		this.score = score;
	}
	
	public double getangle() {
		return angle;
	}
	
	public void Setangle(double angle) {
		this.angle = angle;
	}
	
	public double getspeed() {
		return speed;
	}
	
	public void Setspeed(double speed) {
		this.speed = speed;
	}
	
	public double getwallSpeed() {
		return wallSpeed;
	}
	
	public void SetwallSpeed(double wallSpeed) {
		this.wallSpeed = wallSpeed;
	}
	
	public double getsumReach() {
		return sumReach;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void Test() {
		
		double reach = (distance * Math.tan(Math.PI * angle / 180)) - (9.8 * Math.pow(distance,2) / (2 * Math.pow(speed * Math.cos(Math.PI * angle / 180), 2))) ;
		 
		if (reach >= height) {
				System.out.println("You will hit a static wall of " + height +" meters, with an  angle of " + angle + "degrees");
				System.out.println("At a speed of " + speed + "and a distance of " + distance + " at y = " + reach + " meters.");
			    System.out.println("You would have earned at least 3 points if you were playing");
				
		} else if (height > reach) {
			System.out.println("You will hit a static wall of " + height +" meters, with an  angle of " + angle + " degrees");
			System.out.println("At a speed of " + speed + " and a distance of " + distance + " at y = " + reach + " meters.");
		    System.out.println("You would have lost at least 1 point if you were playing");
				
			}
		}
		
	
	
	public int Game() {
		//Extra credit: produce random messages for user
		
		String a = "Over the wall by a few (like three) meters or less: “you made it”)";
		String b = "You're a champion. Over the wall by few!";
		String c = "OH YEAH, GOOD JOB. Over the wall by like 3 meters";
		
		String[] s = {a, b, c};
		
		String d = "Over the wall by more: “plenty of room”";
		String e = "You threw it too high, but still made it!";
		String f = "Hey bro, calm down! This was tooooo higgghh, but you still got points.";
		
		String[] z = {d, e, f};
		
		String g = "Hit the wall within a few meters (like 3) of the top: “not quite over”";
		String h = "Try again, this was like 3 meters under the top!";
		String i = "You can do it, just 3 more meters";
		
		String[] t = {g, h, i};
		
		String j = "Hit the wall father down: “not even close”";
		String k = "You threw it to low on the wall";
		String l = "You hit the wall but too low, try again!";
		
		String[] r = {j, k, l};
		
		
		
		Random response = new Random();
		
		

		double reach = (distance * Math.tan(Math.PI * angle / 180)) - (9.8 * Math.pow(distance,2) / (2 * Math.pow(speed * Math.cos(Math.PI * angle / 180), 2))) ;
	    this.score = this.score - 1;
	    
	    sumReach += reach;
	    total += 1;
	    
	    
		if (reach > height) {
			if ((reach - height) <= 3){
				int select = response.nextInt(s.length);
				System.out.println(s[select]);
				this.score = this.score + 5;
			} else {
				int select = response.nextInt(z.length);
				System.out.println(z[select]);
				this.score = this.score + 3;
			}
				
		} else if (height > reach) {
			if ((height - reach) <= 3 ) {
				int select = response.nextInt(t.length);
				System.out.println(t[select]);
				this.score = this.score - 2;
			
			} else {
				int selEct = response.nextInt(r.length);
				System.out.println(r[selEct]);
				this.score = this.score - 3;
			}
		}
		System.out.println("Your actual score is: " + this.score);
		System.out.println(" ");
		
		return this.score;
	}
		
	public static void main (String[] args) {
		int score = 0; //Set score to 0
		double reach = 0.0;
		int total = 0;
		
		System.out.println("Welcome!!!");
		System.out.print("Press 1 to play , 2 to test output or integer to quit: ");
		
		Scanner scnr = new Scanner(System.in); //Get user decision to play or test inputs
		int response1= scnr.nextInt();
		
		while ((response1 ==1) || (response1 == 2)) {
			
			if (response1 == 1) {
				System.out.print("Press 'q' to quit or anything else to play: ");
			
			    String response2 = scnr.next();
			
		        while (!response2.equalsIgnoreCase("q")) {
		    	
		        	Random randGen = new Random(); // Create a random object
		    	    double wallSpeed = 0.005; //the wall moves at 0.005 meter per second
			   
		    	    double distance = randGen.nextDouble() * 900;
			        double height = randGen.nextDouble() * 1000;
			        //Generate distance and height randomly
			
			        double startTime = System.nanoTime() / (double)Math.pow(10,9);
			       // nanoTime returns the time in nanosecond so multiply it by 10 to the power of 9 gives the time in second
			
			        System.out.print("Enter the angle and the speed. (E.g: 30 20): ");
			        //Gets inputs from user
			
			        double angle = scnr.nextDouble();
			        double speed = scnr.nextDouble();
			
			        double endTime =  (System.nanoTime() / (double)Math.pow(10,9)) - startTime;
			        //Endtime is the time it gets the user to launch the projectile
			        
			        distance = distance - (wallSpeed * endTime);
			        //Distance is now the initial distance minus the distance traveled by the wall while the user was launching
			        
			        if (distance <= 0) {
			        	System.out.println("Buddy, the wall crushed you! Be faster next time!");
			    
				
			        } else {
			    	
			        	double maxProjectileDist = Math.pow(speed, 2) * Math.sin(2* Math.PI * angle / 180) / 9.8; //Computes the maximum x value the projectile can reach
			    
			        //if this value is less than the distance between the projectile and the wall
				    //We assume the ball will not reach the wall
				    //So tell the user it did not .
				    
				        if (maxProjectileDist < distance ) {
				        	String m = "Lool, you did not even reach the wall!";
				    		String n = "Do you need more strength? Throw it better!";
				    		String o = "Babe! please throw it further. You fell without touching the wall!";
				    		
				    		String[] w = {m, n, o};
				    		Random response = new Random();
				    		
				    		int select = response.nextInt(w.length);
				        	System.out.println(w[select]);
				            
				        	++total;
				    
				        } else {
				        	//Call the method Game of the class TTY to implement the game
				            TTY b = new TTY(distance, height, score, angle, speed, wallSpeed);
					        score = b.Game();
					    
					        //Extra credit: computes average height reached by the user at the end
					        reach = b.getsumReach(); 
					        total = b.getTotal();
					    
				
				         }
			          }
			    System.out.print("Press q to quit or else to continue");
			    response2 = scnr.next();
		       }
		        double average = reach / (double)total; //Extra credit
		        
		        System.out.println("Thank you! Your final score is: " + score);
		        
		        System.out.println("Your average height attained is: " + average);
		        //Prints average heights reached by the user
		        
		        
		    
			} else if (response1 == 2) { 
			//Extra credit: allow the user to test some inputs instead of playing
		    	
				System.out.print("Press 'q' to quit or anything else to continue: ");
			    String response2 = scnr.next();
		    
			    while (!response2.equalsIgnoreCase("q")) {
			    	System.out.print("Enter the angle, speed, height, distance. (E.g: 30 20 100 200): ");
		    	
		    	    double wallSpeed = 0.0; //No wall motion so wall speed is 0
			        double angle = scnr.nextDouble();
			        double speed = scnr.nextDouble();
			        double height = scnr.nextDouble();
			        double distance = scnr.nextDouble();
		    	
			        double maxProjectileDistance = Math.pow(speed, 2) * Math.sin(2* Math.PI * angle / 180) / 9.8;
			   
			        if (maxProjectileDistance < distance ) {
			        	System.out.println("You will fall without reaching the wall at x = " + maxProjectileDistance + " meters.");
			        
			    
			        } else {
			        	TTY a = new TTY(distance, height, score, angle, speed, wallSpeed);
			      
				        a.Test(); //Prints the user's detailed output
		            }
			        
			        System.out.print("Press 'q' to quit or anything else to continue: ");
				    response2 = scnr.next();
		          }
		
	            }
			System.out.print("Press 1 to play , 2 to test output or another integer to quit: ");
	        response1 = scnr.nextInt();
       }
		System.out.println("Thank you! See you next time!");
	}
}
