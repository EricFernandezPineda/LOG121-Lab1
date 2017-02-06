import java.util.regex.Pattern;

/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public class ValidString {
    //Regex divisé en 6 groupes
    public static Pattern regStr = Pattern.compile("(^\\d+)\\s<([A-Z]+)>\\s(\\d+)\\s(\\d+)\\s(\\d+)\\s(\\d*)");

    /**
     * Retourne le numéro de séquence.
     * @param saisie
     * @return
     */
    public String getSeq(String saisie){

        return regStr.matcher(saisie).group(1);
    }

    /**
     * Retourne le type de forme.
     * @param saisie
     * @return
     */
    public String getType(String saisie){

        return regStr.matcher(saisie).group(2);
    }

    /**
     * Retourne la première coordonnée(x1)
     * @param saisie
     * @return
     */
    public int getX1(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(3));
    }

    /**
     * Retourne la deuxième coordonnée(y1)
     * @param saisie
     * @return
     */
    public int getY1(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(4));
    }

    /**
     * Retourne la la troisième coordonnée(x2)
     * @param saisie
     * @return
     */
    public int getX2(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(5));
    }

    /**
     * Retourne la quatrième coordonnée(y2)
     * - ne s'applique pas si il s'agit d'un cercle.
     * @param saisie
     * @return
     */
    public int getY2(String saisie) {

        return Integer.parseInt(regStr.matcher(saisie).group(6));
    }

}
