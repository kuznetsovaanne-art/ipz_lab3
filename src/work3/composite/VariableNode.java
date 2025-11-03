package work3.composite;

/**
 * Клас Leaf у шаблоні Composite, що представляє зміну
 */
public class VariableNode extends ExpressionNode{
    private String name;

    /**
     * Створює вузол для змінної із вказаним ім'ям
     * @param name
     */
    public VariableNode(String name) {
        System.out.println("Конструктор VariableNode викликаний з name=" + name);
        this.name = name;
    }

    /**
     * Формує текстове представлення вузла
     * @param indent
     * @return
     */
    @Override
    public String toStructuredString(String indent) {
        System.out.println("Метод toStructuredString викликаний у VariableNode");
        return indent + "Variable(" + name + ")";
    }

    /**
     * Повертає значення змінної
     * @return
     */
    @Override
    public double evaluate() {
        System.out.println("Метод evaluate викликаний у VariableNode з name=" + name);
        return 0; // значення змінної можна задавати через контекст, якщо потрібно
    }
}
