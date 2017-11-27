package Design;

import java.util.ArrayList;

public class OVideoSite implements OSubject {
	private ArrayList<OObserver> userList;
	private ArrayList<String> videos;
	
	public OVideoSite() {
		userList=new ArrayList<OObserver>();
		videos=new ArrayList<String>();
	}

	@Override
	public void registerObserver(OObserver o) {
		// TODO Auto-generated method stub
		userList.add(o);
	}

	@Override
	public void removeObserver(OObserver o) {
		// TODO Auto-generated method stub
		userList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(OObserver o:userList){
			o.update(this);
		}
	}
	public void addVideos(String video){
		this.videos.add(video);
		System.out.println("addVideos");
		notifyAllObservers();
	}

	public ArrayList<String> getVideos() {
		return videos;
	}

	public String toString(){
		return videos.toString();
	}
	

}
