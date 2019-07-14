package life.majiang.community.mapper;

import life.majiang.community.model.Comment;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-14 17:18
 **/

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
    