package com.quan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: User
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/8 16:37
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int age;
    private String gender;

}
