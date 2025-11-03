package work3.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас FlyweightFactory у шаблоні Flyweight, що відповідає за створення та повторне використання об'єктів
 */
public class GlyphFactory {
    private final Map<String, Glyph> pool = new HashMap<>();

    /**
     * Повертає об’єкт Glyph, який відповідає заданому символу та шрифту
     * @param symbol
     * @param font
     * @return
     */
    public Glyph getGlyph(char symbol, String font) {
        String key = symbol + "_" + font;
        Glyph glyph = pool.get(key);

        if (glyph == null) {
            System.out.println("Створюємо новий Glyph для " + key);
            glyph = new ConcreteGlyphFlyweight(symbol, font);
            pool.put(key, glyph);
        } else {
            System.out.println("Використовується наявний Glyph для " + key);
        }

        return glyph;
    }

    /**
     * Повертає поточну кількість унікальних об’єктів
     * @return
     */
    public int poolSize() {
        return pool.size();
    }
}
