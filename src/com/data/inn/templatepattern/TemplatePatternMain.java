package com.data.inn.templatepattern;

import com.data.inn.templatepattern.domain.CaffeineBeverage;
import com.data.inn.templatepattern.domain.Coffee;
import com.data.inn.templatepattern.domain.Tea;

public class TemplatePatternMain {

    public void run(){

        CaffeineBeverage coffee = new Coffee();

        CaffeineBeverage tea = new Tea();

        // Default hook adds sugar and milk.
        coffee.prepareDrink();

        // Hook does not allow the condiments to be added for tea.
        tea.prepareDrink();

    }
}
