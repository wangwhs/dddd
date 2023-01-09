package cn.com.pep.model.flyweight;
/**
 * 
 * @Title: ZBox  
 * @Description:   具体享元角色，为每一个享元类提供唯一的实例
 * @author wwh 
 * @date 2022-9-13 14:25:52
 */
public class ZBox extends AbstaractBox{

	@Override
	public String getShape() {
		return "ZBox";
	}

}
