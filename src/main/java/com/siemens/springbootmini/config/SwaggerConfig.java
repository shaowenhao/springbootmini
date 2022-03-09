package com.siemens.springbootmini.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * 1. 集成swagger配置类
 * <p>
 *     Create Time: 2022年03月09日 19:18
 * </p>
 **/


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        ParameterBuilder builder = new ParameterBuilder();
        builder.parameterType("header").name("token")
                .description("token")
                .required(true)
                .modelRef(new ModelRef("string"));
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("aitest_interface")
                .apiInfo(apiInfo())
                .globalOperationParameters(Lists.newArrayList(builder.build()))
                .select().paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("apitest-mini系统")
                .contact(new Contact("shaowenhao","","wenhao.shao@siemens.com"))
                .version("1.0")
                .build();
    }
}
