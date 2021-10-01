ckage com.ikkino.idioroute.highway;

public class Ciment implements Material{

    private final float coefficient = 0.8;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }

}
