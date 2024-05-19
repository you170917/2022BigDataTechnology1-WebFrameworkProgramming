import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.restful.mapper")
@SpringBootApplication
public class ResTfulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResTfulApplication.class, args);
    }
}
