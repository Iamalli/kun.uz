package dasturlash.uz.aggregation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ozbkeiston")
    private String Ozbekiston;

    @Column(name = "jahon")
    private String Jahon;

    @Column(name = "iqtisodiyot")
    private String Iqsodiyot;

    @Column(name = "sprot")
    private String Sport;

    @Column(name = "audio")
    private String Audio;

    @Column(name = "video")
    private String Video;

    @Column(name = "jamiyat")
    private LocalDateTime Jamiyat;



}
