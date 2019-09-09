package sd.console;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

@MapperScan("sd.console.mapper")
@SpringBootApplication
public class SdConsoleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdConsoleSpringbootApplication.class, args);
	}
	
	//配置mybatis的分页插件pageHelper
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties props = new Properties();
		props.setProperty("offsetAsPageNum", "true");
		props.setProperty("rowBoundsWithCount", "true");
		props.setProperty("reasonable", "true");
		props.setProperty("dialect", "mysql");
		// 表示支持从接口中读取pageNum和pageSize
		props.setProperty("supportMethodsArguments", "true");
		pageHelper.setProperties(props);
		return pageHelper;
	}

}
