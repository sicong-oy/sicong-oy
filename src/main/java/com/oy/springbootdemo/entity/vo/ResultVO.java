package com.oy.springbootdemo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> {

    public static final String SUCEESS = "success";

    public static final String ERROR = "error";

    public static final String NO_MSG = "no_msg";

    public static final String SUCCESS_MSG = "操作成功";
    public static final String ERROR_MSG = "操作失败";


    public String status;

    public String msg;

    public T data;

    /**
     * 返回成功没有提示消息，也没有数据
     *
     * @param <T>
     * @return
     */
    public static <T> ResultVO<T> success() {
        return new ResultVO<>(SUCEESS, SUCCESS_MSG, null);
    }

    public static <T> ResultVO<T> success(T t) {
        return new  ResultVO<>(SUCEESS, SUCCESS_MSG, t);
    }

    /**
     * 返回失败
     *
     * @param msg 错误信息
     * @param <T>
     * @return
     */
    public static <T> ResultVO<T> error(String msg) {
        return new ResultVO<>(ERROR, msg, null);
    }

    public static <T> ResultVO<T> error() {
        return new ResultVO<>(ERROR, ERROR_MSG, null);
    }

    /**
     * @param t
     * @param <T> int,bollean,object
     * @return
     */
    public static <T> ResultVO<T> response(T t) {

        // 判断返回值是否是int类型
        if (t instanceof Integer) {
            Integer x = (Integer) t;
            if (x > 0) {
                return success(t);
            } else {
                return error();
            }
        } else if (t instanceof Boolean) {
            Boolean x = (Boolean) t;
            if (x) {
                return success(t);
            } else {
                return error();
            }
        } else {
            return success(t);
        }
    }

}
