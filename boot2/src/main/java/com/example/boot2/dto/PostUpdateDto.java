package com.example.boot2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Slf4j
@Data // @Getter + @Setter + @ToString + ...
public class PostUpdateDto {

	private String title;
	private String content;
}
