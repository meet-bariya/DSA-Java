import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        variableArgs(12,45,77,33,22,77,9);

    }

    static void variableArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
