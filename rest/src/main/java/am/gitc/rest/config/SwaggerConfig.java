package am.gitc.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
////				.apiInfo(apiInfo());
//	}

//	private ApiInfo apiInfo() {
//		ApiInfo apiInfo = new ApiInfo(
//				"My REST API",
//				"Some custom description of API.",
//				"API TOS",
//				"Terms of service",
//				"myeaddress@company.com",
//				"License of API",
//				"API license URL");
//		return apiInfo;
//	}
}