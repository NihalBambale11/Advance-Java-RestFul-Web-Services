 package job.post.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class JobPostDTOS {
	private String message;
	private LocalDateTime time;
	
	public JobPostDTOS(String message, LocalDateTime time) {
		super();
		this.message = message;
		this.time = time;
	}
	
	

}
