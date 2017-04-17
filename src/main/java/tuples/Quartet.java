package tuples;

public class Quartet<A, B, C, D> {
    private A first;
    private B second;
    private C third;
    private D fourth;

    public Quartet(A first, B second, C third, D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
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

    public D getFourth() {
        return fourth;
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

    public void setFourth(D fourth) {
        this.fourth = fourth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Quartet)) return false;
        Quartet q = (Quartet) o;
        return q.getFirst().equals(first) && q.getSecond().equals(second) && q.getThird().equals(third) &&
                q.getFourth().equals(fourth);
    }
}