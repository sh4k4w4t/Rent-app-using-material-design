package sh4k4w4t.github.io.materialrentapps;

public class Model_image_title_desc {
    int image;
    String title,Description;

    public Model_image_title_desc(int image, String title, String description) {
        this.image = image;
        this.title = title;
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }
}
