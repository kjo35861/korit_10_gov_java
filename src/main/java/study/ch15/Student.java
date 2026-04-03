package study.ch15;

import lombok.*;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
//    private final String name; // final 은 상수로 설정(필수), 수정불가
    @NonNull                     // 필수 입력 / 수정가능
    private String name;
//    private final int age;
    @NonNull
    private int age;
    private String address;

    public Student () {
        name = "기본값";
        age = 0;
    }
}
