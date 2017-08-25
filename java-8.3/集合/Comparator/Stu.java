package Comparator;



public class Stu{
	private String name;
	private double score;
	
	public Stu(String name, double score) {
		this.name = name;
		this.score = score;
	}



	public double getScore() {
		return score;
	}



	@Override
	public String toString() {
		return "Stu [name=" + name + ", score=" + score + "]";
	}





}
