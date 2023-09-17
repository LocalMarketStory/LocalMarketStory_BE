package DreamingDaegu.LocalStroy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${img.path}")
    private String imgPath;

    @Value("${img.urlForAccess}")
    private String imgUrl;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(imgUrl)
                .addResourceLocations(imgPath);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해 CORS를 활성화
                .allowedOrigins("*") // 모든 오리진(Origin) 허용
                .allowedMethods("*") // 모든 HTTP 메서드 허용 (GET, POST, PUT, DELETE 등)
                .allowedHeaders("*"); // 모든 헤더 허용
    }
}
