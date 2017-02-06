import java.util.regex.Pattern;

/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public class ValidString {

    public static Pattern regStr = Pattern.compile("(^\\d+)\\s<([A-Z]+)>\\s(\\d+)\\s(\\d+)\\s(\\d+)\\s(\\d*)");

    public String getSeq(String saisie){

        return regStr.matcher(saisie).group(1);
    }

    public String getType(String saisie){

        return regStr.matcher(saisie).group(2);
    }

    public int getX1(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(3));
    }

    public int getY1(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(4));
    }

    public int getX2(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(5));
    }


    public int getY2(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(6));
    }

}
