package tuples;

/**
 * I know it's an Ennead -.-
 */
public class Ninetet<A, B, C, D, E, F, G, H, I> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;
    private G seventh;
    private H eighth;
    private I ninth;

    public Ninetet(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth, I ninth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
        this.ninth = ninth;
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
    public I getNinth() {
        return ninth;
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
    public void setNinth(I ninth) {
        this.ninth = ninth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ninetet)) return false;
        Ninetet n = (Ninetet) o;
        return n.getFirst().equals(first) && n.getSecond().equals(second) && n.getThird().equals(third) &&
                n.getFourth().equals(fourth) && n.getFifth().equals(fifth) && n.getSixth().equals(sixth) && n.getSecond().equals
                (seventh) && n.getEighth().equals(eighth) && n.getNinth().equals(ninth);
    }
}