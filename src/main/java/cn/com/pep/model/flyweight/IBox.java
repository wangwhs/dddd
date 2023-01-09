package cn.com.pep.model.flyweight;
/**
 * 
 * @Title: IBox  
 * @Description:  具体享元角色，为每一个享元类提供唯一的实例
 * @author wwh 
 * @date 2022-9-13 14:23:28
 */
public class IBox extends AbstaractBox{

	@Override
	public String getShape() {
		return "IBox";
	}

}
