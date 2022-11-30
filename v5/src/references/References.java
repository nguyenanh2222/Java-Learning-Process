package references;

public class References {
    public Integer a;
    public Integer b;

    public References(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public boolean equals(References obj) {
        return this.b == obj.b;
    }

    @Override
    public String toString() {
        return String.valueOf(hashCode());
    }
}
