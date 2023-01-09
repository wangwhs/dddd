package cn.com.pep.excel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;

public class Snippet {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(3);
		student.setStudentName("xushumin");
		student.setPhone("123");
		student.setS_create_time(new Date());
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student);
		ExcelWriterBuilder write = EasyExcel.write("D://xsmEasyExcelTest.xlsx", Student.class);
		write.sheet("”√ªß±Ì").doWrite(list);
	}

}
