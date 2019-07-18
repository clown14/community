package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-18 15:27
 **/

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}

    