package am.gitc.common.util;

/**
 * Created by Zorik Zaqaryan on 07.03.2016.
 */
public enum ResponseStatus {

    SUSSES("susses", 200),
    BAD_REQUEST("BadRequest",403),
    INTERNAL_ERROR("InternalError",500);

    private final String status;
    private final Integer code;

    ResponseStatus(String status, Integer code) {
        this.status = status;
        this.code = code;

    }

    public String getStatus(){
        return status;
    }
    public Integer getCode(){
        return code;
    }

}
