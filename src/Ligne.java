import java.awt.*;

/**
 * Created by Bardock on 1/23/2017.
 */
public class Ligne extends Forme  {
    public Ligne(){

    }

    public Ligne(int x1,int y1,int x2,int y2){

        super(x1,y1,x2,y2);

    }

    /**
     * Constructeur adapté aux données reçu du serveur.
     * @param couleurRemp
     * @param couleurCont
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Ligne(Color couleurRemp, Color couleurCont, String nseq, int x1, int y1, int x2, int y2) {

        super(couleurRemp, couleurCont, nseq, x1, y1, x2, y2);

    }


    /**
     * Trace une ligne selon les données reçues
     * @param g
     */
    @Override
    public void Tracer(Graphics g) {
        int x1 = getX1();
        int x2 = getX2();
        int y1 = getY1();
        int y2 = getY2();
        Graphics2D g2d= (Graphics2D)g;
        g2d.setStroke(new BasicStroke(5.0f));

        g.setColor(getCouleurRemp());

        g.drawLine(Math.min(x1, x2),Math.min(y1, y2),
                (Math.max(x1, x2) - Math.min(x1, x2)), (Math.max(y1, y2) - Math.min(y1, y2)));



    }
}
