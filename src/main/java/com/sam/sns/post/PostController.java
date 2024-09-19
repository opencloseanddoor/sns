package com.sam.sns.post;

public class PostController 
{

	@GetMapping("/timeline-view")
	public String timeline(Model model)
	{
		List<CardView> cardViewList = postService.getPostService();
	}
}