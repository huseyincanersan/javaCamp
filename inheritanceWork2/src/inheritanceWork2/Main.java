package inheritanceWork2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		Student student	=	new 	Student();
		
		instructor.firstName="can";
		instructor.lastName="Ersan";
		
		student.firstName="Huseyin";
		
		student.lastName="Ersan";
		
		UserManager[] users = new UserManager[] {
			new InstructorManager(), new StudentManager()
		};
		
		for (UserManager userManager : users) {
			userManager.add();
		}
		

	}

}
