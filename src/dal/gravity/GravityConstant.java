package dal.gravity;

/**
 * Created by Owner on 4/4/2017.
 */
public class GravityConstant implements GravityModel {
    /**
     * gravitational constant
     */
    private static double gravity;

    public GravityConstant(double gravity) {
        this.gravity = gravity;
    }

    @Override
    public double getGravitationalField() {
        return gravity;
    }
}
