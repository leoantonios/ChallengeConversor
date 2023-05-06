/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.DecimalFormat;

/**
 *
 * @author Leonardo
 */
public class ConversionTemperatura {
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public ConversionTemperatura(){
        
    }
    
    public static String celsiusToFarenheit(Double celsius){
        Double calculo = (celsius * 9/5) + 32;
        return df.format(calculo)+" °F";
    }
    
    public static String celsiusToKelvin(Double celsius){
        Double calculo = celsius + 273.15;
        return df.format(calculo)+" K";
    }
    
    public static String farenheitToCelsius(Double farenheit){
        Double calculo = (farenheit - 32) * 5/9;
        return df.format(calculo)+" °C";
    }
    
    public static String farenheitToKelvin(Double farenheit){
        Double calculo = (farenheit - 32) * 5/9 + 273.15;
        return df.format(calculo)+" K";
    }
    
    public static String kelvinToCelsius(Double kelvin){
        Double calculo = kelvin - 273.15;
        return df.format(calculo)+" K";
    }
    
    public static String kelvinToFarenheit(Double kelvin){
        Double calculo = (kelvin - 273.15) * 9/5 + 32;
        return df.format(calculo)+" °F";
    }
    
    
}
