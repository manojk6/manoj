package sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.in28minutes.springboot.basics.springbootin10steps.AlphaModel;
import com.in28minutes.springboot.basics.springbootin10steps.BetaModel;
import com.in28minutes.springboot.basics.springbootin10steps.Book;
import com.in28minutes.springboot.basics.springbootin10steps.DirectMatchModelData;
import com.in28minutes.springboot.basics.springbootin10steps.GammaModel;
import com.jayway.jsonpath.internal.Path;

@RestController
public class HeroController {
	
	private String UPLOADED_FOLDER = "F://springboot//SpringBootForBeginners-master//SpringBootForBeginners-master"
			+ "//01.Spring-Boot-Introduction-In-10-Steps//src//main//resources//temp//Alpha.json";

	@GetMapping("/heros")
	public List<AlphaModel> getAllBooks() {
		AlphaModel alphaModel=new AlphaModel();
		List<AlphaModel> l1=utilClass(UPLOADED_FOLDER,AlphaModel.class);
		for(AlphaModel alphaModel1:l1 ){
			System.out.println(alphaModel1);
		}
		return l1;
	}
	
	@PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam() MultipartFile file) throws IOException {
		String UPLOADED_FOLDER = "F://springboot//SpringBootForBeginners-master//SpringBootForBeginners-master"
				+ "//01.Spring-Boot-Introduction-In-10-Steps//src//main//resources//temp//";
		 byte[] bytes = file.getBytes();
         java.nio.file.Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
         Files.write(path, bytes);
         
         
			
        return "manoj";
	

}
	
	private static List utilClass(String s,Class classType){
		ObjectMapper mapper = new ObjectMapper();
		File f=new File(s);
        try {
			if (classType == AlphaModel.class){
				List<AlphaModel> mstCodes = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
	            return mstCodes;
			}else if(classType == BetaModel.class){
				List<BetaModel> mstCodes = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
	            return mstCodes;
			}else if(classType == GammaModel.class){
				List<GammaModel> mstCodes = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
	            return mstCodes;
			}else {
				List<DirectMatchModelData> mstCodes = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
	            return mstCodes;
			}
			
            } catch (IOException e) {
            e.printStackTrace();
        }
		return null;
		
		
	}
	
}
