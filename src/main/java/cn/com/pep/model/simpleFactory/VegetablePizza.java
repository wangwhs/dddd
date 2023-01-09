package cn.com.pep.model.simpleFactory;

/**
 * @Title: VegetablePizza
 * @Description: �����Ʒ��ɫ
 * @author wwh
 * @date 2022-8-22 14:22:42
 */
public class VegetablePizza extends Pizza {

	@Override
	public void prepare() {
		System.err.println("prepare VegetablePizza ...");
	}

	@Override
	public void bake() {
		System.err.println("bake VegetablePizza ...");

	}

	@Override
	public void cut() {
		System.err.println("cut VegetablePizza ...");
	}

	@Override
	public void box() {
		System.err.println("box VegetablePizza ...");
	}
}
