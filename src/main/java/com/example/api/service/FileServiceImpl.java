package com.example.api.service;

import com.example.api.model.FileDB;
import com.example.api.repository.FileDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileDbRepository fileDBRepository;

    @Override
    public void saveFile(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        FileDB fileDB = new FileDB(
                fileName,
                file.getContentType(),
                System.currentTimeMillis(),
                file.getBytes()
        );
        fileDBRepository.save(fileDB);
    }

    @Override
    public FileDB getFile(String id) {
        return fileDBRepository.getReferenceById(id);
    }

    @Override
    public List<FileDB> getAllFiles() {
        return null;
    }

    @Override
    public void deleteOne(String id) {
        fileDBRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        fileDBRepository.deleteAll();
    }

    @Override
    public Optional<FileDB> findById(String id) {
        return Optional.empty();
    }

    @Override
    public void updateFileData(FileDB fileDB) {

    }
}
