package work3.flyweight;

/**
 * Інтерфейс Flyweight у шаблоні Flyweight
 */
public interface Glyph {
    /**
     * виконує відображенння символу у вказаній позиції
     * @param x
     * @param y
     */
    void draw(int x, int y);
    char getSymbol();
}
