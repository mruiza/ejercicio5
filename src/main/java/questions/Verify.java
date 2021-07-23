package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import java.io.BufferedInputStream;
import java.net.URL;
import java.nio.charset.Charset;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Verify implements Question<Boolean> {

    public String title;
    public String url;

    public Verify(String title, String url) {
        this.url = url;
        this.title = title;
    }

    public static Verify toThe(String title, String url) {
        return new Verify(title, url);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       // WebDriver driver = getDriver();
        //String output = "";
        boolean flag = false;
        String respuesta = "";
        //try {

            //URL url1 = new URL(url);
            String url2 = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
            try{
                byte [] bytesResponse = url2.getBytes(Charset.forName("UTF8"));
                respuesta = new String(bytesResponse, "UTF8");
                System.out.print(respuesta);
            }catch
            (Exception e) {
            e.printStackTrace();
        }

        if (respuesta.contains(title)) {
            flag = true;
        }
        return flag;


        /*ESTE ======
        boolean flag = false;
        WebDriver driver = getDriver();
         String url2 = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        System.out.print(url2);

        if (url2.contains(title)) {
            flag = true;
        }
        return flag;
        =====================*/

            //CREAMOS UN INPUTSTREAM PARA PODER EXTRAER EL ARCHIVO DE LA CONEXION
           /* BufferedInputStream file = new BufferedInputStream(url1.openStream());
            PDDocument document = null;
            try {
                document = PDDocument.load(file);
                output = new PDFTextStripper().getText(document);
                System.out.println(output);
            } finally {
                if (document != null) {
                    document.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (output.trim().contains(title)) {
            flag = true;
        }

        return flag;*/
    }
 }



