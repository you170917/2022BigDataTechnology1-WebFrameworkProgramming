package homework.homework11;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("file")
public class FileInterFace {
    private String uploadFilePath;
    @PostMapping("/upload")
    public Result file_upload(MultipartFile file) {
        String filename = file.getOriginalFilename();
        filename = UUID.randomUUID() + "_" + filename;
        File path = new File(uploadFilePath);
        if (!path.exists()) {
            path.mkdir();
        }
        File dest = new File(path + "/" + filename);
        try {
            file.transferTo(dest);
            log.info("上传成功，当前上传的文件保存在 {}", uploadFilePath);
            return Result.success("文件上传成功!");
        } catch (IOException e) {
            log.error("文件上传失败!" + e.getMessage());
            return Result.error("文件上传失败!");
        }
    }

    @GetMapping("/download")
    public void file_download(HttpServletResponse response,
                              @RequestParam("fileName") String fileName) throws IOException {
        File file = new File(uploadFilePath + '/' + fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("下载文件不存在!");
        }
        response.reset();
        response.setContentType("application/x-download");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            byte[] buff = new byte[1024];
            OutputStream os = response.getOutputStream();
            int i;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
            }
            os.flush();
        } catch (Exception e) {
            log.error("文件下载失败!{}", e.getMessage());
            throw new IOException("文件下载失败!");
        }
    }
}