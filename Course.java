
public class Course {
	private String courseName;
	private int courseNum;
	private int holeLen[] = new int[18];
	public int holePar[] = new int[18];
	
	public Course(int courseNum) {
		this.courseNum = courseNum;
	}
	
	public int getcourseNum() {
		return this.courseNum;
	}
	
	public void setcourseNum(int courseNum) {
		this.courseNum = courseNum;
	}
	
	public String getCourseName() {
		if (this.courseNum == 1) {
			this.courseName = "Genesee Valley Park North Course";
		}else if (this.courseNum == 2) {
			this.courseName = "The Old Course at Saint Andrews";
		}else{
			this.courseName = "Trump Turnberry Ailsa Course";
		}
		return this.courseName;
	}
	
	
	public void setCourse() {
		if (this.getcourseNum() == 1) { 
			holeLen[0] = 530;
			holePar[0] = 5;
			holeLen[1] = 305;
			holePar[1] = 4;
			holeLen[2] = 331;
			holePar[2] = 4;
			holeLen[3] = 201;
			holePar[3] = 3;
			holeLen[4] = 500;
			holePar[4] = 5;
			holeLen[5] = 226;
			holePar[5] = 3;
			holeLen[6] = 409;
			holePar[6] = 4;
			holeLen[7] = 410;
			holePar[7] = 4;
			holeLen[8] = 229;
			holePar[8] = 3;
			holeLen[9] = 433;
			holePar[9] = 4;
			holeLen[10] = 363;
			holePar[10] = 4;
			holeLen[11] = 174;
			holePar[11] = 3;
			holeLen[12] = 545;
			holePar[12] = 5;
			holeLen[13] = 419;
			holePar[13] = 4;
			holeLen[14] = 512;
			holePar[14] = 5;
			holeLen[15] = 410;
			holePar[15] = 4;
			holeLen[16] = 320;
			holePar[16] = 4;
			holeLen[17] = 170;
			holePar[17] = 3;
		}else if (this.getcourseNum() == 2) {
			holeLen[0] = 376;
			holePar[0] = 4;
			holeLen[1] = 453;
			holePar[1] = 4;
			holeLen[2] = 397;
			holePar[2] = 4;
			holeLen[3] = 480;
			holePar[3] = 4;
			holeLen[4] = 568;
			holePar[4] = 5;
			holeLen[5] = 412;
			holePar[5] = 4;
			holeLen[6] = 371;
			holePar[6] = 4;
			holeLen[7] = 175;
			holePar[7] = 3;
			holeLen[8] = 352;
			holePar[8] = 4;
			holeLen[9] = 386;
			holePar[9] = 4;
			holeLen[10] = 174;
			holePar[10] = 3;
			holeLen[11] = 348;
			holePar[11] = 4;
			holeLen[12] = 465;
			holePar[12] = 4;
			holeLen[13] = 618;
			holePar[13] = 5;
			holeLen[14] = 455;
			holePar[14] = 4;
			holeLen[15] = 423;
			holePar[15] = 4;
			holeLen[16] = 495;
			holePar[16] = 4;
			holeLen[17] = 357;
			holePar[17] = 4;
		}else{
			holeLen[0] = 441;
			holePar[0] = 4;
			holeLen[1] = 425;
			holePar[1] = 4;
			holeLen[2] = 496;
			holePar[2] = 4;
			holeLen[3] = 194;
			holePar[3] = 3;
			holeLen[4] = 531;
			holePar[4] = 5;
			holeLen[5] = 171;
			holePar[5] = 3;
			holeLen[6] = 476;
			holePar[6] = 4;
			holeLen[7] = 454;
			holePar[7] = 4;
			holeLen[8] = 248;
			holePar[8] = 3;
			holeLen[9] = 565;
			holePar[9] = 5;
			holeLen[10] = 215;
			holePar[10] = 3;
			holeLen[11] = 468;
			holePar[11] = 4;
			holeLen[12] = 409;
			holePar[12] = 4;
			holeLen[13] = 568;
			holePar[13] = 5;
			holeLen[14] = 234;
			holePar[14] = 3;
			holeLen[15] = 509;
			holePar[15] = 4;
			holeLen[16] = 559;
			holePar[16] = 5;
			holeLen[17] = 485;
			holePar[17] = 4;
		}
	}
	
	public int getHolePar(int ind) {
		setCourse();
		return this.holePar[ind];
	}
	
	public int getholeLen(int ind) {
		setCourse();
		return this.holeLen[ind];
	}

}
