package common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Member {

    private String id;
    private String name;
    private int age;
    private NoteBook noteBook;
    private Team teamId;

}
