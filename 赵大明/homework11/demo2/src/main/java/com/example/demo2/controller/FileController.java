package com.example.demo2.controller;

import com.example.demo2.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("/file")
public class FileController {
    @Value("${file.upload.path}")
    private String uploadFilePath;
    @PostMapping("/upload")
    public Result fileUpload(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        fileName = UUID.randomUUID() + "_" + fileName;
        File path = new File(uploadFilePath);
        if (!path.exists()) {
            path.mkdirs();
        }
        File dest = new File(path + "/" + fileName);
        try {
            file.transferTo(dest);
            log.info("上传成功，当前上传的文件保存在 {}", uploadFilePath);
        } catch (Exception e) {
            log.error("上传失败", e.getMessage());
            return Result.error("上传失败");
        }

        return Result.success("上传成功");
    }

    @GetMapping("/download")
    public Result fileDownLoad(HttpServletResponse response,
                               @RequestParam("fileName") String fileName){
        File file = new File(uploadFilePath +'/'+ fileName);
        if(!file.exists()){
            return Result.error("下载文件不存在!");
        }
        response.reset();
        response.setContentType("application/x-download");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" +
                fileName );
        try(BufferedInputStream bis = new BufferedInputStream(new
                FileInputStream(file));) {
            byte[] buff = new byte[1024];
            OutputStream os = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
// return Result.success("文件下载成功!");
        return null;
    }
}
