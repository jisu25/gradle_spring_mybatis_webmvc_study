package gradle_spring_mybatis_webmvc_sutdy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class})
@ComponentScan(basePackages = {
			"gradle_spring_mybatis_webmvc_study.mapper"
		})
public class ControllerConfig {

}
