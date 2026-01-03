package com.example.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepara o reteta franceza";
    }
}
