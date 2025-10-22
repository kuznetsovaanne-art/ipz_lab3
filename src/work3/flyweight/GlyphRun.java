package work3.flyweight;

public class GlyphRun {
    private Glyph glyph;
    private int x;
    private int y;

    public GlyphRun(Glyph glyph, int x, int y) {
        System.out.println("Конструктор GlyphRun викликаний з координатами x=" + x + ", y=" + y);
        this.glyph = glyph;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Метод draw викликаний у GlyphRun");
    }
}
