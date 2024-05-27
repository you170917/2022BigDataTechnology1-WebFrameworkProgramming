@RestController
@Slf4j
@RequestMapping("file")
public class FileController {
    @Value("${file.upload.url}")
    private String uploadFilePath;
      @param file
      @return
    @PostMapping("/upload")
    public Result fileUpload(MultipartFile file){
        String filename = file.getOriginalFilename();
        filename= UUID.randomUUID()+"_"+filename;
        File path = new File(uploadFilePath);
        if (!path.exists()){
            path.mkdir();
        }
        File dest = new File(path + "/" + filename);
        try {
            file.transferTo(dest);
            log.info("上传成功，当前上传的文件保存在 {}",uploadFilePath);
        } catch (IOException e) {
            log.error("文件上传失败!" + e.getMessage());
            return Result.error("文件上传失败!");
        }
        return Result.success("文件上传成功!");
    }
}

      @param response
      @param fileName
      @return
    @GetMapping("/download")
    public Result fileDownLoad(HttpServletResponse response, @RequestParam("fileName") String fileName){
        File file = new File(uploadFilePath +'/'+ fileName);
        if(!file.exists()){
            return Result.error("下载文件不存在!");
        }
        response.reset();
        response.setContentType("application/x-download");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName );

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
            byte[] buff = new byte[1024];
            OutputStream os  = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
}
https://blog.csdn.net/Ying_ph/article/details/133199468
<a href="http://localhost:8081/file/download?fileName=1.jpg">下载文件示例</a>

