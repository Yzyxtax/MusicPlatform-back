package com.example.musicplatform.ResponseMessage;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseMessage success(T data){
        return new ResponseMessage(HttpStatus.OK.value(),"success",data);
    }
}
