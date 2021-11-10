package jpql;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

    private String userName;

    private int age;

    public MemberDto(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}
