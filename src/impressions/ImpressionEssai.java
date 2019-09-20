/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author freexx
 */
public class ImpressionEssai {
      String reportSrcFile = "F:/ECLIPSE_TUTORIAL/JASPERREPORT/HelloJasperReport/FirstJasperReport.jrxml";
       
       // First, compile jrxml file.
      //  JasperReport jasperReport =    JasperCompileManager.compileReport(reportSrcFile);
       
        // Parameters for report
       Map<String, Object> parameters = new HashMap<String, Object>();
 
       // DataSource
       // This is simple example, no database.
       // then using empty datasource.
       JRDataSource dataSource = new JREmptyDataSource();
       
        //JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
    //           parameters, dataSource);
    
       // Make sure the output directory exists.
       File outDir = new File("C:/jasperoutput");
      // outDir.mkdirs();
 
       // Export to PDF.
       //JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/jasperoutput/StyledTextReport.pdf");
        
       //System.out.println("Done!");

       
       
       
       
       
       
       
        
      /*
        // First, compile jrxml file.
        JasperReport jasperReport =    JasperCompileManager.compileReport(reportSrcFile);
 
        Connection conn = ConnectionUtils.getConnection();
 
        // Parameters for report
        Map<String, Object> parameters = new HashMap<String, Object>();
 
        JasperPrint print = JasperFillManager.fillReport(jasperReport,
                parameters, conn);
 
        // Make sure the output directory exists.
        File outDir = new File("C:/jasperoutput");
        outDir.mkdirs();
 
        // PDF Exportor.
        JRPdfExporter exporter = new JRPdfExporter();
 
        ExporterInput exporterInput = new SimpleExporterInput(print);
        // ExporterInput
        exporter.setExporterInput(exporterInput);
 
        // ExporterOutput
        OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput(
                "C:/jasperoutput/FirstJasperReport.pdf");
        // Output
        exporter.setExporterOutput(exporterOutput);
 
        //
        SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
        exporter.setConfiguration(configuration);
        exporter.exportReport();
 
        System.out.print("Done!");
    */
}
