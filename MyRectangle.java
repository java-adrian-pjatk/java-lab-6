/*
 * Zadanie 4: My Rectangle
 * Wykonali:
 * Adrian Witkowski
 */

public class MyRectangle
{
    private MyPoint top_left;
    private MyPoint bottom_right;

    public MyRectangle( int x1, int y1, int x2, int y2 )
    {
        this.top_left = new MyPoint( x1, y1 );
        this.bottom_right = new MyPoint( x2, y2 );
    }

    public double getPerimeter()
    {
        MyPoint v1 = new MyPoint( this.top_left.getX(), this.top_left.getY() );
        MyPoint v2 = new MyPoint( this.bottom_right.getX(), this.top_left.getY() );
        MyPoint v3 = new MyPoint( this.bottom_right.getX(), this.bottom_right.getY() );
        MyPoint v4 = new MyPoint( this.top_left.getX(), this.bottom_right.getY() );
        return v1.distance( v2 ) + v2.distance( v3 ) + v3.distance( v4 ) + v4.distance( v1 );
    }

    public double getArea()
    {
        MyPoint v1 = new MyPoint( this.top_left.getX(), this.top_left.getY() );
        MyPoint v2 = new MyPoint( this.bottom_right.getX(), this.top_left.getY() );
        MyPoint v3 = new MyPoint( this.bottom_right.getX(), this.bottom_right.getY() );
        MyPoint v4 = new MyPoint( this.top_left.getX(), this.bottom_right.getY() );
        return v1.distance( v2 ) * v2.distance( v3 );
    }

    public String toString()
    {
        MyPoint v1 = new MyPoint( this.top_left.getX(), this.top_left.getY() );
        MyPoint v2 = new MyPoint( this.bottom_right.getX(), this.top_left.getY() );
        MyPoint v3 = new MyPoint( this.bottom_right.getX(), this.bottom_right.getY() );
        MyPoint v4 = new MyPoint( this.top_left.getX(), this.bottom_right.getY() );
        return "MyRectangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + ",v4=" + v4.toString() + "]";
    }
}