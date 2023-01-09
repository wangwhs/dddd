package cn.com.pep.excel;

import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Student {
	public Date getS_create_time() {
		return s_create_time;
	}

	public void setS_create_time(Date s_create_time) {
		this.s_create_time = s_create_time;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@ExcelProperty({ "用户导出列表", "学号" })
	@ColumnWidth(6) // 列宽
	private int studentId;
	@ExcelProperty({ "用户导出列表", "姓名" })
	@ColumnWidth(8)
	private String studentName;
	@ExcelProperty({ "用户导出列表", "电话" })
	@ColumnWidth(8)
	private String phone;
	
	@ExcelProperty({ "用户导出列表","创建时间"})
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@DateTimeFormat("yyyy-MM-dd")
	@ColumnWidth(30)
	private Date s_create_time;
}
