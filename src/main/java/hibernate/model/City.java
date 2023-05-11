package hibernate.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Setter
@ToString
@EqualsAndHashCode(of = "city_id")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    private String cityName;
    @OneToMany(mappedBy =  "city", cascade = CascadeType.ALL)
    private List <Employee> employees;

}
