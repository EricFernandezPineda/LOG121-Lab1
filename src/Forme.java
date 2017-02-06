import java.awt.*;

/**
 * Created by Eric Fernandez Pineda on 1/23/2017.
 */
public abstract class Forme {

    private Color couleurRemp, couleurCont;
    private int x1, y1, x2, y2;
    private String nseq;

    public Forme (){

    }
    public Forme(int x1, int y1, int x2, int y2) {
    }

    /**
     * Constructeur adapté aux données reçu du serveur.
     * @param couleurRemp
     * @param couleurCont
     * @param nseq
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Forme(Color couleurRemp, Color couleurCont, String nseq, int x1, int y1,
                 int x2, int y2) {

        this.couleurRemp = couleurRemp;
        this.couleurCont = couleurCont;
        this.nseq = nseq;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Mutateur pour la couleur de la forme
     * @param couleurRemp
     */
    public void setCouleurRemp(Color couleurRemp) {
        this.couleurRemp = couleurRemp;
    }

    /**
     * Retourne la couleur de la forme
     * @return
     */
    public Color getCouleurRemp() {
        return couleurRemp;
    }

    /**
     * Retourne la première coordonnée (x1)
     * @return
     */
    public int getX1() {
        return x1;
    }

    /**
     * Mutateur pour la première coordonnée (x1)
     * - pas utilisé pour ce TP.
     * @param x1
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * Retourne la deuxième coordonnée (y1)
     * @return
     */
    public int getY1() {
        return y1;
    }

    /**
     * Mutateur pour la deuxième coordonnée (y1)
     * - pas utilisé pour ce TP.
     * @param y1
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * Retourne la troisième coordonnée (x2)
     * @return
     */
    public int getX2() {
        return x2;
    }

    /**
     * Mutateur pour la troisième coordonnée (x2)
     * @param x2
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Retourne la quatrième coordonnée (y2)
     * - ne s'applique pas pour Cercle
     * @return
     */
    public int getY2() {
        return y2;
    }

    /**
     * Mutateur pour la quatrième coordonnée (y2)
     * @param y2
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Méthode pour tracer la forme, redéfini dans les classes de formes.
     * @param g
     */
    public abstract void Tracer(Graphics g);

}

