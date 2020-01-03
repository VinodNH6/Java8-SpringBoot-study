package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import study.examples.Java8Examples;
import study.examples.Java8_ThreadPoolExecutor;

@SpringBootApplication
public class StudyJava8Main {

	public StudyJava8Main() {}
	
	public static void main(String[] args) {
		SpringApplication.run(StudyJava8Main.class, args);
		
		new Java8Examples();
		new Java8_ThreadPoolExecutor();
	}
}
