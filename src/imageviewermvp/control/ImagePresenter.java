
package imageviewermvp.control;

import imageviewermvp.model.Image;
import imageviewermvp.view.ImageDisplay;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/12 20:30 GMT
 *
 */

public class ImagePresenter {

    private final List<Image> images;
    private final ImageDisplay imageDisplay;

    public ImagePresenter(List<Image> images, ImageDisplay imageDisplay) {
        this.images = images;
        this.imageDisplay = imageDisplay;
        this.imageDisplay.on(shift());
    }

    private ImageDisplay.Shift shift() {
        return new ImageDisplay.Shift() {
            @Override
            public Image left() {
                return images.get((current() + 1) % images.size());
            }

            @Override
            public Image rigth() {
                return images.get((current() - 1 + images.size()) % images.size());
            }

            private int current() {
                return images.indexOf(imageDisplay.image());
            } 
        };
    }
    
    
}
