package com.watches.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileUploadController {
	 private String saveDirectory = System.getProperty("catalina.home");
     
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String displayForm() {
        return "fileupload";
    }
     
    @RequestMapping(value = "/upload1", method = RequestMethod.POST)
    public String save(@RequestParam("file") MultipartFile file,@RequestParam("name")String name) {
         
        /*List<MultipartFile> files = uploadForm.getFiles();
 
        List<String> fileNames = new ArrayList<String>();
         
        if(null != files && files.size() > 0) {
            for (MultipartFile multipartFile : files) {
 
                String fileName = multipartFile.getOriginalFilename();
                fileNames.add(fileName);
                //Handle file content - multipartFile.getInputStream()
 
            }
        }
         
        map.addAttribute("files", fileNames);*/
    	if(!file.isEmpty()){
    		try{
    			byte[] bytes = file.getBytes();
    			String rootPath = System.getProperty("catalina.home");
    			File dir = new File(rootPath+File.pathSeparator+"resources");
    			if(!dir.exists())
    				dir.mkdirs();
    			File serverFile = new File(dir.getAbsolutePath()+File.separator+name);
    			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
    			stream.write(bytes);
    			stream.close();
    			System.out.println("Successfully Uploaded!!!" +rootPath +""+name);
    			
    		}
    		catch(Exception e){
    			System.out.println("You failed to upload" +name +" " +e.getMessage());
    		}
    	}
        return "aindex";
    }
}