package work3.flyweight;

public class ConcreteGlyphFlyweight implements Glyph{
    private final char symbol;
    private final String font;

    public ConcreteGlyphFlyweight(char symbol, String font) {
        System.out.println("Конструктор ConcreteGlyphFlyweight викликаний з symbol=" + symbol + ", font=" + font);
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Малюємо символ '" + symbol + "' шрифтом " + font + " на (" + x + ", " + y + ")");
    }

    @Override
    public char getSymbol() {
        System.out.println("Метод getSymbol викликаний у ConcreteGlyphFlyweight");
        return symbol;
    }
}
