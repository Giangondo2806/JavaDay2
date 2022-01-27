package com.rose.kynang;

public class NgoaiCong extends KyNang {

	@Override
	public String inThongTin() {
		String fromParent = super.inThongTin();
		return "Kỹ　năng ngoại công " + fromParent;

	}

	public String danhLienHoan() {
		return "danh lien hoan";
	}

	
}
