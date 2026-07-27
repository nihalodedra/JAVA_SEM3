public class Fraction {
    private int num;
    private int den;

    public Fraction(int n, int d) {
        if (d == 0) {
            System.out.println("Invalid denominator");
            return;
        }

        int a = n;
        int b = d;

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        num = n / a;
        den = d / a;
    }

    public String toString() {
        return num + "/" + den;
    }

    public boolean equals(Object o) {
        Fraction f = (Fraction) o;
        return num == f.num && den == f.den;
    }

    public int hashCode() {
        return num * 31 + den;
    }
}