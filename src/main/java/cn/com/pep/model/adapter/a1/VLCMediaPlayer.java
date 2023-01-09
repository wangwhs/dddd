package cn.com.pep.model.adapter.a1;

/**
 * 
 * @Title: VLCMediaPlayer
 * @Description: ‘¥∂‘œÛ
 * @author wwh
 * @date 2022-9-5 10:12:07
 */
public class VLCMediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		System.err.println("Playing vlc and filename is:" + filename);
	}

	@Override
	public void playMp4(String filename) {
		
	}

}
