package com.myblog.myblog11.service.impl;

import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.exception.ResourceNotFound;
import com.myblog.myblog11.payload.Postdto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;


@Service

public class PostServiceImpl implements PostService
{

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Postdto createPost(Postdto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);

        Postdto dto = new Postdto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());


        return dto;
    }

    @Override
    public Postdto getpostbyid(long id) {
        Post post1 = postRepository.findById(id).orElseThrow(

                () ->new ResourceNotFound("data not found"+id)


        );
        {
            Postdto dto = new Postdto();
            dto.setId(post1.getId());
            dto.setTitle(post1.getTitle());
            dto.setDescription(post1.getDescription());
            dto.setContent(post1.getContent());


            return dto;
        }
    }
}
