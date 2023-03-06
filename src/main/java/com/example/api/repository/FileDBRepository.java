package com.example.api.repository;

import com.example.api.model.FileDB;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FileDBRepository implements JpaRepository<FileDB, String> {
    @Override
    public List<FileDB> findAll() {
        return null;
    }
    @Override
    public List<FileDB> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<FileDB> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<FileDB> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(FileDB entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends FileDB> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends FileDB> S save(S entity) {
        return null;
    }

    @Override
    public <S extends FileDB> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<FileDB> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends FileDB> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends FileDB> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<FileDB> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public FileDB getOne(String s) {
        return null;
    }

    @Override
    public FileDB getById(String s) {
        return null;
    }

    @Override
    public FileDB getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends FileDB> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends FileDB> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends FileDB> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends FileDB> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends FileDB> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends FileDB> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends FileDB, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
