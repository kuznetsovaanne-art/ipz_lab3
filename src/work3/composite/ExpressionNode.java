package work3.composite;
/**
 * Абстракний клас Component у шаблоні Composite, що визначає спільний інтерфейс для всіх вузлів
 */

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionNode {
    protected List<ExpressionNode> children = new ArrayList<>();

    /**
     * Додає дочірній вузол
     * @param child
     */
    public void addChild(ExpressionNode child) {
        children.add(child);
        System.out.println("Метод addChild викликаний у " + this.getClass().getSimpleName()
                + " для дочірнього елемента " + child.getClass().getSimpleName());
    }

    public abstract String toStructuredString(String indent);

    /**
     * Обчислює числове значення виразу
     * @return результат обчислень
     */
    public abstract double evaluate();
}
