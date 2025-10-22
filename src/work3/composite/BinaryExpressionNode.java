package work3.composite;

public class BinaryExpressionNode extends ExpressionNode{
    private Operator operator;
    private ExpressionNode left;
    private ExpressionNode right;

    public BinaryExpressionNode(Operator operator) {
        System.out.println("Конструктор BinaryExpressionNode викликаний з оператором " + operator);
        this.operator = operator;
    }

    @Override
    public void addChild(ExpressionNode child) {
        if (left == null) {
            left = child;
            children.add(child);
            System.out.println("Додано лівий вузол: " + child.getClass().getSimpleName());
        } else if (right == null) {
            right = child;
            children.add(child);
            System.out.println("Додано правий вузол: " + child.getClass().getSimpleName());
        } else {
            System.out.println("У BinaryExpressionNode вже є два дочірні вузли");
        }
    }

    @Override
    public String toStructuredString(String indent) {
        System.out.println("Метод toStructuredString викликаний у BinaryExpressionNode");
        String result = indent + "BinaryExpression(" + operator + ")";
        if (left != null) result += "\n" + left.toStructuredString(indent + "  ");
        if (right != null) result += "\n" + right.toStructuredString(indent + "  ");
        return result;
    }

    @Override
    public double evaluate() {
        System.out.println("Метод evaluate викликаний у BinaryExpressionNode з оператором " + operator);
        double leftVal = (left != null) ? left.evaluate() : 0;
        double rightVal = (right != null) ? right.evaluate() : 0;

        switch (operator) {
            case ADD:
                return leftVal + rightVal;
            case SUB:
                return leftVal - rightVal;
            case MUL:
                return leftVal * rightVal;
            case DIV:
                return rightVal != 0 ? leftVal / rightVal : 0;
            default:
                throw new IllegalStateException("Невідомий оператор: " + operator);
        }
    };
}
