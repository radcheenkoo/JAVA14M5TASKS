import java.util.Objects;

public class StarTrackTest {
    public static void main(String[] args) {
        Point1 p1 = new Point1();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point1 p2 = new Point1();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point1 p3 = new Point1();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true

    }
}

class Point1 {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point1 point = (Point1) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public static void main(String[] args) {
        Point1 p1 = new Point1();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point1 p2 = new Point1();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2));

        System.out.println(Objects.hash(1, 2, 3));
    }
}
class StarTrack extends Point1 {
    private Point1 start;
    private Point1 finish;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StarTrack starTrack = (StarTrack) o;
        return Objects.equals(start, starTrack.start) && Objects.equals(finish, starTrack.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), start, finish);
    }

    public Point1 getStart() {
        return start;
    }

    public void setStart(Point1 start) {
        this.start = start;
    }

    public Point1 getFinish() {
        return finish;
    }

    public void setFinish(Point1 finish) {
        this.finish = finish;
    }
}
