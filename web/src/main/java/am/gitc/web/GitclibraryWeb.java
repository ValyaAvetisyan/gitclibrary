package am.gitc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {
        "am.gitc.common",
        "am.gitc.web",
        "am.gitc.service"
})
@ImportResource("/config/i18.xml")
public class GitcLibraryWeb extends SpringBootServletInitializer {

    /**
     * in case of application is deployed under traditional server
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GitcLibraryWeb.class);
    }

    String s = "hello";

    public static void main(String[] args) {
        SpringApplication.run(GitcLibraryWeb.class, args);
    }
}
