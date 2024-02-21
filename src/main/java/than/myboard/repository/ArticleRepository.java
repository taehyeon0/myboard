package than.myboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import than.myboard.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
