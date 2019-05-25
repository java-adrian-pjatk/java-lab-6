/*
 * Zadanie 1: My Point
 * Wykonali:
 * Adrian Witkowski
 */

import java.lang.Math;
public class MyPoint
{
    private int x = 0;
    private int y = 0;

    public MyPoint()
    {
    }

    public MyPoint( int x, int y )
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX( int x )
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY( int y )
    {
        this.y = y;
    }

    public int[] getXY()
    {
        return new int[]{ x, y };
    }

    public void setXY( int x, int y )
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    public double distance( int x,int y )
    {
        double dist = Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
        return dist;
    }

    public double distance( MyPoint another )
    {
        int x1 = another.getX();
        int y1 = another.getY();
        double dist = Math.sqrt((this.x-x1)*(this.x-x1)+(this.y-y1)*(this.y-y1));
        return dist;
    }

    public double distance()
    {
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }
}
