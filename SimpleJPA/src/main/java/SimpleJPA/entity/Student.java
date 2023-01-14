package SimpleJPA.entity;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.scheduling.annotation.Scheduled;

@RedisHash("Student")
@AllArgsConstructor
@ToString
@Setter
public class Student {
    public enum Gender{
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
