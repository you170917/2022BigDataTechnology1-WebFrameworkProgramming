package com.example.homework05.controller;

import com.example.homework05.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("file")
public class FileController {
    @Value("C:\\Users\\刘何静\\Pictures\\Screenshots")
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
    /**
     * 下载文件的方法
     * @param response
     * @param fileName
     * @return
     */
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
