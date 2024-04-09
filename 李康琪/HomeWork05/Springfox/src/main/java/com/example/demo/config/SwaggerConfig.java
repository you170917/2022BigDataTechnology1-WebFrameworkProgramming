package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
//EnableSwagger2通过 @Configuration 注解，让 Spring 来加载该类配置，再通过
//@EnableSwagger2 注解来启用 Swagger2。
public class SwaggerConfig {
//
//
//        @Bean
//        public Docket createRestApi(){
//            return new Docket(DocumentationType.SWAGGER_2)
//
//                    .select()
//                    .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//                    .paths(PathSelectors.any())
//
//
//
//                    .build().apiInfo(new ApiInfoBuilder()
//                            .title("这是接口文档网站的标题")
//                            .description("这是接口文档网站的描述...")
//                            .build());
//
//    }
public ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("学习SpringBoot整合Swagger2构建Restful风格的文档")
            .description("初次使用")
            .version("1.0")
            .build();
}



    public Docket createRestApiInfo() {
        //文档类型为SWAGGER_2  生成这个文档的基本api信息（拿上边定义的信息构建api文档）  选中这个文档  将来给那个包下的控制器生成文档（给controller下的所有类生成restful风格的文档） 给这个路径的所有都生成 构建
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.openlab.controller"))
                .paths(PathSelectors.any())
                .build();
    }



}


