package KedenApp.postgresql.repository;

import KedenApp.postgresql.entity.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository   extends JpaRepository<Recipient, String> {
}
