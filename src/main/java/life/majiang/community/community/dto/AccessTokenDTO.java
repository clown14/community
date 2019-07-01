package life.majiang.community.community.dto;

import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-06-23 13:13
 **/
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}

    