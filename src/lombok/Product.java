package lombok;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {"id"})
public class Product {
    private int id;
    private String name;
}
