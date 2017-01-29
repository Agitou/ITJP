package CH8;

import java.util.Scanner;

/**
 * Created by Agitou on 1/30/17.
 */
public class EX8 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        double[][] points = new double[input.nextInt()][2];

        System.out.print("Enter the " + points.length + " points: ");
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        }

        double shortestDistance = shortestDistance(points);
        double distance;

        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){

                distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);

                if(Double.compare(distance, shortestDistance) == 0)
                    System.out.println("The closest two points are "
                            + "(" + points[i][0] + ", " + points[i][1] + ")"
                            + " and (" + points[j][0] + ", " + points[j][1] + ")");
            }

        }

        System.out.println("Their distance is " + shortestDistance);
    }

    public static double shortestDistance(double[][] points){

        int closestIndex1 = 0, closestIndex2 = 1;
        double shortestDistance = distance(points[closestIndex1][0], points[closestIndex1][1],
                points[closestIndex2][0], points[closestIndex2][1]);

        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){

                double curDistance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if(shortestDistance > curDistance){
                    shortestDistance = curDistance;
                }
            }
        }

        return shortestDistance;
    }

    public static double distance(double x1, double y1, double x2, double y2){

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
