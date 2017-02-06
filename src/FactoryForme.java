import java.awt.*;

/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public class FactoryForme {

    private Forme forme;

    /**
     * Reçoit le String avec les informations sur la Forme et retourne la Forme appropriée
     * @param formeStr
     * @return
     */
    public Forme CreerForme(String formeStr){

        ValidString vs = new ValidString();

        String nseq = vs.getSeq(formeStr);
        int x1 = vs.getX1(formeStr);
        int x2 = vs.getX2(formeStr);;
        int y1 = vs.getY1(formeStr);;
        int y2 = vs.getY2(formeStr);;

        switch (vs.getType(formeStr)){
            case "CARRE" :
                forme = new Carre(Color.red, Color.black, nseq, x1, y1, x2, y2);
                break;
            case "RECTANGLE" :
                forme = new Rectangle(Color.blue, Color.black, nseq, x1, y1, x2, y2);
                break;
            case "CERCLE" :
                forme = new Cercle(Color.red, Color.black, nseq, x1, x2, y1);
                break;
            case "OVALE" :
                forme = new Ovale(Color.green, Color.black, nseq, x1, y1, x2, y2);
                break;
            case "LIGNE" :
                forme = new Ligne(Color.magenta, Color.black, nseq, x1, y1, x2, y2);
                break;
        }

        return forme;
    }


}
