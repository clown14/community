package life.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-25 15:20
 **/

@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
    