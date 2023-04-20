//package com.codecoord;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * 自定义配置
// *
//
// */
//@Component
//public class CustomWebConfiguration implements WebMvcConfigurer {
//    @Value("${user.file.path}")
//    private String filePath;
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//
//        registry.addResourceHandler("/**").addResourceLocations(
//                "classpath:/META-INF/resources/",
//                "classpath:/resources/",
//                "classpath:/static/",
//                "classpath:/public/",
//                "file:/" + filePath,
//                "classpath:/webapp/");
//    }
//}
package com.codecoord;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义配置
 */
@Component
public class CustomWebConfiguration implements WebMvcConfigurer {
    @Value("${user.file.path}")
    private String filePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        registry.addResourceHandler("/**").addResourceLocations(
                "classpath:/META-INF/resources/",
                "classpath:/resources/",
                "classpath:/static/",
                "classpath:/public/",
                "file:/" + filePath,
                "classpath:/webapp/");
    }
}
