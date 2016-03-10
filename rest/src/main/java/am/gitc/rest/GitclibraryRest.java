package am.gitc.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {
        "am.gitc.common",
        "am.gitc.rest",
        "am.gitc.service"
})
public class GitcLibraryRest extends SpringBootServletInitializer {

    /**
     * in case of application is deployed under traditional server
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GitcLibraryRest.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(GitcLibraryRest.class, args);
    }
}
