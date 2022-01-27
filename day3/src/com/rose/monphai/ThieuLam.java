package com.rose.monphai;

public class ThieuLam extends MonPhai {

	@Override
	public void soTai(MonPhai otherMonPhai) {
		int check = this.getKyNang().getSatThuong()-otherMonPhai.getKyNang().getSatThuong();
		if(check >0) {
			System.out.println(thongTinSoTai("win", otherMonPhai));
		}
		else if( check==0) {
			System.out.println(thongTinSoTai("draw", otherMonPhai) );
		}
		else {
			System.out.println(thongTinSoTai("lose", otherMonPhai) );
		}
		// TODO Auto-generated method stub
//		return null;
		
		
		
	}
	
	public  String tungKinh() {
		return "Tung kinh";
	}
	
	private String thongTinSoTai(String ketqua, MonPhai otherMonPhai) {
		return  this.getTenMonPhai() + ketqua + otherMonPhai.getTenMonPhai();
		
	}





}