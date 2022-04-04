package oopIntroEx;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses( 1 , "Java" , 49);
		Courses course2 = new Courses(2, "C#", 52);
		Courses course3 = new Courses(3, "Javasccript", 65);
		
		Courses[] courses = {course1,course2,course3};
		
		for (Courses cours : courses) {
			System.out.println(cours.id);
			System.out.println(cours.name);
			System.out.println(cours.leng);
			System.out.println("-------------");
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.lessonWatched(course1);
		courseManager.lessonWatched(course2);
		courseManager.lessonWatched(course3);
		
		
		
		
		
		Categories category1 = new Categories();
		Categories category2 = new Categories();
		Categories category3 = new Categories();
		Categories category4 = new Categories();
		
		
		category1.id=98;
		category1.name="My Courses";
		
		category2.id=99;
		category2.name="All Courses";
		
		category3.id=100;
		category3.name="Preparation";
		
		category4.id=101;
		category4.name="Frequently asked Questions";
		
		Categories[] categories = {category1,category2,category3,category4};
		
		for (Categories category : categories) {
			System.out.println(category.id);
			System.out.println(category.name);
			System.out.println("-----------");
		}
		

	}

}
