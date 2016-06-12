//package am.gitc.web.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.resource.ContentVersionStrategy;
//import org.springframework.web.servlet.resource.VersionResourceResolver;
//
//
//@Configuration
//
//public class MvcConfig extends WebMvcConfigurerAdapter {
//
////    /**
////     * Provides own message source
////     */
////    @Bean
////    public MessageSource messageSource() {
////        ReloadableResourceBundleMessageSource messageSource =
////                new ReloadableResourceBundleMessageSource();
////        messageSource.setBasename("classpath:messages");
////        messageSource.setDefaultEncoding("UTF-8");
////        return messageSource;
////    }
//
////    /**
////     * Passing out message source to validators
////     */
////    @Override
////    public Validator getValidator() {
////        LocalValidatorFactoryBean factory = new LocalValidatorFactoryBean();
////        factory.setValidationMessageSource(messageSource());
////        return factory;
////    }
//
////    /**
////     * Sets cookie as a locale resolver
////     */
////    @Bean
////    public LocaleResolver localeResolver() {
////        return new CookieLocaleResolver();
////    }
//
//    /**
//     * Adding resource paths
//     */
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("/**")
////                .addResourceLocations(
////                    "classpath:/META-INF/resources/",
////                    "classpath:/resources/",
////                    "classpath:/static/",
////                    "classpath:/public/"
////                );
////    }
//
////    /**
////     * Adding static view/controller
////     */
////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/").setViewName("index");
////    }
////
////    /**
////     * Adding custom interceptors
////     */
////    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        // adds the interceptor which manages switching locale
////        LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
////        localeInterceptor.setParamName("lang");
////        registry.addInterceptor(localeInterceptor);
////
//////        registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/404");
//////        registry.addInterceptor(new AdminRequiredInterceptor());
////    }
//
//    /**
//     *  Forwards the request to appropriate controller in case of errors
//     */
////    @Bean
////    public EmbeddedServletContainerCustomizer containerCustomizer() {
////        return container -> {
////            container.addErrorPages(new ErrorPage("/500"));
////            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404"));
////            container.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/403"));
////            container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500"));
////        };
////    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        VersionResourceResolver versionResourceResolver = new VersionResourceResolver()
//                .addVersionStrategy(new ContentVersionStrategy(), "/**");
//
//        registry.addResourceHandler("/javascript/*.js")
//                .addResourceLocations("classpath:/static/")
//                .setCachePeriod(1) /* one year */
//                .resourceChain(true)
//                .addResolver(versionResourceResolver);
//    }
//
//
//
//
//}
