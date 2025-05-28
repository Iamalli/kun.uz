package dasturlash.uz.aggregation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "region")
public class Region implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ordet_number")

    private String order_number;
    @Column(name = "NameUz")

    private String NameUz;
    @Column(name = "NameRU")

    private String NameRu;
    @Column(name = "NameEn")

    private String NameEn;
    @Column(name = "visible")

    private String visible;
    @Column(name = "created_at")

    private LocalDateTime created_at;


    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Category> category;
}
