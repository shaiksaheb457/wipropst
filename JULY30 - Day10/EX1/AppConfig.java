// AppConfig.java
package com.wipro.trip;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wipro.trip")
@EnableAspectJAutoProxy
public class AppConfig {
}
