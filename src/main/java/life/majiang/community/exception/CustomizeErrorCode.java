package life.majiang.community.exception;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-08 17:18
 **/

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    //question
    QUESTION_NOT_FOUND("你找的问题不在了，要不要换个试试？");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {

        this.message = message;
    }
}

    