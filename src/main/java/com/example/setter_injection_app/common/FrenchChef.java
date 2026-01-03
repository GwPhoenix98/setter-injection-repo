package com.example.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FrenchChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepara o reteta franceza";
    }
}
