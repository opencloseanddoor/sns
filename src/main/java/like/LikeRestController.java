package like;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import like.domain.Like;
import like.service.LikeService;

@RestController
public class LikeRestController 
{
	private LikeService likeService;
	
	public LikeRestController(LikeService likeService)
	{
		this.likeService = likeService;
	}
	
	@PostMapping("/post/like")
	public Map<String, String> like
	(
		@RequestParam("postId") int postId,
		HttpSession session
	)
	{
		int userId = (Integer)session.getAttribute("userId");
		
		Like like = likeService.addLike(postId, userId);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(like != null)
		{
			resultMap.put("result", "success");
		}
		else 
		{
			resultMap.put("result", "fail");
		}
		return resultMap;
	}
	
	
}
