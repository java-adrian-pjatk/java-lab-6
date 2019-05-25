/*
 * Zadanie 1-7
 * Wykonali:
 * Adrian Witkowski
 */

public class Main
{
    public static void main(String[] args)
    {
        MyPoint mypoint = new MyPoint( 3, 4 );
        System.out.println(mypoint.distance());

        MyCircle mycircle = new MyCircle( 3, 4, 2 );
        System.out.println(mycircle.toString());

        MyTriangle mytriangle = new MyTriangle( 4, 4, 0, 0, 0, 4 );
        System.out.println(mytriangle.getType());
    }
}