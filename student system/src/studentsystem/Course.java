package studentsystem;

public class Course {
	//dersin adı,kodu,önadı,notu
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int sozlu;
	
	Course(String name,String code,String prefix){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
		
	}
	
	void addTeacher(Teacher t) {
		
		if(this.prefix.equals(t.branch)) {
			
			this.teacher=t;
			System.out.println("Transaction successful!");
			
		}else {
			System.out.println(t.name+ "Academician cannot teach this course! ");
		}
	}
	
	void printTeacher() {
		if(teacher!=null) {
			System.out.println(this.name+"Academician of the course"+teacher.name);
		}else {
			System.out.println("no academic appointed");
		}
	}
}
