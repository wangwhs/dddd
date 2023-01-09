package cn.com.pep.model.adapter.a1;

/**
 * 
 * @Title: MediaPlayerAdapter
 * @Description: 对象适配器，通过聚合持有一个源对象的引用
 * @author wwh
 * @date 2022-9-5 10:19:10
 */
public class MediaPlayerAdapter implements MeidaPlayer {
	
	/**
	 * 	通过聚合的方式持有一个源对象的引用
	 */
	private AdvancedMediaPlayer player;

	public MediaPlayerAdapter(String filetype) {
		if ("mp4".equalsIgnoreCase(filetype)) {
			player = new Mp4MediaPlayer();
		} else if ("vlc".equalsIgnoreCase(filetype)) {
			player = new VLCMediaPlayer();
		}
	}

	@Override
	public void play(String audioType, String filename) {
		System.err.println("执行了适配器中的play()方法");
		if ("mp4".equalsIgnoreCase(audioType)) {
			player.playMp4(filename);
		} else if ("vlc".equalsIgnoreCase(audioType)) {
			player.playVlc(filename);
		}
	}

}
