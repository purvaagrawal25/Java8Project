
@FunctionalInterface
interface TestInterface {
    public abstract int testMethod(int a, int b, int c, int d, int e);
}

class Testing {

    public static void main(String[] args) {

        TestInterface t1 = (int a, int b, int c, int d, int e) -> (a + b + c + d + e);
        System.out.println(t1.testMethod(1, 2, 3, 4, 5));
    }
}