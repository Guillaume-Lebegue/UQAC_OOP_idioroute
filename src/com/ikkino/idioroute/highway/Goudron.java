ckage com.ikkino.idioroute.highway;

public class Goudron implements Material{

    private final float coefficient = 1;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }
}
