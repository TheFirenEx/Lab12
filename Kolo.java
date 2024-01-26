public class Kolo {

    private double promien;

    // alt +ins
    public Kolo() {
        this.promien = 1;

    }

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double pole() {
        return 2 * Math.PI * promien * promien;
    }

    public double obwod() {
        return 2 * Math.PI * promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "promien=" + promien + ", pole=" + pole() + ", obwód=" + obwod() +
                '}';
    }
}
