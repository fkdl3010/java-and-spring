package me.gil.junitstudy.study;

import me.gil.junitstudy.domain.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {

}
