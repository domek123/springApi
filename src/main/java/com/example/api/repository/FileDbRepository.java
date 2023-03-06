package com.example.api.repository;

import com.example.api.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDbRepository extends JpaRepository<FileDB, String> {
}
