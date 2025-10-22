package work3.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextRow {
    private List<GlyphRun> runs = new ArrayList<>();

    public void addGlyphRun(GlyphRun run) {
        System.out.println("Метод addGlyphRun викликаний з параметром " + run);
    }

    public void drawRow() {
        System.out.println("Метод drawRow викликаний для TextRow");
    }
}
