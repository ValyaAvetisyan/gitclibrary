package am.gitc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class GitclibraryWeb extends SpringBootServletInitializer {

    /**
     * in case of application is deployed under traditional server
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GitclibraryWeb.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(GitclibraryWeb.class, args);
    }
}
