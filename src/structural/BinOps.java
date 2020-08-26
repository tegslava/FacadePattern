package structural;

public class BinOps {
    public String sum(String a, String b) {
        try {
            int a_int = Integer.parseInt(a, 2);
            int b_int = Integer.parseInt(b, 2);
            int sum = a_int + b_int;
            return Integer.toBinaryString(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String mult(String a, String b) {
        try {
            int a_int = Integer.parseInt(a, 2);
            int b_int = Integer.parseInt(b, 2);
            int sum = a_int * b_int;
            return Integer.toBinaryString(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}