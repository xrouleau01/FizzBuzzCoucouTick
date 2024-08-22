public class Cercle extends Forme {
    public int Rayon;

    public Cercle(int rayon) {
        this.Rayon = rayon;
    }

    @Override
    public double getAir() {
        return Math.PI*(Rayon*Rayon);
    }

    @Override
    public double getPeri() {
        return Math.PI*(Rayon*2);
    }
}
