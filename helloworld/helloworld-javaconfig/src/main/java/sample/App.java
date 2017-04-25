package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Student student = (Student) context.getBean("student");
		student.setName("Narayana Bojja");
		System.out.println("Student Name is :" + student.getName());
	}
}
