/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author Leonardo
 */
public class TipoCambioConexion {
    
    public TipoCambioConexion(){
    
    }
    
    
    public static double consulta(String base, String busqueda){
        try {
            URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=10838436344b48b68b499c6153d577e6");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Ocurrio un error" + responseCode);
            }else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                
                while (scanner.hasNext()) {                    
                    informationString.append(scanner.nextLine());
                }
                
                scanner.close();
                
                
                JSONObject jsonObject = new JSONObject(informationString.toString());
                
                
                Double monedaBaseDouble,monedaBusquedaDouble;
                if ("USD".equals(base)) {
                    monedaBaseDouble = 1.00;
                }else{
                    BigDecimal monedaBase =  (BigDecimal) jsonObject.getJSONObject("rates").get(base);
                    monedaBaseDouble = monedaBase.doubleValue();
                }
                
                if ("USD".equals(busqueda)) {
                    monedaBusquedaDouble = 1.00;
                }else{
                    BigDecimal monedaBusqueda =  (BigDecimal) jsonObject.getJSONObject("rates").get(busqueda);
                    monedaBusquedaDouble = monedaBusqueda.doubleValue();
                }
                
                
                Double tipoCambio = monedaBusquedaDouble / monedaBaseDouble;
                
               
                return tipoCambio;
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
         
    }
}
