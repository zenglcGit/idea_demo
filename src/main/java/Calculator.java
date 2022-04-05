public class Calculator {
    public int compute(int num1, int num2, String symbol) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.compute(num1, num2);
    }
}
