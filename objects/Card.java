package objects;

import java.net.URL;

/**
 *
 * @author damian
 */
public class Card {
    private int id;
    private int pairId;
    private URL image;

    public Card(int id, int pairId, URL image) {
        this.id = id;
        this.pairId = pairId;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPairId() {
        return pairId;
    }

    public void setPairId(int pairId) {
        this.pairId = pairId;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }
}
