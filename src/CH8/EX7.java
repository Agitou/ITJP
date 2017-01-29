package CH8;

/**
 * Created by Agitou on 1/30/17.
 */
public class EX7 {

    public static void main(String[] args){

        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        int closestIndex1 = 0, closestIndex2 = 1;
        double shortestDistance = distance(points[closestIndex1][0], points[closestIndex1][1], points[closestIndex1][2],
                points[closestIndex2][0], points[closestIndex2][1], points[closestIndex2][2]);

        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){

                double curDistance = distance(points[i][0], points[i][1], points[i][2],
                        points[j][0], points[j][1], points[j][2]);

                if(shortestDistance > curDistance){
                    shortestDistance = curDistance;
                    closestIndex1 = i;
                    closestIndex2 = j;
                }
            }
        }

        System.out.print("The closest points: " +
                        "p1(" + points[closestIndex1][0] + " " + points[closestIndex1][1] + " " + points[closestIndex1][2] + "), " +
                        "p2(" + points[closestIndex2][0] + " " + points[closestIndex2][1] + " " +points[closestIndex2][2] + ")" +
                        " with distance of " + shortestDistance);



    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2){

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }
}
