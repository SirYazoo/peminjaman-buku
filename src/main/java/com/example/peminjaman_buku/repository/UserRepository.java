package com.example.peminjaman_buku.repository;

import com.example.peminjaman_buku.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
