//package am.gitc.rest.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
////@Import(DataConfig.class)
//public class RestSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	/**
//	 * Configures the security of all http requests
//     */
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
////		http.authorizeRequests()
////			.antMatchers("/", "/register").permitAll()
////			.antMatchers("/webjars/**", "/css/**", "/js/**", "/images/**").permitAll()
////			.anyRequest().authenticated()
////			.and()
////			.formLogin()
////				.loginPage("/login")
////				.passwordParameter("password")
////				.usernameParameter("username")
////				.defaultSuccessUrl("/home").permitAll()
////			.and()
////			.logout()
////				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
////				.logoutSuccessUrl("/login?logout")
////				.invalidateHttpSession(true).permitAll()
////			.and()
////			.exceptionHandling()
////				.accessDeniedPage("/403");
//
//		/*
//		  	http
//      		.httpBasic().and()
//      		.authorizeRequests()
//			.antMatchers(HttpMethod.POST, "/employees").hasRole("ADMIN")
//			.antMatchers(HttpMethod.PUT, "/employees/**").hasRole("ADMIN")
//			.antMatchers(HttpMethod.PATCH, "/employees/**").hasRole("ADMIN").and()
//		  	.csrf().disable();
//
//		  	  if ("true".equals(System.getProperty("httpsOnly"))) {
//				  LOGGER.info("launching the application in HTTPS-only mode");
//				  http.requiresChannel().anyRequest().requiresSecure();
//			  }
//		 */
//	}
//
////	/**
////	 * Passes instance of UserService to AuthenticationManagerBuilder
////	 * to be able to organize authentication
////     */
////	@Autowired
////	public void configureGlobal(AuthenticationManagerBuilder auth,
////								UserService userService) throws Exception {
////		auth.userDetailsService(userService)
////			.passwordEncoder(new BCryptPasswordEncoder());
////	}
//}