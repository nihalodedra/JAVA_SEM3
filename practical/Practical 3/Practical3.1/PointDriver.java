public class PointDriver {
    public static void main(String[] args) {

        Point[] pointList = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(1, 2),
            new Point(5, 6),
            new Point(3, 4)
        };

        int distinctCount = 0;

        for (int i = 0; i < pointList.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (pointList[i].equals(pointList[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinctCount++;
            }
        }

        System.out.println("Distinct: " + distinctCount);
    }
}