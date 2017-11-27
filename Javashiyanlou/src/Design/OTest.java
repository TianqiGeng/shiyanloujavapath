package Design;

public class OTest {
	public static void main(String[] args){
		OVideoSite vs=new OVideoSite();
		vs.registerObserver(new OVideoFans("LiLei"));
		vs.registerObserver(new OVideoFans("HanMeimei"));
		vs.addVideos("Video 1");
	}
}
