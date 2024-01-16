package com.myblog.myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorMessage {
   private String message;
     private Date date;
     private String url;
}
