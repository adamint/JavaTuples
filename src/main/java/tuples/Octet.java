package tuples;

public class Octet<A, B, C, D, E, F, G, H> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;
    private G seventh;
    private H eighth;

    public Octet(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
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

    public H getEighth() {
        return eighth;
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

    public void setEighth(H eighth) {
        this.eighth = eighth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Octet)) return false;
        Octet oc = (Octet) o;
        return oc.getFirst().equals(first) && oc.getSecond().equals(second) && oc.getThird().equals(third) &&
                oc.getFourth().equals(fourth) && oc.getFifth().equals(fifth) && oc.getSixth().equals(sixth) && oc.getSecond().equals
                (seventh) && oc.getEighth().equals(eighth);
    }
}