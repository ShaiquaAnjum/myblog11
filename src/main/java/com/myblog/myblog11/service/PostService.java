package com.myblog.myblog11.service;

import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.payload.Postdto;

public interface PostService {
    Postdto createPost(Postdto postDto);

    Postdto getpostbyid(long id);
}
