package work3.flyweight;

/**
 * Клас Context у шаблоні Flyweight, що містить зовнішній стан, який не є частиною легковажного об'єкта
 */
public class GlyphRun {
    private Glyph glyph;
    private int x;
    private int y;

    /**
     * Створює контекст для відображення символу в заданих координатах
     * @param glyph
     * @param x
     * @param y
     */
    public GlyphRun(Glyph glyph, int x, int y) {
        System.out.println("Конструктор GlyphRun викликаний з координатами x=" + x + ", y=" + y);
        this.glyph = glyph;
        this.x = x;
        this.y = y;
    }

    /**
     * Викликає метод для відображення символу у контексті об'єкта
     */
    public void draw() {
        System.out.println("Метод draw викликаний у GlyphRun");
        glyph.draw(x, y);
    }
}
