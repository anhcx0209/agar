package engine;

/**
 * Graphic 2D.
 */
public class Graphics2D {
    
    /**
     * Constructor.
     * @param g java graphics 2d.
     */
    public Graphics2D(java.awt.Graphics2D g) {
        m_g = g;
    }
    
    
    /**
     * Return graphics 2D java.
     * @return object.
     */
    public java.awt.Graphics2D get() {
        return m_g;
    } 
    
    
    java.awt.Graphics2D m_g;
}
