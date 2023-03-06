package com.example.api.controller;

import com.example.api.message.ResponseFile;
import com.example.api.message.ResponseMessage;
import com.example.api.model.FileDB;
import com.example.api.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @PostMapping(path = "/api/files", consumes="multipart/form-data")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        fileService.saveFile(file);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body(new ResponseMessage("dodano plik"));

    }
    @GetMapping("/api/files")
    private ResponseEntity<List<ResponseFile>> listFiles() {

        List<ResponseFile> list;
        list = Collections.singletonList((ResponseFile) fileService.getAllFiles());
        // użyj metody fileService.getAllFiles()
        // utwórz listę typu List<ResponseFile>
        // zwróć ją do klienta jak poniżej

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(list);
    }
    @GetMapping("/api/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {


        try{
            FileDB fileDB = fileService.getFile(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(fileDB.getData());
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(null);
        }
    }
}
