package studentsystem;

public class Student {
	String name;
	String stuNo;
	int classes;
	int sozlu;
	Course math;
	Course physics;
	Course chemical ;
	double average;
	boolean isPass;
	
	Student(String name,String stuNo,int classes,int sozlu,Course math,Course physics,Course chemical){
		
		this.name=name;
		this.stuNo=stuNo;
		this.classes=classes;
		this.math=math;
		this.physics=physics;
		this.chemical=chemical;
		this.sozlu=sozlu;
		this.isPass=false;
		
	}
	
	void addExamNote(int math,int physics,int chemical){
		if(0 <= math && math <= 100) {
			
			this.math.note=math;
		}
		if(0 <= physics && physics <= 100) {
			
			this.physics.note=physics;
		}
		if(0<=chemical && chemical <= 100) {
			
			this.chemical.note=chemical;
		}
	}
	void isPass() {
		if(this.math.note==0 || this.physics.note==0 || this.chemical.note==0 ) {
			
			System.out.println("No notes entered");
			
		}else {
			this.isPass=isCheckPass();
			printNote();
			System.out.println("Ortalama:"+this.average);
			if(isPass) {
				System.out.println("You passed the class");
			}else {
				System.out.println("You did not pass the class");
			}
			
			
		}
		
	}
	void calAverage() {
		
		this.average=(this.physics.note + this.chemical.note + this.math.note)*0.8+(this.sozlu)*0.2;
	}
	
	public boolean isCheckPass() {
        calAverage();
        return this.average > 55;
    }
	
	public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.physics.note);
        System.out.println("Kimya Notu : " + this.chemical.note);
    }
}
