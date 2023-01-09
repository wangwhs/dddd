package cn.com.pep.model.adapter.a1;
/**
 * 
 * @Title: AdvancedMediaPlayer  
 * @Description:  源对象的接口
 * @author wwh 
 * @date 2022-9-5 10:10:14
 */
public interface AdvancedMediaPlayer {

	/**
	 * @Title: playVlc 
	 * @Description:  
	 * @param filename
	 */
	public void playVlc(String filename);
	
	/**
	 * @Title: playMp4 
	 * @Description:  
	 * @param filename
	 */
	public void playMp4(String filename);
}
