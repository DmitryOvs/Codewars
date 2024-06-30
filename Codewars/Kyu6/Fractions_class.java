
public class Fractions_class implements Comparable<Fractions_class>
{
    private final long top;
    private final long bottom;

    public long getTop() {
        return top;
    }

    public long getBottom() {
        return bottom;
    }

    public Fractions_class(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fractions_class)o) == 0; }
    @Override
    public int compareTo(Fractions_class f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    public long nod(long x, long y) {
        if(y==0) return x;
        return nod(y, x%y);
    }

    public Fractions_class add(Fractions_class f2) {
        long numeratorR = (getBottom() == f2.getBottom()) ? getTop() + f2.getTop()  : getTop() * f2.getBottom() + f2.getTop() * getBottom();
        long denominatorR = (getBottom() == f2.getBottom()) ? getBottom() : getBottom() * f2.getBottom();
        long del = nod(numeratorR, denominatorR);
        numeratorR /= del;
        denominatorR /= del;

        return new Fractions_class(numeratorR, denominatorR);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}


