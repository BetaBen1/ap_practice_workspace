package quesiton1;

public class DownloadInfo {

	private String title;
	private int downloadCount=1;
	
	public DownloadInfo(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void incremementTimesDownloaded(){
		downloadCount+=1;
	}
	
}
