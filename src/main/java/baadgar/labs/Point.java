package baadgar.labs;

public class Point {
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        return ("X = " + x + ", Y = " + y);

    }

    public String toSvg() {
        return "<circle r=\"5\" cx=\"" + x + "\" cy=\"" + y + "\" fill=\"black\" />";
        //Przykładowy return, można zamienić filla na dowolnego tak samo radius
    }


    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }

    public void translated(double dx, double dy){
        Point point = new Point(x + dx, y + dy);
    }


}
