package com.rose.monphai;

import com.rose.kynang.KyNang;

public abstract class MonPhai {
	private String tenMonPhai;
	private String tenTruongMon;
	private KyNang kyNang;
	private String noiO;
	private String quyMo;
	private String moTa;
	
	public  String inThongTin() {
		String thongTin = "Tên môn phái: " + tenMonPhai
				 +"\n Tên Trưởng môn: "+ tenTruongMon
				 +"\n  kỹ năng"+ this.kyNang.inThongTin()
				 +"\n  nơi ở" + noiO;
		return thongTin;
		
	}
	
	public void luyenCong(String vuKhi, KyNang kynang) {

		this.kyNang = kynang;
	}
	
	public abstract void soTai(MonPhai otherMonPhai);
	
	
	public String getTenMonPhai() {
		return tenMonPhai;
	}
	public void setTenMonPhai(String tenMonPhai) {
		this.tenMonPhai = tenMonPhai;
	}
	public String getTenTruongMon() {
		return tenTruongMon;
	}
	public void setTenTruongMon(String tenTruongMon) {
		this.tenTruongMon = tenTruongMon;
	}

	public String getNoiO() {
		return noiO;
	}
	public void setNoiO(String noiO) {
		this.noiO = noiO;
	}
	public String getQuyMo() {
		return quyMo;
	}
	public void setQuyMo(String quyMo) {
		this.quyMo = quyMo;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
	
	public KyNang getKyNang() {
		return this.kyNang;
	}
	

}
