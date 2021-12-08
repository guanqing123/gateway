package com.itmuch.gateway.config;

import lombok.Data;

import java.time.LocalTime;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/12/8 20:52
 **/
@Data
public class TimeBetweenConfig {
    private LocalTime start;
    private LocalTime end;
}
