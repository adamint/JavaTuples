package tuples;

public class Septet<A, B, C, D, E, F, G> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;
    private G seventh;

    public Septet(A first, B second, C third, D fourth, E fifth, F sixth, G seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
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

    public G getSeventh() {
        return seventh;
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

    public void setSeventh(G seventh) {
        this.seventh = seventh;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Septet)) return false;
        Septet s = (Septet) o;
        return s.getFirst().equals(first) && s.getSecond().equals(second) && s.getThird().equals(third) &&
                s.getFourth().equals(fourth) && s.getFifth().equals(fifth) && s.getSixth().equals(sixth) && s.getSecond().equals(seventh);
    }
}