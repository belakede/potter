package com.epam.training.springcore.potter.configuration;

import com.epam.training.springcore.potter.aspect.BattleAspect;
import com.epam.training.springcore.potter.aspect.SpellAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectConfiguration {

    @Bean
    public BattleAspect battleAspect() {
        return new BattleAspect();
    }

    @Bean
    public SpellAspect spellAspect() {
        return new SpellAspect();
    }

}
