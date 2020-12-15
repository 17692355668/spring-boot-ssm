package com.javakc.springbootssm.user.configuration;


import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableOpenApi
public class SwagerConfiguration {

    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();


    }
    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title("项目API文档")
                .contact(new Contact("zhou","http：//www.javakc.com","honggang_z@163.com"))
                .version("1.1")
                .build();
    }

//    @Bean
//    public Docket createRestApi() {
//        /**
//         * 创建swagger docket 实例
//         */
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.javakc.springbootssm"))
//                .paths(PathSelectors.any()
//                ).build();
//    }
//
//    /**
//     * Api文档详细信息
//     * @return ApiInfo
//     */
//    private ApiInfo apiInfo()
//    {
//        return new ApiInfoBuilder()
//                .title("springboot利用swagger2构建api文档")
//                .description("简单优雅的restfun风格")
//                .termsOfServiceUrl("http://www.javakc.com")
//                .version("1.0")
//                .build();
//    }
}
