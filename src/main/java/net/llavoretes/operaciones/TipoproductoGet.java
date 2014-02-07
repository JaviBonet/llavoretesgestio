 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.llavoretes.operaciones;

/**
 *
 * @author rafa
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.llavoretes.bean.TipoproductoBean;
import com.google.gson.Gson;
import net.llavoretes.dao.TipoproductoDao;

import net.llavoretes.helper.Conexion;

public class TipoproductoGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                TipoproductoDao oTipoproductoDAO = new TipoproductoDao(Conexion.getConection());
                TipoproductoBean oTipoproducto = new TipoproductoBean();
                oTipoproducto.setId(Integer.parseInt(request.getParameter("id")));
                oTipoproductoDAO.get(oTipoproducto);
                data = new Gson().toJson(oTipoproducto);
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("TipoproductoGetJson: View Error: " + e.getMessage());
        }
    }
}
