package life.majiang.community.enums;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-10 20:33
 **/

public enum CommentTypeEnum {
    //
    QUESTION(1),
    COMMENT(2);
    private Integer type;


    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type) {
                return true;
            }
        }
        return false;
    }
}

    