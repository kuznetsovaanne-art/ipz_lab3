package work3.composite;

public class VariableNode extends ExpressionNode{
    private String name;

    public VariableNode(String name) {
        System.out.println("Конструктор VariableNode викликаний з name=" + name);
        this.name = name;
    }

    @Override
    public String toStructuredString(String indent) {
        System.out.println("Метод toStructuredString викликаний у VariableNode");
        return indent + "Variable(" + name + ")";
    }

    @Override
    public double evaluate() {
        System.out.println("Метод evaluate викликаний у VariableNode з name=" + name);
        return 0; // значення змінної можна задавати через контекст, якщо потрібно
    }
}
