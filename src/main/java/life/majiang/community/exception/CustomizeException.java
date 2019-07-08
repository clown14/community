package life.majiang.community.exception;

/**
 * @program: community
 * @author: onion
 * @create: 2019-07-08 17:08
 **/

public class CustomizeException extends RuntimeException {

    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

    