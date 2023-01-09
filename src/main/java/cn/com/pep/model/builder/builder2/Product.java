package cn.com.pep.model.builder.builder2;

/**
 * 
 * @Title: Product  
 * @Description:  
 * @author wwh 
 * @date 2022-9-1 9:50:03
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * @Title: Product  
 * @Description:  产品类
 * @author wwh 
 * @date 2022-9-1 9:55:50
 */
public class Product {

	List<String> parts = new ArrayList<>();

	/**
	 * 
	 * @Title: addPart
	 * @Description: 添加产品部件
	 * @param part
	 */
	public void addPart(String part) {
		parts.add(part);
	}

	/**
	 * 
	 * @Title: show
	 * @Description:显示产品细节
	 */
	public void show() {
		Iterator<String> it = parts.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.err.println(string);
		}
	}

}
