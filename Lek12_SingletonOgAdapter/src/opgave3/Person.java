package opgave3;

public class Person {
    private String navn;
    private int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    public String toString() {
        return navn + " " + alder;
    }
}
