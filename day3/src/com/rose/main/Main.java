package com.rose.main;

import com.rose.kynang.KyNang;
import com.rose.kynang.NgoaiCong;
import com.rose.kynang.NoiCong;
import com.rose.monphai.CaiBang;
import com.rose.monphai.MonPhai;
import com.rose.monphai.ThieuLam;
import com.rose.monphai.VoDang;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
	    main.init();
	}
	
	
	private void init() {
		KyNang muaConThieuLam = new NoiCong();
		muaConThieuLam.setMoTa("Kỹ năng này dùng côn để đánh vào điểm yếu đối thủ");
		muaConThieuLam.setSatThuong(100);
		muaConThieuLam.setThuocTinh("dùng gậy");
		muaConThieuLam.setTenKyNang("múa côn thiếu lâm");
	
		
		KyNang daCauBongPhap = new NoiCong();
		daCauBongPhap.setMoTa("Dùng gậy đánh chó gây sát thương và choáng đối thủ");
		daCauBongPhap.setSatThuong(99);
		daCauBongPhap.setThuocTinh("dùng sức");
		daCauBongPhap.setTenKyNang("đả cẩu bổng pháp");
		
		KyNang kyNangVoDang = new NgoaiCong();
//		userName = "36273'''3235";
//		checkValidate = alidateUserName (userName);
//		if(checkValidate === true)
//			user.setUserName = .daCauBongPhap..
		kyNangVoDang.setMoTa("vận chưởng pháp từ xa gây sát thương diện rộng");
		kyNangVoDang.setSatThuong(50);
		kyNangVoDang.setThuocTinh("dùng tay");
		kyNangVoDang.setTenKyNang("Thái Cực quyền");
		
		
		MonPhai thieulam = new ThieuLam();
		thieulam.setMoTa("gôm các nhà sư");
		thieulam.setNoiO("Thiếu lâm tự");
		thieulam.setTenMonPhai("Nam Thiếu Lâm");
		thieulam.setTenTruongMon("Thầy Ông Nội");
		thieulam.luyenCong("gậy", muaConThieuLam);
		
		
		MonPhai voDang = new VoDang();
		voDang.setMoTa("gồm các đạo sĩ");
		voDang.setNoiO("núi võ đang");
		voDang.setTenMonPhai("Võ đang");
		voDang.setTenTruongMon("Trương Quân Bảo");
		voDang.luyenCong("gậy", kyNangVoDang);
		
		
		MonPhai caiBang = new CaiBang();
		caiBang.setMoTa("gồm các ăn mày hành tẩu giang hồ");
		caiBang.setNoiO("không rõ ràng");
		caiBang.setTenMonPhai("Cái Bang");
		caiBang.setTenTruongMon("Tiêu Phong");
		caiBang.luyenCong("gậy",daCauBongPhap);
//    	System.out.println(daCauBongPhap.inThongTin());
		
		caiBang.soTai(thieulam);
		thieulam.soTai(voDang);
//		System.out.println(voDang instanceof MonPhai);
//     	System.out.println(thieulam.inThongTin());
	}

}
