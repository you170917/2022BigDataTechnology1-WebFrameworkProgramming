package com.example.qimo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName ("qimo")
public class Qimo {
    private long id;
    private String usernam;
    private String classname;
    private long telephone;
    private long qq;
}
