package cn.com.pep.model.adapter.a1;

/**
 * 
 * @Title: Mp4MediaPlayer
 * @Description: ‘¥∂‘œÛ
 * @author wwh
 * @date 2022-9-5 10:13:48
 */
public class Mp4MediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		
	}

	@Override
	public void playMp4(String filename) {
		System.err.println("Playing mp4 and filename is:" + filename);
	}
}
