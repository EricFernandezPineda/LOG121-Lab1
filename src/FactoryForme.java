/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public class FactoryForme {

    private Forme forme;

    public FactoryForme(Forme forme){

    }

    public Forme CreerForme(String formeStr){

        switch (formeStr){
            case "CARRE" :
                forme = new Carre();
                break;
            case "RECTANGLE" :
                forme = new Rectangle();
                break;
            case "CERCLE" :
                forme = new Cercle();
                break;
            case "OVALE" :
                forme = new Ovale();
                break;
            case "LIGNE" :
                forme = new Ligne();
                break;
        }

        return forme;
    }


}
