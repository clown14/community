package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-12 20:11
 **/
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
}

    