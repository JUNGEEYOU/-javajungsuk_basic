public class Ex6_4 {

    public static void main(String[] args){
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5, 3);
        mm.printGugudan(9);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
}

}
class MyMath {
    void printGugudan(int dan){
        if(!(2 <= dan && dan <= 9)){
            return;
        }
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d %n", dan, i, dan * i);
        }
    }
    long max(long a, long b){
        return a > b ? a: b;
    }
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
