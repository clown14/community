package life.majiang.community.community.model;

import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-06-28 14:54
 **/
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}

    