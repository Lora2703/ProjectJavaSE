package ua.intita.qa.homework11;

import javafx.scene.input.DataFormat;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DemoTestDateFormat {
    @Test
    public void demoTestDateFormat(){
        DateFormat dFDe = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL,
                new Locale("de", "DE"));
        DateFormat dFUk = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM,
                new Locale("en", "UK"));
        DateFormat dFFr = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL,
                new Locale("fr", "FR"));
        DateFormat dFIt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,
                new Locale("it", "It"));

        Date date = new Date();
        System.out.println(date);

        final String formatDFDe = dFDe.format(date);
        System.out.println(formatDFDe);
        final String formatDFUk = dFUk.format(date);
        System.out.println(formatDFUk);
        final String formatDFFr = dFFr.format(date);
        System.out.println(formatDFFr);
        final String formatDFIt = dFIt.format(date);
        System.out.println(formatDFIt);


    }
}
