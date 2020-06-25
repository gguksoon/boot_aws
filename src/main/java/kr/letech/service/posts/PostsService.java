package kr.letech.service.posts;

import kr.letech.domain.posts.PostsRepository;
import kr.letech.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

// @RequiredArgsConstructor를 사용하면 final이 붙은 필드의 Bean을 등록해줌(@Autowired 필요X)
@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
