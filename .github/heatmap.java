import java.util.List;
import java.util.Arrays;

public class heatmap {
    private final list<float>[][] map;
    Public heatmap(int resolution ) {
        this.map = new list<>[resolution][resolution];
        for int y=0 ; y<resolution ; y++ {
            for int x=0 ; x<resolution ; x++ {
                this.map[y][x] = new arraylist<>();
            }
        }
    }
}
