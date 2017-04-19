
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static javax.print.attribute.Size2DSyntax.MM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sanuth
 */
public class StartUp {

    public static void main(String[] args) {
        System.out.println(convertToLocalDateTimeToFormattedString("2015-08-04"));
    }

    public static String convertToLocalDateTimeToFormattedString(String strDate) {
        strDate = "2015-08-04";
        LocalDate aLD = LocalDate.parse(strDate);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(aLD + " formats as " + dTF.format(aLD));
        return (aLD + " formats as " + dTF.format(aLD));
    }
}
