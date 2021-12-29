package com.apodaca.blog.payload;

import lombok.Data;

@Data
public class CommentDto {


    private long id;
    // name should not be null or empty


    private String name;

    // email should not be null or empty
    // email field validation


    private String email;

    // comment body should not be bull or empty
    // Comment body must be minimum 10 characters

    private String body;
}
