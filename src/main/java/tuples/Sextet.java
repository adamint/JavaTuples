package tuples;

public class Sextet<A, B, C, D, E, F> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;

    public Sextet(A first, B second, C third, D fourth, E fifth, F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
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
    public E getFifth() {
        return fifth;
    }
    public F getSixth() {
        return sixth;
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
    public void setFifth(E fifth) {
        this.fifth = fifth;
    }
    public void setSixth(F sixth) {
        this.sixth = sixth;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sextet)) return false;
        Sextet s = (Sextet) o;
        return s.getFirst().equals(first) && s.getSecond().equals(second) && s.getThird().equals(third) &&
                s.getFourth().equals(fourth) && s.getFifth().equals(fifth) && s.getSixth().equals(sixth);
    }
}