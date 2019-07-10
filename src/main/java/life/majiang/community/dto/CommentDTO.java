package life.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-10 20:11
 **/

@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
    