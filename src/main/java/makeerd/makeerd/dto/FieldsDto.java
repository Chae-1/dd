package makeerd.makeerd.dto;


import lombok.*;
import makeerd.makeerd.domain.JoinUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of= {"field", "detailField", "totalNum"})
public class FieldsDto implements Serializable {
    private String field;
    private String detailField;
    private Integer totalNum;

    public static List<JoinUser> dtoToRequiredUsers(List<FieldsDto> dtoList) {
        List<JoinUser> joinUsers = new ArrayList<>();
//        for (JoinUser joinUser : joinUsers) {
//            System.out.println("requiredUser = " + joinUser);
//        }
//        for (FieldsDto fieldsDto : dtoList) {
//            joinUsers.add(JoinUser
//                    .builder()
//                    .requiredQuantity(fieldsDto.getTotalNum())
//                    .field(fieldsDto.getField())
//                    .detailField(fieldsDto.getDetailField())
//                    .build());

//        }
//        return joinUsers;
        return null;
    }
}
