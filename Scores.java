
public class Scores {
	private int par, score;
	public Scores(int par, int score) {
		this.par = par;
		this.score = score;
	}
	public int getPar() {
		return par;
	}
	public void setPar(int par) {
		this.par = par;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String determineName(int par, int score) {
		if (par < score) {
			if (score-par == 1) {
				return "bogey";
			}else if (score-par == 2) {
				return "double bogey";
			}else if (score-par == 3) {
				return "triple bogey";
			}else if (score-par == 4) {
				return "quadrouple bogey";
			}else{
				return "bogey 5";
			}
		}else if (par > score) {
			if (par-score == 1) {
				return "birdie";
			}else if (par-score == 2) {
				return "eagle";
			}else if (par-score == 3) {
				return "double eagle";
			}else{
				return "triple eagle";
			}
		}else{
			return "par";
		}
	}

}
