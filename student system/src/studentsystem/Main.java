package studentsystem;

public class Main {

	
	public static void main(String[] args) {
		
		Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemical = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
		physics.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "140144015", 4,60, math, physics,chemical);
        s1.addExamNote(20,50,20);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi",  "2211133",5,40,math, physics,chemical );
        s2.addExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail",  "221121312", 6,80,math, physics,chemical);
        s3.addExamNote(50,20,40);
        s3.isPass();
	
	}

}
