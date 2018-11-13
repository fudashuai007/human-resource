package h_s.function;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import h_s.bean.Employee;
import h_s.dao.impl.UserDAOImpl;

public class Export_Word {
	public void createWord(int id) throws IOException{
		Employee employee = null;
		employee = new UserDAOImpl().search(id);
		Configuration configuration = null;
		configuration = new Configuration();
		configuration.setDefaultEncoding("UTF-8");
		Map<String,String> dataMap = new HashMap<String,String>();
		getData(dataMap,employee);
		try {
			configuration.setDirectoryForTemplateLoading(new File("C:/Users/BigBull/DeskTop"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Template t = null;
		System.out.println("6");
		t = configuration.getTemplate("fra.ftl","UTF-8");
		System.out.println("3");
		File outFile = new File("D:/"+123+".doc");
		Writer out = null;
		try{
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8"));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			t.process(dataMap, out);
			System.out.println("4");
			out.close();
		}catch(TemplateException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	private void getData(Map<String,String> dataMap,Employee employee){
		dataMap.put("name", employee.getEmployeeName());
		dataMap.put("age", employee.getAge()+"");
		System.out.println("1");
		dataMap.put("birthday",employee.getBirthday());
		System.out.println("2");
		dataMap.put("age", employee.getAge()+"");
		dataMap.put("xueli",employee.getEducation());
		dataMap.put("major", employee.getMajor());
		dataMap.put("address", employee.getApartment());
		dataMap.put("email", employee.getEmail());
		dataMap.put("phone", employee.getPhone());
		dataMap.put("sex", employee.getSex());
		/*dataMap.put("what", "java编程");
		dataMap.put("level", "高级java工程师");*/
		System.out.println("5");
	}
}
