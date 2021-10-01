ckage com.ikkino.idioroute.highway;

public class Ciment extends Highway implements Material{

    private float coefficient;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }

    private float setCoefficient(float newCoefficient){
        this.coefficient = newCoefficient;
    }

    public Asphalte(float radius, Material material, float coefficient) {
        super(radius, material);
        this.coefficient = coefficient;
    }
}
