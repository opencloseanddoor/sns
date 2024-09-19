package com.sam.sns.post.service;

import java.util.ArrayList;
import java.util.List;

import com.sam.sns.daltagram.user.domain.User;
import com.sam.sns.daltagram.user.service.UserService;
import com.sam.sns.post.domain.Post;
import com.sam.sns.post.dto.CardView;

public class PostService 
{
	private PostService postService;
	private PostRepository postRepository;
	
	public PostService
	(
		PostRepository postRepository,
		UserService userService
	)
	{
		this.postRepository = postRepository;
		this.userService = userService;
	}

	public List<CardView> getPostList()
	{
		List<Post> postList = postRepository.findAllByOrderByIdDesc();
		
		List<CardView> cardViewList = new ArrayList<>();
		
		for(Post post:postList)
		{
			int userId = post.getUserId();
			User user = userService.getUserById(userId);
			
			CardView cardView = CardView.builder()
								.postId(post.getId())
								.userId(userId)
								.contents(post.getContents())
								.imagePath(post.getImagePath())
								.loginId(user.getLoginId())
								.build();
			
			cardViewList.add(cardView);
		}
		
		return cardViewList;
	}
}
