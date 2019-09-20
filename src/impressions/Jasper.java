//https://gilbertadjin.wordpress.com/page/1/
//------------------------------------------------\\
//https://www.youtube.com/watch?v=Fo1aiOprQeA

//http://javamind-fr.blogspot.com/2011/10/creer-un-rapport-jasper-report.html
//https://stackoverflow.com/questions/43216261/javafx-jasperreports-and-jrdatasource
//https://o7planning.org/en/10271/jasperreport-tutorial-for-beginners
//https://www.youtube.com/watch?v=Y3t6Fejalug
//https://www.youtube.com/playlist?list=PLoL1XrgyvFSw3fccsLbDPuKo3jPHdwVrr
//https://www.tutorialspoint.com/jasper_reports/jasper_report_parameters.htm
//https://ericreboisson.developpez.com/tutoriel/java/jasper-report/pdf/
//https://www.genuinecoder.com/android-app-for-teachers-with-source-html/
//http://javadox.com/org.controlsfx/controlsfx/8.0.6_20/org/controlsfx/control/Notifications.java.html
package impressions;

import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.hibernate.jdbc.ConnectionManager;


public class Jasper {
    //JasperDesign jasperDesign = JRXmlLoader.load();
    
    //connection=ConnectionManager.getConnection();
    /**try  {
      JasperDesign jd = null;
        try {
            jd = JRXmlLoader.load(new File("")
                    .getAbsolutePath()+"/src/impression_preneurs_reservations.jrxml");
        } catch (JRException ex) {
            Logger.getLogger(Jasper.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        HashMap params = new HashMap();
        params.put("phone", "9123456789");
        params.put("email", "intactabode@gmail.com");
        
        
        JRDesignQuery  newQuery=new JRDesignQuery();
        newQuery.setText("select * from table");
        jd.setQuery(newQuery);
        JasperReport jr=JasperCompileManager.compileReport(jd);
        JasperPrint jp=JasperFillManager.fillReport(jr,params, connection);
        JasperPrintManager.printReport(jp, false);
      
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
    
    
    
    
    */
    
    
    //https://www.tutorialspoint.com/jasper_reports/jasper_filling_reports.htm
    //http://refermycode.com/jaspertutorial/chapter-5-generating-report-with-java-pojo-classes/
    //https://community.jaspersoft.com/questions/524537/example-java-program-call-jasper-report
    //http://www.kode-blog.com/java-swing-jdbc-crud-example-with-jasper-reports/
    
    //https://medium.com/@keeptoo/adding-data-to-javafx-tableview-stepwise-df582acbae4f
    //https://docs.oracle.com/javase/10/docs/api/javafx/scene/control/TableView.html

}
