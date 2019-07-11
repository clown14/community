package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-01 14:43
 **/
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}

    