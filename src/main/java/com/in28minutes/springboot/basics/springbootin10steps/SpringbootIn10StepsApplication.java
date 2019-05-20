package com.in28minutes.springboot.basics.springbootin10steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@ComponentScan(basePackages="sample")
public class SpringbootIn10StepsApplication {
	
	public static final String SAMPLE_XLS_FILE_PATH1 = "C:/Users/USER/Desktop/C&M_Json_File/Gamma.json";
    public static final String SAMPLE_XLSX_FILE_PATH2 = "C:/Users/USER/Desktop/C&M_Json_File/Alpha.json";
    public static final String SAMPLE_XLSX_FILE_PATH3= "C:/Users/USER/Desktop/C&M_Json_File/Beta.json";
    public static final String SAMPLE_XLSX_FILE_PATH4 = "C:/Users/USER/Desktop/C&M_Json_File/Direct Matching Test Data.json";
    static FileInputStream fis = null;

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringbootIn10StepsApplication.class, args);
	System.out.println("hi this is manoj");
	//convertJsontoListOfObjects();
	List<AlphaModel> AlphaModel=utilClass(SAMPLE_XLSX_FILE_PATH2,AlphaModel.class);
	System.out.println(AlphaModel.size());
	List<BetaModel> BetaModel=utilClass(SAMPLE_XLSX_FILE_PATH3,BetaModel.class);
	System.out.println(AlphaModel.size());
	List<GammaModel> GammaModel=utilClass(SAMPLE_XLS_FILE_PATH1,GammaModel.class);
	System.out.println(AlphaModel.size());
	List<DirectMatchModelData> DirectMatchModelData=utilClass(SAMPLE_XLSX_FILE_PATH4,DirectMatchModelData.class);
	System.out.println(AlphaModel.size());
	//excelreading();
	}
	
	
	
//	private static void convertJsontoListOfObjects(){
//		
//		ObjectMapper mapper = new ObjectMapper();
//		File f=new File(SAMPLE_XLSX_FILE_PATH);
//        try {
//            List<AlphaModel> mstCodes = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, AlphaModel.class));
//            System.out.println(mstCodes.size());
//            for(AlphaModel p:mstCodes){
//            	System.out.println(p);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
	
	
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
//	private static  void excelreading() throws Exception {
//		List directMAtchTestData =new ArrayList();
//		List fuzzyMAtchTestData =new ArrayList();
//		List alphaTestData =new ArrayList();
//		List betaTestData =new ArrayList();
//		List gammaTestData =new ArrayList();
//		fis = new FileInputStream(SAMPLE_XLSX_FILE_PATH);
//        Workbook workbook = WorkbookFactory.create(fis);
//        int numberOfSheets = workbook.getNumberOfSheets();
//       
//       for (int i = 0; i < numberOfSheets; i++) {
//    	   Sheet sheet = (Sheet) workbook.getSheetAt(i);
//    	   System.out.println(sheet.getSheetName());
//           Iterator rowIterator = sheet.iterator();
//           while (rowIterator.hasNext()) {	
//        	   PocModel pocModel = new PocModel();
//        	   Row row = (Row) rowIterator.next();
//               Iterator cellIterator = row.cellIterator();
//               while (cellIterator.hasNext()) {
//            	Cell cell = (Cell) cellIterator.next();
//            	if (cell.getColumnIndex() == 0) {
//            		System.out.println(cell.getStringCellValue());
//            		pocModel.setLeIdentifier(cell.getStringCellValue());
//                }else if (cell.getColumnIndex() == 1) {
//                	System.out.println(cell.getStringCellValue());
//            		pocModel.setLegalOrgName(cell.getStringCellValue());
//                }else if (cell.getColumnIndex() == 3) {
//                	System.out.println(cell.getStringCellValue());
//            		pocModel.setLegalForm(cell.getStringCellValue());
//                }else if(cell.getColumnIndex() == 7){
//                	System.out.println(cell.getStringCellValue());
//                	pocModel.setTickerCode(cell.getStringCellValue());}
//                else if(cell.getColumnIndex() == 11){
//                	System.out.println(cell.getStringCellValue());
//                	pocModel.setBusinessRCode(cell.getStringCellValue());
//                }       }
//               
//               if(workbook.getSheetAt(i).getSheetName()=="Direct Matching Test Data"){
//            	   directMAtchTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Fuzzy Matching Test Data"){
//            	   fuzzyMAtchTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Alpha"){
//            	   alphaTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Beta"){
//            	   betaTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Gamma"){
//            	   gammaTestData.add(pocModel);
//               }
//
//}
//           
//}
//       System.out.println("directdata"); 
//       System.out.println(directMAtchTestData.size());
//       System.out.println(directMAtchTestData);
//       System.out.println("fuzzydata"); 
//       System.out.println(fuzzyMAtchTestData.size());
//       System.out.println(fuzzyMAtchTestData);
//       System.out.println("alphadata"); 
//       System.out.println(alphaTestData.size());
//       System.out.println(alphaTestData);
//       System.out.println("betadata"); 
//       System.out.println(betaTestData.size());
//       System.out.println(betaTestData);
//       System.out.println("gammaTestData"); 
//       System.out.println(gammaTestData.size());
//       System.out.println(gammaTestData);
//       fis.close();
//       
//	}}