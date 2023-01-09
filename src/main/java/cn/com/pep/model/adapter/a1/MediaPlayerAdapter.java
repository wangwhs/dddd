package cn.com.pep.model.adapter.a1;

/**
 * 
 * @Title: MediaPlayerAdapter
 * @Description: ������������ͨ���ۺϳ���һ��Դ���������
 * @author wwh
 * @date 2022-9-5 10:19:10
 */
public class MediaPlayerAdapter implements MeidaPlayer {
	
	/**
	 * 	ͨ���ۺϵķ�ʽ����һ��Դ���������
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
		System.err.println("ִ�����������е�play()����");
		if ("mp4".equalsIgnoreCase(audioType)) {
			player.playMp4(filename);
		} else if ("vlc".equalsIgnoreCase(audioType)) {
			player.playVlc(filename);
		}
	}

}
