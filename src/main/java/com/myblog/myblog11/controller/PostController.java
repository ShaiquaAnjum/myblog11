package com.myblog.myblog11.controller;

import com.myblog.myblog11.payload.Postdto;
import com.myblog.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    public PostController(PostService postService) {
        this.postService = postService;
    }

    private PostService postService;
    @PostMapping
    public ResponseEntity<Postdto> createPost(@RequestBody Postdto postDto) {
        Postdto dto = postService.createPost(postDto);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);



    }

    @GetMapping
    public ResponseEntity<Postdto> getpostbyid (@RequestParam long id){
        Postdto postdto = postService.getpostbyid(id);
        return new ResponseEntity<>(postdto,
                HttpStatus.OK);


    }



}
