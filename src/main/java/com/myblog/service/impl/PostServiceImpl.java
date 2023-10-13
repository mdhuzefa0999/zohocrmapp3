package com.myblog.service.impl;

import org.springframework.stereotype.Service;

import com.myblog.entity.Post;
import com.myblog.payload.PostDto;
import com.myblog.repository.PostRepository;
import com.myblog.service.PostService;

@Service
public class PostServiceImpl implements PostService{
	
	private PostRepository postRepository;

	public PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public PostDto createPost(PostDto postDto) {
     Post post = new Post();
		return null;
	}


	
	}
