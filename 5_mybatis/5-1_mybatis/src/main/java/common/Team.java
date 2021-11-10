package common;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Team {

    private String teamName;
    private Location locationName;
    private List<Member> member;

}
