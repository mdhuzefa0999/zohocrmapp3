package com.myblog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myblog.payload.PostDto;
import com.myblog.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	private PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
		
		postService.createPost(postDto);
		return null;
	}
	
}
