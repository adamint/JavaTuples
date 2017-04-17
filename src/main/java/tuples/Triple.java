package tuples;

public class Triple<A, B, C> {
    private A first;
    private B second;
    private C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }
    public C getThird() {
        return third;
    }

    public void setFirst(A first) {
        this.first = first;
    }
    public void setSecond(B second) {
        this.second = second;
    }
    public void setThird(C third) {
        this.third = third;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Triple) {
            Triple t = (Triple) o;
            return t.getFirst().equals(first) && t.getSecond().equals(second) && t.getThird().equals(third);
        }
        else return false;
    }
}
