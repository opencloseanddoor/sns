package com.sam.sns.post.dto;


@Builder
@Getter
public class CardView 
{
	private int postId;
	private int userId;
	
	private String contents;
	private String imagePath;
	
	private String loginId;
	
	
}
