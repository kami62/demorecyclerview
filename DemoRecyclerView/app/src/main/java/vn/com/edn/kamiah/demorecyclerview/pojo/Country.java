package vn.com.edn.kamiah.demorecyclerview.pojo;

/**
 * Created by PC14-02 on 7/5/2016.
 */
public class Country {

    private String imageUrl;
    private String enName;
    private String viName;

    public Country(String imageUrl, String enName, String viName) {
        this.imageUrl = imageUrl;
        this.enName = enName;
        this.viName = viName;
    }

    public Country() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getViName() {
        return viName;
    }

    public void setViName(String viName) {
        this.viName = viName;
    }
}
