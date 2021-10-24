package ua.intita.qa.homework11;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoTestResourceBundle {

    @Test
    public void demoTestResourceBundle() {
        Locale locale = new Locale("en", "UK");
        Locale.setDefault(locale);

        System.out.println(Locale.getDefault());

        ResourceBundle bundleDef = ResourceBundle.getBundle("text");
        System.out.println(bundleDef.getString("key1"));

        for (String key: bundleDef.keySet()){
            System.out.println(bundleDef.getString(key));
        }

        Locale localeGe = Locale.GERMAN;
        System.out.println(localeGe);
        ResourceBundle bundleGe = ResourceBundle.getBundle("text_de_DE");
        for (String key: bundleGe.keySet()){
            System.out.println(bundleGe.getString(key));
        }


        Locale localeFr = new Locale("fr","FR");
        System.out.println(localeFr.getDisplayLanguage());
        System.out.println(localeFr.getDisplayCountry());

        Locale localeIt = Locale.ITALY;
        System.out.println(localeIt.getDisplayLanguage());
        System.out.println(localeIt.getDisplayCountry());

    }


}
