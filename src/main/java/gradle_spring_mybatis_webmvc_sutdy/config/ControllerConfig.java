package gradle_spring_mybatis_webmvc_sutdy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class})
/*@ComponentScan(basePackages = {
			"gradle_spring_mybatis_webmvc_study.controller",
			"gradle_spring_mybatis_webmvc_study.service",
			"gradle_spring_mybatis_webmvc_study.common"
		})*/
public class ControllerConfig {

}
