public class ComputeFactory {

    private static final Add add = new Add();
    private static final Sub sub = new Sub();

    public static Computable getCompute(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Computable) Class.forName(symbol).newInstance();
    }

}
