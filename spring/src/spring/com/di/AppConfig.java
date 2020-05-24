package spring.com.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import spring.com.di.entity.Exam;
import spring.com.di.entity.SpringExam;

@ComponentScan({"spring.com.di.entity","spring.com.di.ui"})
@Configuration
public class AppConfig {
	//<bean id="exam" class="spring.com.di.SpringExam" />
	@Bean
	public Exam exam() { //이름을 동사가 아닌 명사로. id를 대신하기 때문.
 		return new SpringExam(); //IoC컨테이너에 담아줘야 함.
	}
}
