package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Student1 student1 = (Student1) context.getBean("student1");
		System.out.println("Student 1 Name is :" + student1.getName());
		Student2 student2 = (Student2) context.getBean("student2");
		System.out.println("Student 2 details: :" + student2.getRollNo() + " "
				+ student2.getName() + " " + student2.getI());
		Student3 student3 = (Student3) context.getBean("student3");
		System.out.println("Student 3 details: :" + student3.getRollNo() + " "
				+ student3.getName() + " " + student3.getI());
		Student4 student4 = (Student4) context.getBean("student4");
		System.out.println("Student 4 details: :" + student4.getRollNo() + " "
				+ student4.getName());
	}
}
