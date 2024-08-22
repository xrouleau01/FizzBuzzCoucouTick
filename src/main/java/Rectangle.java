public class Rectangle extends Forme {
    public int Longueur;
    public int Largeur;

    public Rectangle(int largeur, int longueur) {
        this.Longueur = longueur;
        this.Largeur = largeur;
    }

    @Override
    public double getAir() {
        return Longueur*Largeur;
    }

    @Override
    public double getPeri() {
        return Longueur * 2 + Largeur * 2;
    }
}
