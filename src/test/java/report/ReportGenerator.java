package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    public static void main(String[]args){
        String path="I:\\diplomado\\modulo4\\tarea2\\todo\\build\\reports\\cucumber\\";

        File reportOutPut= new File(path+"finalReportAPI");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"report.json");

        Configuration configuration =  new Configuration(reportOutPut,"UCB Diplomado tarea 2");
        configuration.setBuildNumber("v50.0");
        configuration.addClassifications("SO","Windows");
        configuration.addClassifications("Owner","Dieter");
        configuration.addClassifications("Branch","cucumber");
        configuration.addClassifications("Type Report","Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();
    }
}
