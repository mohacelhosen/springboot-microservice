package com.mcu.component.Configuration;

import com.mcu.component.firewall.Security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CellConfig {
    public CellConfig() {
        System.out.println("Config::Constructor ");
    }

    @Bean
    public Security cellBotSecurity(){
        Security cellSecurity = new Security();
        // Custom logic to secure our CellBot Robot 🤖
        return cellSecurity;
    }
}
