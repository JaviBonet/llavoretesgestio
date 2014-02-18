/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.llavoretes.operaciones;

/**
 *
 * @author llavoretes
 */

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.llavoretes.dao.PagoDao;

import net.llavoretes.helper.Conexion;




public class Pagogetcolumns implements GenericOperation{
    
     @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            PagoDao oPagoDAO = new PagoDao(Conexion.getConection());
            alColumns = oPagoDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("PagoGetcolumnsJson: View Error: " + e.getMessage());
        }
    }
    
    
    
    
    
    
}
