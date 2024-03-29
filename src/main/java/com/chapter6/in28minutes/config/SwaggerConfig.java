package com.chapter6.in28minutes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
//public class SwaggerConfig extends WebMvcConfigurationSupport
public class SwaggerConfig
{
    @Bean
    public Docket restApi(){
        return new Docket(DocumentationType.SWAGGER_2);
//                .groupName("APPS")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.chapter6.in28minutes"))
//                .paths(regex("/api/rest.*"))
//                .build();
//                .apiInfo(metaData());
    }
//    private ApiInfo metaData() {
//        return new ApiInfoBuilder()
//                .title("Online Book Store REST API")
//                .description("\"Enjoy your REST API\"")
//                .version("1.0").build();
//    }
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry)
//    {
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpa th:/META-INF/resources/webjars/");
//    }
}
