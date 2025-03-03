package baadgar.labs;

public class Segment {

    public Point p1 = new Point(1, 2);
    public Point p2 = new Point(5, 4); //przykladowe wartosci

    double length(){
        return (Math.sqrt(Math.pow((p2.x-p1.x), 2) + Math.pow((p2.y-p1.y), 2)));
    }

    public static Segment retSeg(Segment[] segments){

        Segment longest = new Segment();

        for (Segment segment : segments) {
            if (segment.length() > longest.length()) {
                longest = segment;
            }
        }
        return longest;
    }
}
