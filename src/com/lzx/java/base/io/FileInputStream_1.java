package com.lzx.java.base.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * fileinputstream 在使用完以后，不关闭流，想二次使用可以怎么操作
 * @author liuzhixiong
 * 2018年04月20日15:33:39
 */

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		String content = "BoyceZhang!";  
		InputStream inputStream = new ByteArrayInputStream(content.getBytes());  
		   
		// 判断该输入流是否支持mark操作  
		if (!inputStream.markSupported()) {  
		    System.out.println("mark/reset not supported!");  
		}  
		int ch;    
		boolean marked = false;    
		while ((ch = inputStream.read()) != -1) {  
		       
		    //读取一个字符输出一个字符    
		    System.out.print((char)ch);    
		    //读到 'e'的时候标记一下  
		     if (((char)ch == 'e')& !marked) {    
		        inputStream.mark(content.length());  //先不要理会mark的参数  
		         marked = true;    
		     }    
		                   
		     //读到'!'的时候重新回到标记位置开始读  
		      if ((char)ch == '!' && marked) {    
		          inputStream.reset();    
		          marked = false;  
		      }    
		}  
	}
}
