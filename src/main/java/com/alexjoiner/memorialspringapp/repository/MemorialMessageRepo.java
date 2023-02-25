package com.alexjoiner.memorialspringapp.repository;

import com.alexjoiner.memorialspringapp.domain.MemorialMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemorialMessageRepo extends JpaRepository<MemorialMessage,Long> {
}
