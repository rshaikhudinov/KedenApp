package KedenApp.postgresql.repository;

import KedenApp.postgresql.entity.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationRepository  extends JpaRepository<Declaration, Long> {
}
