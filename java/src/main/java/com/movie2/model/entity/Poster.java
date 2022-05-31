package com.movie2.model.entity;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Poster implements Serializable {
     private Integer id;
     private Integer fid;
     private String title;
     private String url;
     private Integer status;

     @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
     @JSONField(format="yyyy-MM-dd HH:mm:ss")
     private Date createTime;

     @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
     @JSONField(format="yyyy-MM-dd HH:mm:ss")
     private Date updateTime;
}