package life.majiang.community.dto;

import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-06-23 13:47
 **/
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}

    