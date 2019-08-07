import java.util.Random;

public class Putting {
	private int Pow;
	private int meanDistance;
	private int standardDeviation;
	
	public Putting(int Pow) {
		this.Pow = Pow;
	}
	
	public int getPow() {
		return this.Pow;
	}
	
	public void setPow(int Pow) {
		this.Pow = Pow;
	}
	
	public void getPuttInfo() {
		if (this.getPow() == 10) {
			meanDistance = 40;
			standardDeviation = 5;
		}else if (this.getPow() == 9) {
			meanDistance = 30;
			standardDeviation = 5;
		}else if (this.getPow() == 8) {
			meanDistance = 25;
			standardDeviation = 4;
		}else if (this.getPow() == 7) {
			meanDistance = 20;
			standardDeviation = 4;
		}else if (this.getPow() == 6) {
			meanDistance = 16;
			standardDeviation = 3;
		}else if (this.getPow() == 5) {
			meanDistance = 12;
			standardDeviation = 3;
		}else if (this.getPow() == 4) {
			meanDistance = 8;
			standardDeviation = 2;
		}else if (this.getPow() == 3) {
			meanDistance = 4;
			standardDeviation = 2;
		}else if (this.getPow() == 2) {
			meanDistance = 2;
			standardDeviation = 1;
		}else{
			meanDistance = 1;
			standardDeviation = 1;
		}
	}
	
	public int getMean() {
		getPuttInfo();
		return this.meanDistance;
	}
	
	public int getStandardDev() {
		getPuttInfo();
		return this.standardDeviation;
	}
	
	public static int nextDistance(int mean, int stddev) {
		Random random = new Random();
		double val = Math.abs(random.nextGaussian() * stddev + mean);
		return (int)val;
	}

}
