
 
import javax.annotation.Resource;
 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
import com.Project1Application.uploadfile.storage.StorageService;
 
@SpringBootApplication
public class Project1Application implements CommandLineRunner{
 
	@Resource
	StorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}
 
	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}