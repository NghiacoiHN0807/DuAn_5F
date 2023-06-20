
import javax.persistence.*;

@Entity
@Table(name = "images")
public class Images {
    @Id
    @Column(name = "id_images")
    private Integer idImages;

    @Column(name = "id_ctsp")
    private Integer idCtsp;

    @Column(name = "images")
    private String images;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public Integer getIdImages() {
        return this.idImages;
    }

    public void setIdImages(Integer idImages) {
        this.idImages = idImages;
    }

    public Integer getIdCtsp() {
        return this.idCtsp;
    }

    public void setIdCtsp(Integer idCtsp) {
        this.idCtsp = idCtsp;
    }

    public String getImages() {
        return this.images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
