package than.myboard.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import than.myboard.domain.Article;
import than.myboard.domain.ArticleComment;
import than.myboard.dto.ArticleCommentDto;
import than.myboard.repository.ArticleCommentRepository;
import than.myboard.repository.ArticleRepository;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks
    private ArticleCommentService sut;

    @Mock
    private ArticleCommentRepository articleCommentRepository;
    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글 ID로 조회하면, 해당하는 댓글 리스트를 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticleComments_thenReturnArticleComments() {
        // given
        Long articleId = 1L;
        // TODO: modify me
        // given(articleCommentRepository.findById(articleId)).willReturn(Optional.of())

        // when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(1L);

        // then
        assertThat(articleComments).isNotNull();
        // TODO: modify me
        // then(articleCommentRepository).should().findBy(articleId);
    }
}