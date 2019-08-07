import java.util.Random;

public class Clubs {
	
	private int clubNum;
	private int hitPow;
	private int meanDistance;
	private int standardDeviation;
	
	public Clubs(int clubNum, int hitPow) {
		this.clubNum = clubNum;
		this.hitPow = hitPow;
	}
	
	public int getclubNum() {
		return this.clubNum;
	}
	
	public void setclubNum(int clubNum) {
		this.clubNum = clubNum;
	}
	
	public int gethitPow() {
		return hitPow;
	}
	
	public void sethitPow(int hitPow) {
		this.hitPow = hitPow;
	}
	
	public void gethitInfo() {
		if (this.getclubNum() == 1) {
			meanDistance = 230;
			standardDeviation = 30;
		}else if (this.getclubNum() == 2) {
			meanDistance = 215;
			standardDeviation = 20;
		}else if (this.getclubNum() == 3) {
			meanDistance = 180;
			standardDeviation = 20;
		}else if (this.getclubNum() == 4) {
			meanDistance = 170;
			standardDeviation = 17;
		}else if (this.getclubNum() == 5) {
			meanDistance = 155;
			standardDeviation = 15;
		}else if (this.getclubNum() == 6) {
			meanDistance = 145;
			standardDeviation = 15;
		}else if (this.getclubNum() == 7) {
			meanDistance = 135;
			standardDeviation = 15;
		}else if (this.getclubNum() == 8) {
			meanDistance = 125;
			standardDeviation = 15;
		}else if (this.getclubNum() == 9) {
			meanDistance = 110;
			standardDeviation = 10;
		}else{
			meanDistance = 50;
			standardDeviation = 10;
		}
	}
	
	public int getMeanDistance() {
		gethitInfo();
		return this.meanDistance;
	}
	
	public int getStandardDeviation() {
		gethitInfo();
		return this.standardDeviation;
	}
	
	public static int nextDistance(int mean, int stddev, int power) {
		Random random = new Random();
		double adjustedMean = mean * power / 10.0;
		double adjustedSTDDEV = stddev * power / 10.0;
		double val = Math.abs(random.nextGaussian() * adjustedSTDDEV + adjustedMean);
		return (int)val;
	}

	

}
