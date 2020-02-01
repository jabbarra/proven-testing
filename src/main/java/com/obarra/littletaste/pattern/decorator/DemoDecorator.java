package com.obarra.littletaste.pattern.decorator;

import com.obarra.littletaste.pattern.decorator.legacy.AXACalculator;
import com.obarra.littletaste.pattern.decorator.legacy.InsuranceCalculator;
import com.obarra.littletaste.pattern.decorator.legacy.VillanuevaCalculator;

public class DemoDecorator {
    public static double calculateQuotationOfAXA(double value){
        InsuranceCalculator insuranceCalculator = new QuotationCalculator(new AXACalculator());
        return  insuranceCalculator.calculate(value);
    }

    public static double calculateQuotationOfVillanueva(double value){
        InsuranceCalculator insuranceCalculator = new QuotationCalculator(new VillanuevaCalculator());
        return  insuranceCalculator.calculate(value);
    }

    public static double calculateMathReserveOfAXA(double value){
        InsuranceCalculator insuranceCalculator = new MathReserveCalculator(new AXACalculator());
        return  insuranceCalculator.calculate(value);
    }

    public static double calculateMathReserveOfVillanueva(double value){
        InsuranceCalculator insuranceCalculator = new MathReserveCalculator(new VillanuevaCalculator());
        return insuranceCalculator.calculate(value);
    }
}
