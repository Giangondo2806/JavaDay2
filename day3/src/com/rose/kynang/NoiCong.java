package com.rose.kynang;

public class NoiCong extends KyNang {
	
	
	@Override
	public String inThongTin() {
		String fromParent = super.inThongTin();
		return "Kỹ　năng nội công " + fromParent;
	}
	
	public String vanCong() {
		
		return "vận công";
	}

}
