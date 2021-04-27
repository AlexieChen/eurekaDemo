package com.kepler.micro.api;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //private String dbSource;
}
