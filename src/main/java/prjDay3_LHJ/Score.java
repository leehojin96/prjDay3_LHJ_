package prjDay3_LHJ;

import java.util.ArrayList;

public class Score {
	String name;
	int eng;
	int kor;
	String grade;
	
	String eng_;
	String kor_;
	
	public Score(){
	}
	public Score(String name,int eng,int kor) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		if((eng+kor)/2 >=90) {
			this.grade="A";
		}else if((eng+kor)/2 >=80) {
			this.grade="B";
		}else if((eng+kor)/2 >=70) {
			this.grade="C";
		}else {
			this.grade="D";
		}
	}
	
	public Score(String name,String eng,String kor,String grade) {
		this.name = name;
		this.eng_ = eng;
		this.kor_ = kor;
		this.grade = grade;
	}
	
	
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", eng=" + eng + ", kor=" + kor + ", grade=" + grade + "]";
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getKor() {
		return kor;
	}
	public String getGrade() {
		return grade;
	}
	
	
	
	
	
}
