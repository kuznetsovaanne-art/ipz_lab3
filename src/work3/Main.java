package work3;
import work3.flyweight.*;
import work3.composite.*;

/**
 * клас, що демонструє роботу двох швблонів
 */

public class Main {
    /**
     * демонтрує обидва шаблони проєктування
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("=== Демонстрація Composite і Flyweight шаблонів (методи-заглушки) ===");

        ExpressionNode node1 = new ConstantNode(5);
        ExpressionNode node2 = new VariableNode("x");
        ExpressionNode binary = new BinaryExpressionNode(Operator.ADD);
        binary.addChild(node1);
        binary.addChild(node2);
        binary.evaluate();

        GlyphFactory factory = new GlyphFactory();
        Glyph g1 = factory.getGlyph('A', "Arial");
        Glyph g2 = factory.getGlyph('B', "Arial");

        GlyphRun run1 = new GlyphRun(g1, 10, 20);
        GlyphRun run2 = new GlyphRun(g2, 20, 20);

        TextRow row = new TextRow();
        row.addGlyphRun(run1);
        row.addGlyphRun(run2);
        row.drawRow();
    }
}