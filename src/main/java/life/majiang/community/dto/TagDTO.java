package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-15 17:20
 **/

@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
    