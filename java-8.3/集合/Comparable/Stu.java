package Comparable;

public class Stu implements Comparable<Stu>{
	private String name;
	private double score;
	
	public Stu(String name, double score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Stu o) {
		if(this.score>o.score)
			return 1;
		else if(this.score<o.score)
			return -1;
		else
		return 0;
		
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", score=" + score + "]";
	}
	

}
