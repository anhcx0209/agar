package engine;

import java.util.ArrayList;
import java.util.List;

/**
 * Sprite Group.
 */
public class SpriteGroup extends com.golden.gamedev.object.SpriteGroup {

    /**
     * Constructor.
     * @param string name of sprite group.
     */
    public SpriteGroup(String string) {
        super(string);
    }
    
    /**
     * Add a sprite to end of list.
     * @param s sprite.
     */
    public void add(Sprite s) {
        super.add(s);      
    }
    
    /**
     * Add sprite at position of group.
     * @param i position to add.
     * @param s sprite.
     */
    public void add(int i, Sprite s) {
        super.add(i, s);
    }        
    
    /**
     * Remove sprite from group.
     * @param s sprite to remove.
     */
    public void remove(Sprite s) {
        super.remove(s);
    }
    
    /**
     * Set background for group.
     * @param bg background.
     */
    public void setBackground(ImageBackground bg) {
        super.setBackground(bg);
    }
    
    /**
     * Update attributes of group.
     * @param elapsed period to update.
     */
    @Override
    public void update(long elapsed) {
        super.update(elapsed);
    }
    
    /**
     * Render.
     * @param g graphics context. 
     */
    public void render(Graphics2D g) {
        super.render(g.get());
    }
    
    /**
     * List all sprite in group.
     * @return list of sprite.
     */
    public List<Sprite> toList() {
        List<Sprite> result = new ArrayList<>();
        com.golden.gamedev.object.Sprite[] local = this.getSprites();
        for (com.golden.gamedev.object.Sprite sprite : local) {
            result.add((Sprite) sprite);
        }
        return result;
    }
}
