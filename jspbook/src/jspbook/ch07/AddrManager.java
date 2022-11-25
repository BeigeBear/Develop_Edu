package jspbook.ch07;

import java.util.ArrayList;

public class AddrManager {
	ArrayList<AddrBean> addrlist = new ArrayList<AddrBean>();
	
	public void add(AddrBean addrbean) {
		addrlist.add(addrbean);
	}

	public ArrayList<AddrBean> getAddrlist() {
		return addrlist;
	}
}
