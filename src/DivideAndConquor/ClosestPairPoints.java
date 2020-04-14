package DivideAndConquor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ClosestPairPoints {
    /////////////////////////////////////////////
    // A structure to represent a Point in 2D plane
    static class Point
    {
        int x, y;
        Point(int xx,int yy){
            x=xx;
            y=yy;
        }
    }
////////////////////////////////////////
    public static void  main(String args[]) throws IOException
    {
        Point[] P = new Point[6];
        P[0]=new Point(2, 3);
        P[1]=new Point(12, 30);
        P[2]=new Point(40, 50);
        P[3]=new Point(5, 1);
        P[4]=new Point(12, 10);
        P[5]=new Point(3, 4) ;
        int n = P.length;
        System.out.println("The smallest distance is " + closest(P, n));
    }

    /////////////////////////////////////
    // The main function that finds the smallest distance
// This method mainly uses closestUtil()
   static float closest(Point P[], int n)
    {
        Point[] Px=new Point[n];
        Point [] Py=new Point[n];
        for (int i = 0; i < n; i++)
        {
            Px[i] = P[i];
            Py[i] = P[i];
        }

        Arrays.sort(Px,new compareX());
        Arrays.sort(Py, new compareY());

        // Use recursive function closestUtil() to find the smallest distance
        return closestUtil(Px, Py, n);
    }


    // Needed to sort array of points according to X coordinate
    static class compareX implements Comparator<Point>{

        @Override
        public int compare(Point p1, Point p2) {
            int k=(p1.x<p2.x)?-1:1;
            if(p1.x==p2.x){
                k=0;
            }
            return k;
        }
    }


    // Needed to sort array of points according to Y coordinate

    static class compareY implements Comparator<Point>{

        @Override
        public int compare(Point p1, Point p2) {
            int k=(p1.y<p2.y)?-1:1;
            if(p1.y==p2.y){
                k=0;
            }
            return k;
        }
    }
    //////////////////////////////////////////////////////////

    // A recursive function to find the smallest distance. The array Px contains
// all points sorted according to x coordinates and Py contains all points
// sorted according to y coordinates
    static float closestUtil(Point Px[], Point Py[], int n)
    {
        // If there are 2 or 3 points, then use brute force
        if (n <= 3)
            return bruteForce(Px, n);

        // Find the middle point
        int mid = n/2;
        Point midPoint = Px[mid];


        // Divide points in y sorted array around the vertical line.
        // Assumption: All x coordinates are distinct.
        Point Pyl[]=new Point[mid+1]; // y sorted points on left of vertical line
        Point Pyr[]=new Point[n-mid-1]; // y sorted points on right of vertical line
        int li = 0, ri = 0; // indexes of left and right subarrays
        for (int i = 0; i < n && li<Pyl.length && ri<Pyr.length; i++)
        {
            if (Py[i].x <= midPoint.x)
                Pyl[li++] = Py[i];
            else
                Pyr[ri++] = Py[i];
        }

        Point Pxl[]=new Point[mid+1]; // y sorted points on left of vertical line
        Point Pxr[]=new Point[n-mid-1]; // y sorted points on right of vertical line
        li = 0;
        ri = 0; // indexes of left and right subarrays
        for (int i = 0; i < n && li<Pxl.length && ri<Pxr.length; i++)
        {
            if (Px[i].x <= midPoint.x)
                Pxl[li++] = Px[i];
            else
                Pxr[ri++] = Px[i];
        }

        // Consider the vertical line passing through the middle point
        // calculate the smallest distance dl on left of middle point and
        // dr on right side
        float dl = closestUtil(Pxl, Pyl, mid);
        float dr = closestUtil(Pxr, Pyr, n-mid);

        // Find the smaller of two distances
        float d = Math.min(dl, dr);

        // Build an array strip[] that contains points close (closer than d)
        // to the line passing through the middle point
        ArrayList<Point> strip=new ArrayList<Point>();
      //  Point strip[]=new Point[n];
      //  int j = 0;
        for (int i = 0; i < n; i++)
            if (Math.abs(Py[i].x - midPoint.x) < d)
            { strip.add(Py[i]);
               // strip[j] = Py[i];j++;
            }

        // Find the closest points in strip. Return the minimum of d and closest
        // distance is strip[]
        return Math.min(d, stripClosest(strip, strip.size(), d) );
    }
////////////////////////////////////////////////////////
// A utility function to find the distance between two points
static float dist(Point p1, Point p2)
{
if(p1==null || p2==null){
    return Float.MAX_VALUE;
}
    return (float) Math.sqrt(  (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
}
///////////////////////////////////////////////////////

    // A Brute Force method to return the smallest distance between two points
// in P[] of size n
    static float bruteForce(Point P[], int n)
    {
        n=P.length;
        float min = Float.MAX_VALUE;
        for (int i = 0; i < n; ++i)
        {   for (int j = i+1; j < n; ++j)
            {  if (dist(P[i], P[j]) < min)
                { min = dist(P[i], P[j]);}}}
        return min;
    }

    // A utility function to find a minimum of two float values
  static float min(float x, float y)
    {
        return (x < y)? x : y;
    }
    /////////////////////////////////////////////////////////////

    // A utility function to find the distance between the closest points of
// strip of a given size. All points in strip[] are sorted according to
// y coordinate. They all have an upper bound on minimum distance as d.
// Note that this method seems to be a O(n^2) method, but it's a O(n)
// method as the inner loop runs at most 6 times
   static float stripClosest( ArrayList<Point> strip, int size, float d)
    {
        float min = d; // Initialize the minimum distance as d

        // Pick all points one by one and try the next points till the difference
        // between y coordinates is smaller than d.
        // This is a proven fact that this loop runs at most 6 times
        for (int i = 0; i < size; ++i)
        { for (int j = i+1; j < size && (strip.get(j).y - strip.get(i).y) < min; ++j)
            {  if (dist(strip.get(i),strip.get(j)) < min)
                {  min = dist(strip.get(i), strip.get(j));}}}

        return min;
    }


}



