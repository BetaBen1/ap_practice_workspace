package quesiton1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Lights");
		list.add("Aqualung");
		list.add("Soul Sister");
		list.add("Go Now");
		list.add("Lights");
		list.add("Soul Sister");
		
		new MusicDownloads();
//		MusicDownloads.getDownloadInfo("Happy Birthday");
		MusicDownloads.updateDownloads(list);
		
	}

}
