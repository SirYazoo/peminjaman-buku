package com.example.peminjaman_buku.repository;

import com.example.peminjaman_buku.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
