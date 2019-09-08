package sd.console.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sd.batch.mapper")
@SpringBootApplication
public class SdConsoleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdConsoleSpringbootApplication.class, args);
	}

}
