package imageviewermvp.view;

import imageviewermvp.model.Image;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/12 20:30 GMT
 *
 */

public interface ImageDisplay {
    
    void display(Image image);
    Image image();
    void on(Shift shift);
    
    interface Shift {
        Image left();
        Image rigth();
    }
}
