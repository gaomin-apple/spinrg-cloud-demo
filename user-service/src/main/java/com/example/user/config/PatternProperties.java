package com.example.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: min gao
 * @Date: 2023/7/16 14:35
 * @Description:
 * 微服务启动会从nacos读取多个配置文件
 * [spring.application.name]-[spring.profiles.active].yaml,例如：userservice-dev.yaml
 * [spring.application.name].yaml，例如：userservice.yaml
 * profiles（环境）一直变化，[spring.application.name].yaml这个文件一定会加载，因此多环境共享配置可以写入这个文件
 *
 * 多种配置的优先级：
 * 服务名-profile.yaml > 服务名称.yaml > 本地配置
 *
 *
 * Q:远端和idea同时存在配置文件项目会使用那个？
 * A: 优先使用远端的userservice.yaml
 *
 *
 *
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;

    private String value;
}
