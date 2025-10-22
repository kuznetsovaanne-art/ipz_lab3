package work3.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionNode {
    protected List<ExpressionNode> children = new ArrayList<>();

    public void addChild(ExpressionNode child) {
        children.add(child);
        System.out.println("Метод addChild викликаний у " + this.getClass().getSimpleName()
                + " для дочірнього елемента " + child.getClass().getSimpleName());
    }

    public abstract String toStructuredString(String indent);

    public abstract double evaluate();
}
