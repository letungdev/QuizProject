/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import DAO.ConnectionManager;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Ireport {
    ConnectionManager pro=new ConnectionManager();
    Connection conn=pro.getConnection();
    public void showJasper(String report) throws JRException, ClassNotFoundException {
 
        JasperPrint jasperPrint = JasperFillManager.fillReport(report, null, conn);
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        jv.setVisible(true);
    }

}
