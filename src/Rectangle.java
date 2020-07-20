public class Rectangle extends Forme implements Comparable {
    private double largeur;
    private double longueur;

    public Rectangle(double largeur,double longueur){
        this.largeur=largeur;
        this.longueur=longueur;
    }
    public double surface(){
        return this.largeur*this.longueur;
    }
    public  double perimetre(){
        return (this.largeur+this.longueur)/2;
    }

    public String toString(){
        return "la largeur de se rectangle est "+this.largeur+" la longueur est "+this.longueur+" la surface est " +
                ""+this.surface()+" le perimetre est "+this.perimetre();
    }

    @Override
    public String enplusComparable(Comparable p1) {
       // return this.surface()>p1.surface ? this.surface()+" plus grande que "+p1.surface() : p1.surface()+" plus grande que "+this.surface() ;
      return null;
    }
}
