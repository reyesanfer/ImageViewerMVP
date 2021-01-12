package imageviewermvp.app;

import imageviewermvp.control.ImagePresenter;
import imageviewermvp.model.Image;
import imageviewermvp.view.ImageDisplay;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/12 20:30 GMT
 *
 */

public class Main extends JFrame{
    
    private ImageDisplay imageDisplay;
    private final ImagePresenter imagePresenter;

    public static void main(String[] args) {
        
        new Main().execute();
        
    }
    
    public Main() {
        this.setTitle("Image Viewer");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        
        List<Image> list = new ArrayList<>();
        list.add(new Image("fotos/1.jpg"));
        list.add(new Image("fotos/2.jpg"));
        list.add(new Image("fotos/3.jpg"));
        
        this.getContentPane().add(createImagePanel());
        
        this.imageDisplay.display(list.get(0));
        this.imagePresenter = new ImagePresenter(list, imageDisplay);
    }

    private void execute() {
        this.setVisible(true);
    }
    
    private JPanel createImagePanel() {
        ImagePanel imagePanel = new ImagePanel();
        this.imageDisplay = imagePanel;
        return imagePanel;
    }

}
