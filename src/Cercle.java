public class Cercle extends Forme implements Comparable {
    private double rayon;

    Cercle(double rayon){
        this.rayon=rayon;
    }
    public double surface(){
        return this.rayon*2*Math.PI;
    }
    public  double perimetre(){
        return (this.rayon*this.rayon)*Math.PI;
    }

    public String toString(){
        return "le rayon de se  cercle  est "+this.rayon+" la surface est " +
                ""+this.surface()+" le perimetre est "+this.perimetre();
    }

    @Override
    public String enplusComparable(Comparable p1) {
        return null;
    }
}
