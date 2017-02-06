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

    public void setCouleurRemp(Color couleurRemp) {
        this.couleurRemp = couleurRemp;
    }

    public Color getCouleurRemp() {
        return couleurRemp;
    }

    public void setCouleurCont(Color couleurCont) {
        this.couleurCont = couleurCont;
    }

    public Color getCouleurCont() {
        return couleurCont;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public abstract void Tracer(Graphics g);

}

