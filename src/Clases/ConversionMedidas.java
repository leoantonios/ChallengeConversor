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
public class ConversionMedidas {
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public ConversionMedidas(){
        
    }
    
    /*METROS*/
    public static String metrosToPulgadas(Double metros){
        Double calculo = metros * 39.37;
        return df.format(calculo);
    }
    
    public static String metrosToPies(Double metros){
        Double calculo = metros * 3.281;
        return df.format(calculo);
    }
    
    public static String metrosToYardas(Double metros){
        Double calculo = metros * 1.094;
        return df.format(calculo);
    }
    
    public static String metrosToMillas(Double metros){
        Double calculo = metros / 1609;
        return df.format(calculo);
    }
    
    /*PULGADAS*/
    public static String pulgadasToMetros(Double pulgadas){
        Double calculo = pulgadas / 39.37;
        return df.format(calculo);
    }
    
    public static String pulgadasToPies(Double pulgadas){
        Double calculo = pulgadas / 12;
        return df.format(calculo);
    }
    
    public static String pulgadasToYardas(Double pulgadas){
        Double calculo = pulgadas / 36;
        return df.format(calculo);
    }
    
    public static String pulgadasToMillas(Double pulgadas){
        Double calculo = pulgadas / 63360;
        return df.format(calculo);
    }
    
    /*PIES*/
    public static String piesToMetros(Double pies){
        Double calculo = pies / 3.281;
        return df.format(calculo);
    }
    
    public static String piesToPulgadas(Double pies){
        Double calculo = pies * 12;
        return df.format(calculo);
    }
    
    public static String piesToYardas(Double pies){
        Double calculo = pies / 3;
        return df.format(calculo);
    }
    
    public static String piesToMillas(Double pies){
        Double calculo = pies / 5280;
        return df.format(calculo);
    }
    
    /*YARDAS*/
    public static String yardasToMetros(Double yardas){
        Double calculo = yardas / 1.094;
        return df.format(calculo);
    }
    
    public static String yardasToPulgadas(Double yardas){
        Double calculo = yardas * 36;
        return df.format(calculo);
    }
    
    public static String yardasToPies(Double yardas){
        Double calculo = yardas * 3;
        return df.format(calculo);
    }
    
    public static String yardasToMillas(Double yardas){
        Double calculo = yardas / 1760;
        return df.format(calculo);
    }
    
    /*MILLAS*/
    public static String millasToMetros(Double millas){
        Double calculo = millas * 1609;
        return df.format(calculo);
    }
    
    public static String millasToPulgadas(Double millas){
        Double calculo = millas * 63360;
        return df.format(calculo);
    }
    
    public static String millasToPies(Double millas){
        Double calculo = millas * 5280;
        return df.format(calculo);
    }
    
    public static String millasToYardas(Double millas){
        Double calculo = millas * 1760;
        return df.format(calculo);
    }
    
}
