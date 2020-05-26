public class classA {
    private static classA instance;
    private classA() {
    }
    public static classA getInstance() {
        if (instance == null) {
            instance = new classA();
        }
        return instance;
    }
}
