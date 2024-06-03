package com.example.restfuldemo.controller;

import com.example.restfuldemo.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping
public class FileController {
    @Value("${file.upload.url}")
    private String uploadFilePath;
    /**
     * 文件上传方法
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public Result fileUpload(MultipartFile file){
        String filename = file.getOriginalFilename(); //获取文件名
        filename= UUID.randomUUID()+"_"+filename; //文件改名
        File path = new File(uploadFilePath); //指定文件的保存路径
        if (!path.exists()){
            path.mkdir();
        }
        File dest = new File(path + "/" + filename); //文件的完整路径
        try {
            file.transferTo(dest); //保存文件
            log.info("上传成功，当前上传的文件保存在 {}",uploadFilePath);
        } catch (IOException e) {
            log.error("文件上传失败!" + e.getMessage());
            return Result.error("文件上传失败!");
        }
        return Result.success("文件上传成功!");
    }
}
