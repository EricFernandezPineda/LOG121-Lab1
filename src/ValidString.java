import java.util.regex.Pattern;

/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public class ValidString {

    Pattern regStr = Pattern.compile("(^\\d+)\\s<([A-Z]+)>\\s(\\d+)\\s(\\d+)\\s(\\d+)\\s(\\d*)");

    public String getSeq(String saisie){
        regStr.matcher(saisie);

        return saisie.split("\\s<.*")[0];
    }

    public String getForme(String saisie){


        return saisie.split("\\s<.*")[0];

    }
    public String getCoordonnees(String saisie){


        return saisie.split("\\s<.*")[0];

    }


}
