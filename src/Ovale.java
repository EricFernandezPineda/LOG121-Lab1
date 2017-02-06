import java.awt.*;

/**
 * Created by Bardock on 1/23/2017.
 */
public class Ovale extends Forme{

    public Ovale(){

    }

    public Ovale(int x1,int y1,int x2,int y2){

        super(x1,y1,x2,y2);

    }

    /**
     *
     * @param couleurRemp
     * @param couleurCont
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Ovale(Color couleurRemp, Color couleurCont, String nseq, int x1, int y1, int x2, int y2) {

        super(couleurRemp, couleurCont, nseq, x1, y1, x2, y2);

    }



    @Override
    public void Tracer(Graphics g) {
        int cx = getX1();
        int rh = getX2();
        int cy = getY1();
        int rv = getY2();
        Graphics2D g2d= (Graphics2D)g;
        g2d.setStroke(new BasicStroke(5.0f));

        g.setColor(getCouleurRemp());
        g.fillOval (Math        .min(cx, rh),Math.min(cy, rv),
                (Math.max(cx, rh) - Math.min(cx, rh)), (Math.max(cy, rv) - Math.min(cy, rv)));
        g.setColor(getCouleurCont());
        g.drawOval(Math.min(cx, rh),Math.min(cy, rv),
                (Math.max(cx, rh) - Math.min(cx, rh)), (Math.max(cy, rv) - Math.min(cy, rv)));



    }
}
