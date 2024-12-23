import java.lang.reflect.Array;
import java.security.KeyPair;
import java.util.ArrayList;

public class Task1 implements ITask1 {
    private float coefA;
    private float coefB;
    private float coefC;
    public Task1(float coefA, float coefB, float coefC){
        this.coefA = coefA;
        this.coefB = coefB;
        this.coefC = coefC;
    }

    @Override
    public ArrayList<Float> getX(float Y) {
        float d = coefC;
        float discriminant = coefB * coefB - 4 * coefA * coefC;

        if (discriminant < 0) {
            throw new ArithmeticException("Рівняння не має дійсних коренів.");
        }

        float sqrtD = (float) Math.sqrt(discriminant);

        ArrayList<Float> roots = new ArrayList<>();
        roots.add((-coefB + sqrtD) / (2 * coefA));
        roots.add((-coefB - sqrtD) / (2 * coefA));
        return roots;
    }

    @Override
    public float getY(float X) {
        return coefA * X * X + coefB * X + coefC;
    }
}
interface ITask1{
    public ArrayList<Float> getX(float Y);
    public float getY(float X);
}