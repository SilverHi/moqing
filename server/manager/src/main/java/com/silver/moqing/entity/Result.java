package com.silver.moqing.entity;

import lombok.Data;

/**
 * @ClassName Result
 * @Description TODO
 * @Author silver
 * @Date 2021/3/1 下午11:27
 * @Version 1.0
 **/
@Data
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

}
