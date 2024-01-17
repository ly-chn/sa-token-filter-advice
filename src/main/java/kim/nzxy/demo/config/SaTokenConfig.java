package kim.nzxy.demo.config;

import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ly-chn
 * @since 2024/1/17 9:56
 */
@Configuration
public class SaTokenConfig {
    /**
     * 注册 [Sa-Token全局过滤器]
     */
    @Bean
    public SaServletFilter getSaServletFilter() {
        return new SaServletFilter()
                .addInclude("/**").addExclude("/favicon.ico", "/hello.html")
                .setAuth(obj -> StpUtil.checkLogin());
    }
}
