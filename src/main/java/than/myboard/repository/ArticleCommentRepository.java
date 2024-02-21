package than.myboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import than.myboard.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
