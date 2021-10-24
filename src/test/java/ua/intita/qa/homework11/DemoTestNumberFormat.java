package ua.intita.qa.homework11;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class DemoTestNumberFormat {
    @Test
    public void demoTestNumberFormat(){
        NumberFormat numberFormatDe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat numberFormatUk = NumberFormat.getInstance(Locale.UK);
        NumberFormat numberFormatFr = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat numberFormatIt = NumberFormat.getInstance(Locale.ITALY);

        double number = 123456.987;

        final String numberDe = numberFormatDe.format(number);
        System.out.println(numberDe);
        final String numberUk = numberFormatUk.format(number);
        System.out.println(numberUk);
        final String numberFr = numberFormatFr.format(number);
        System.out.println(numberFr);
        final String numberIt = numberFormatIt.format(number);
        System.out.println(numberIt);

        NumberFormat currencyFormatDe = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        NumberFormat currencyFormatUk = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat currencyFormatFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat currencyFormatIt = NumberFormat.getCurrencyInstance(Locale.ITALY);

        final String currencyDe = currencyFormatDe.format(number);
        System.out.println(currencyDe);
        final String currencyUk = currencyFormatUk.format(number);
        System.out.println(currencyUk);
        final String currencyFr = currencyFormatFr.format(number);
        System.out.println(currencyFr);
        final String currencyIt = currencyFormatIt.format(number);
        System.out.println(currencyIt);

    }
}
