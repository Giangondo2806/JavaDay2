package com.rose.kynang;

public  class KyNang{
	
	
	private String tenKyNang;
	private int satThuong;
	private String thuocTinh;
	private String moTa;
	
	public KyNang() {
		this.tenKyNang = "hello";
	}
	
public KyNang(String tenKyNang) {
	this.tenKyNang = tenKyNang;
		
	}


	
	public KyNang(String tenKyNang, int satThuong, String thuocTinh, String moTa) {
		super();
		this.tenKyNang = tenKyNang;
		this.satThuong = satThuong;
		this.thuocTinh = thuocTinh;
		this.moTa = moTa;
	}
	
	public String inThongTin() {
		String thongTin =  "Kỹ năng: "+ this.tenKyNang
				+ "\nsát Thương: "+ this.satThuong
				+ "\nThuộc tính: "+ this.thuocTinh
				+"\nMô tả: "+this.moTa;
		return thongTin;
		
	}
	

	public String getTenKyNang() {
		return tenKyNang;
	}
	public void setTenKyNang(String tenKyNang) {
		this.tenKyNang = tenKyNang;
	}
	public int getSatThuong() {
		return satThuong;
	}
	public void setSatThuong(int satThuong) {
		this.satThuong = satThuong;
	}
	public String getThuocTinh() {
		return thuocTinh;
	}
	public void setThuocTinh(String thuocTinh) {
		this.thuocTinh = thuocTinh;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}
