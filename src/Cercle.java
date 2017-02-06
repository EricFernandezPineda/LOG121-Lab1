import java.awt.*;

/**
 * Created by Bardock on 1/23/2017.
 */
public class Cercle extends Forme  {
    public Cercle(){

    }

    public Cercle(int x1,int y1,int x2,int y2){

        super(x1,y1,x2,y2);

    }

    /**
     * Constructeur adapté aux données reçu du serveur.
     * @param couleurRemp
     * @param couleurCont
     * @param x1
     * @param y1
     * @param x2
     */
    public Cercle(Color couleurRemp, Color couleurCont, String nseq, int x1, int y1, int x2) {

        super(couleurRemp, couleurCont, nseq, x1, y1, x2,0);

    }


    /**
     * Trace un cercle selon les données reçues
     * @param g
     */
    @Override
    public void Tracer(Graphics g) {
        int cx = getX1();
        int cy = getX2();
        int r = getY1();

        Graphics2D g2d= (Graphics2D)g;
        g2d.setStroke(new BasicStroke(5.0f));

        g.setColor(getCouleurRemp());
        g.fillOval(Math.min(cx, cy),r,
                (Math.max(cx, cy) - Math.min(cx, cy)), r);
        g.setColor(getCouleurCont());
        g.drawOval(Math.min(cx, cy),r,
                (Math.max(cx, cy) - Math.min(cx, cy)), r);



    }
}
