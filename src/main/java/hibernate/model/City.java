package hibernate.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
    private int city_id;
    private String city_name;


    public City(int city_id) {

    }
}
