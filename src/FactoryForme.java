/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public class FactoryForme {

    public Carre CreerCarree(Carre carre){
        return new Carre();
    }

    public Rectangle CreerRectangle(Rectangle rectangle){
        return new Rectangle();
    }

    public Ovale CreerOvale(Ovale ovale){
        return new Ovale();
    }

    public Cercle CreerCercle(Cercle cercle){
        return new Cercle();
    }

    public Ligne CreerLigne(Ligne ligne){
        return new Ligne();
    }
}
