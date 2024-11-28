package htl.steyr.adventskalendar;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AdventCalendarController {
    @FXML
    private ImageView ImageView1;
    @FXML
    private ImageView ImageView2;
    @FXML
    private ImageView ImageView3;
    @FXML
    private ImageView ImageView4;
    @FXML
    private ImageView ImageView5;
    @FXML
    private ImageView ImageView6;
    @FXML
    private ImageView ImageView7;
    @FXML
    private ImageView ImageView8;
    @FXML
    private ImageView ImageView9;
    @FXML
    private ImageView ImageView10;
    @FXML
    private ImageView ImageView11;
    @FXML
    private ImageView ImageView12;
    @FXML
    private ImageView ImageView13;
    @FXML
    private ImageView ImageView14;
    @FXML
    private ImageView ImageView15;
    @FXML
    private ImageView ImageView16;
    @FXML
    private ImageView ImageView17;
    @FXML
    private ImageView ImageView18;
    @FXML
    private ImageView ImageView19;
    @FXML
    private ImageView ImageView20;
    @FXML
    private ImageView ImageView21;
    @FXML
    private ImageView ImageView22;
    @FXML
    private ImageView ImageView23;
    @FXML
    private ImageView ImageView24;

    private ImageView[] imageViews;

    @FXML
    public void initialize() {
        imageViews = new ImageView[]{ImageView1, ImageView2, ImageView3, ImageView4, ImageView5, ImageView6, ImageView7, ImageView8, ImageView9, ImageView10, ImageView11, ImageView12, ImageView13, ImageView14, ImageView15, ImageView16, ImageView17, ImageView18, ImageView19, ImageView20, ImageView21, ImageView22, ImageView23, ImageView24};

        for (int i = 0; i < (imageViews.length);) {
            int index = i;
            //imageViews[i].setOnMouseClicked(event -> showImage(index));
            imageViews[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> showImage(index));
            System.out.println(index);
            i++;
        }
    }

    private void showImage(int index) {
        System.out.println("sddsds");
        try {
            File file = new File("images/1.jpeg");
            Image image = new Image(new FileInputStream(file));
            imageViews[index].setImage(image);
        } catch (FileNotFoundException e) {
            System.out.println("Bild nicht gefunden: " + e.getMessage());
        }
    }
}
