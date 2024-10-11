import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] task1(int[] a){
        if(a == null || a.length == 0){
            return null;
        }
        int[] b = new int[a.length];
        int counterB = 0;
        for (int j : a) {
            if (j < 0) {
                b[counterB++] = j;
            }
        }
        for (int j : a) {
            if (j >= 0) {
                b[counterB++] = j;
            }
        }
        return b;
    }

    public static int task6(int[] a){
        int minimum = Integer.MAX_VALUE;

        for(int element : a){
            if(element < minimum){
                minimum = element;
            }
        }

        return minimum;
    }

    public static int[] task11(int[] a, int aMin, int aMax){
        if(a == null || a.length == 0){
            return null;
        }
        ArrayList<Integer> b = new ArrayList<>();

        for(int element : a){
            if(element < aMin || element > aMax){
                b.add(element);
            }
        }
        if(b.isEmpty()){
           return null;
        }
        int[] result = new int[b.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = b.get(i);
        }

        return result;
    }

    public static HashSet<Integer> task16(int[] a, int[] b){
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int element : a) {
            uniqueValues.add(element);
        }
        for(int element : b){
            if(!uniqueValues.contains(element)){
                uniqueValues.add(element);
            }
            else{
                uniqueValues.remove(element);
            }
        }
        if(uniqueValues.isEmpty()){
            return null;
        }
        return uniqueValues;
    }

    public static double prediction(int x, double k, double b){
        return k * x + b;
    }

    public static boolean task21(int[] a, int[] b){
        if(a.length < 2 || b.length < 2){
            return false;
        }
        double k, c;
        k = (double) (a[1] - a[0]) / (b[1] - b[0]);
        c = (double) a[0] - (double) b[0] * k;

        for(int i = 2; i < a.length; i++){
            if(prediction(b[i], k, c) != a[i])
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println("Task 16");
        HashSet<Integer> result = task16(new int[]{1, 2, 4}, new int[]{2, 5, 6});
        for(int element : result){
            System.out.println(element);
        }
        System.out.println(" ");

        System.out.println("Task 21");
        System.out.println(task21(new int[]{1, 2, 4, 8}, new int[]{3, 5, 9, 18}));
        System.out.println(task21(new int[]{1, 2, 4, 8}, new int[]{3, 5, 9, 17}));
    }
}