package Seminar_2.CW1;

public class Zadanie4 {
    private double x;
    private double y;
    private double z;

    public Zadanie4(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Zadanie4{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    /**
     * return длину вектора
     * */
    public  double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    /**
     * @return Скалярное произведенеие
     */
    public double proizv(Zadanie4 vektor){
        return x*vektor.x + y*vektor.y + z*vektor.z;
    }

    /**
     * @param vektor
     * @return Произведение вектроро
     */
    public Zadanie4 vect_pr(Zadanie4 vektor){
        return new Zadanie4( y*vektor.z - z*vektor.y, z*vektor.x - x*vektor.z, x*vektor.y - y*vektor.z);
    }
    public double cos_ugl(Zadanie4 vektor){
        return  proizv(vektor)/(vektor.length() * length());
    }
    public Zadanie4 summm(Zadanie4 vektor){
        return new Zadanie4(x + vektor.x, y + vektor.y, z + vektor.z);
    }
    public Zadanie4 diff(Zadanie4 vektor){
        return new Zadanie4(x - vektor.x, y - vektor.y, z - vektor.z);
    }
}
