package life.majiang.community.community.model;

import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-06-26 14:38
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}

    