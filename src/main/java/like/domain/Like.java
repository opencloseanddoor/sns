package like.domain;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="like")
@Entity
public class Like 
{
	@Id
	@GeneratedValue(strategy=GenetationType.INDENTITY)
	private int id;
	
	@Column("postId")
	private int postId;
	private int userId;
	private LocalDateTime createdAt;
}
