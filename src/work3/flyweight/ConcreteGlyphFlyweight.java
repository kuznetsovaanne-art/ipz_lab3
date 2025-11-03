package work3.flyweight;

/**
 * Клас ConcreteFlyweight у шаблоні Flyweight, що реалізує інтерфейс
 */
public class ConcreteGlyphFlyweight implements Glyph{
    private final char symbol;
    private final String font;

    /**
     * створює новий об'єкт для символу та шрифту
     * @param symbol
     * @param font
     */
    public ConcreteGlyphFlyweight(char symbol, String font) {
        System.out.println("Конструктор ConcreteGlyphFlyweight викликаний з symbol=" + symbol + ", font=" + font);
        this.symbol = symbol;
        this.font = font;
    }

    /**
     * Малює символ у заданих координатах
     * @param x
     * @param y
     */
    @Override
    public void draw(int x, int y) {
        System.out.println("Малюємо символ '" + symbol + "' шрифтом " + font + " на (" + x + ", " + y + ")");
    }

    /**
     * Повертає символ, що представляє об'єкт
     * @return
     */
    @Override
    public char getSymbol() {
        System.out.println("Метод getSymbol викликаний у ConcreteGlyphFlyweight");
        return symbol;
    }
}
