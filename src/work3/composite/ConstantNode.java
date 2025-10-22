package work3.composite;

public class ConstantNode extends ExpressionNode{
    private double value;

    public ConstantNode(double value) {
        System.out.println("Конструктор ConstantNode викликаний з value=" + value);
        this.value = value;
    }

    @Override
    public String toStructuredString(String indent) {
        System.out.println("Метод toStructuredString викликаний у ConstantNode");
        return indent + "Constant(" + value + ")";
    }

    @Override
    public double evaluate() {
        System.out.println("Метод evaluate викликаний у ConstantNode зі значенням " + value);
        return value;
    }
}
