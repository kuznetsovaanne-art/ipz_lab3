package work3.composite;

/**
 * клас Leaf у шаблоні Composite, що представляє константу
 */
public class ConstantNode extends ExpressionNode{
    private double value;

    /**
     * Створює нове числове значення
     * @param value
     */
    public ConstantNode(double value) {
        System.out.println("Конструктор ConstantNode викликаний з value=" + value);
        this.value = value;
    }

    /**
     * Повертає текстове предсавлення константи
     * @param indent
     * @return
     */
    @Override
    public String toStructuredString(String indent) {
        System.out.println("Метод toStructuredString викликаний у ConstantNode");
        return indent + "Constant(" + value + ")";
    }

    /**
     * Повертає числове значення константи
     * @return
     */
    @Override
    public double evaluate() {
        System.out.println("Метод evaluate викликаний у ConstantNode зі значенням " + value);
        return value;
    }
}
