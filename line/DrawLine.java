package line;

public class DrawLine {

    /**
     * 起点x
     */
    private final int sx;
    /**
     * 起点y
     */
    private final int sy;
    /**
     * 终点x
     */
    private final int ex;
    /**
     * 终点y
     */
    private final int ey;

    /**
     * 起点终点斜率
     */
    private float SESlope;

    public DrawLine(int sx, int sy, int ex, int ey) {
        this.sx = sx;
        this.sy = sy;
        this.ex = ex;
        this.ey = ey;

        this.rx=sx;
        this.ry=sy;
        this.SESlope=Math.abs((float) (sy-ey)/(float) (sx-ex));
    }


    /**
     * 路径r
     */
    private int rx;
    /**
     * 路径y
     */
    private int ry;

    private boolean isEnd;


    public void action(){
        if (rx==ex && ry==ey) this.isEnd=true; else this.isEnd=false;
        if (isEnd) return;
        int xp=rx-ex;int yp=ry-ey;float RESlope= Math.abs((float) yp/(float) xp);
        if ((RESlope>SESlope && ry!=ey) || xp==0){ ry=yp>0 ? ry-1 : yp==0 ? ry : ry+1;}
        if ((RESlope<SESlope && rx!=ex) || yp==0){ rx=xp>0 ? rx-1 : xp==0 ? rx : rx+1;}
        if (RESlope==SESlope&& ry!=ey && rx!=ex) {ry=yp>0 ? ry-1 : yp==0 ? ry : ry+1;rx=xp>0 ? rx-1 : xp==0 ? rx : rx+1;}
    }

    public boolean isEnd(){
        return this.isEnd;
    }

    public int getSx() {
        return sx;
    }

    public int getSy() {
        return sy;
    }

    public int getEx() {
        return ex;
    }

    public int getEy() {
        return ey;
    }

    public int getRx() {
        return rx;
    }

    public int getRy() {
        return ry;
    }

    @Override
    public String toString() {
        return "sx="+this.sx+";sy="+this.sy+";ex="+this.ex+";ey="+this.ey;
    }
}
