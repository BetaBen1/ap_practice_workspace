package quesiton1;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {

	private static List<DownloadInfo> downloadList;
	
	public MusicDownloads(){
		downloadList = new ArrayList<DownloadInfo>();
		downloadList.add(new DownloadInfo("Hey Jude"));
		downloadList.add(new DownloadInfo("Soul Sister"));
		downloadList.add(new DownloadInfo("Aqualung"));
	}
	
	public static DownloadInfo getDownloadInfo(String title){
		for(DownloadInfo info : downloadList){
			if(info.getTitle().contains(title)){
				//System.out.println("This item is present.");
				return info;
			}
		}
		//System.out.println("This item does not exist.");
		return null;
	}
	
	public static void updateDownloads(List<String> titles){
	
		List<DownloadInfo> list = new ArrayList<DownloadInfo>();
		
		for(DownloadInfo info : downloadList){
			for(String s : titles){
				if(getDownloadInfo(s)==info){
					info.incremementTimesDownloaded();
					System.out.println("It incremented.");
				} else {
					list.add(new DownloadInfo(s));
				}
			}
		}
		
		for(DownloadInfo i : list){
			downloadList.add(i);
		}
		
		for(DownloadInfo i : downloadList){
			System.out.println(i.getTitle());
		}
		
	}
	
}
