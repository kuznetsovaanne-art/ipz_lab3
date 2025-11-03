package work3.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас Client у шаблоні Flyweight, що представляє рядок тексту, який складається з набору об'єктів
 */
public class TextRow {
    private List<GlyphRun> runs = new ArrayList<>();

    /**
     * додає новий об'єкт до рядка тексту
     * @param run
     */
    public void addGlyphRun(GlyphRun run) {
        System.out.println("Метод addGlyphRun викликаний з параметром " + run);
    }

    /**
     * малює всі симмволи рядка
     */
    public void drawRow() {
        System.out.println("Метод drawRow викликаний для TextRow");
    }
}
