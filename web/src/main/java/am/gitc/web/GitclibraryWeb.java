package am.gitc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@SpringBootApplication(scanBasePackages = {
        "am.gitc.common",
        "am.gitc.web",
        "am.gitc.service"
})
@ImportResource("classpath*:/config/i18.xml")
public class GitcLibraryWeb extends SpringBootServletInitializer {

    /**
     * in case of application is deployed under traditional server
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GitcLibraryWeb.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(GitcLibraryWeb.class, args);
    }

    @Bean()
    public ServletContextTemplateResolver templateResolver() {
        final ServletContextTemplateResolver resolver =
                new ServletContextTemplateResolver();
//        resolver.setPrefix("/WEB-INF/templates/");
//        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setCacheable(false);
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

}
