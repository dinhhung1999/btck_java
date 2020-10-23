package vn.devpro.btck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



 class QuanLySinhVien {
	static ArrayList<TblSinhVien> SList = new ArrayList<TblSinhVien>();
	static ArrayList<TblsMonHoc> MList = new ArrayList<TblsMonHoc>();
	static ArrayList<TblDiem> DList = new ArrayList<TblDiem>();
	static TblDiem bDiem;
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		int chon;
		do {
			System.out.println("Chon 1 chuc nang");
			System.out.println("\t 1. Cap nhat danh sach");
			System.out.println("\t 2. Hien thi bang diem");
			System.out.println("\t 3. Tim kiem");
			System.out.println("\t 0. Thoat");
			System.out.println("Lua chon cua ban la : ");
			chon = in.nextInt();
			switch(chon) {
			case 1: CapNhatDanhSach(); break;
			case 2: HienThiBangDiem(); break;
			case 3: TimKiem(); break;
			case 0: System.out.println("Thoat");return;

			default: System.out.println("Ban nhap khong hop le");
			}
		}while(true);
		}

	private static void CapNhatDanhSach() {
		System.out.println("------Cap nhat danh sach-------");
		int chon;
		do {
			System.out.println("Chon 1 chuc nang ");
			System.out.println("\t 1. Cap nhap danh sach sinh vien ");
			System.out.println("\t 2. Cap nhat danh sach mon hoc");
			System.out.println("\t 3. Cap nhat bang diem");
			System.out.println("\t 0. Quay lai");
			chon = in.nextInt();
			switch(chon) {
			case 1: CapNhatDanhSachSinhVien(); break;
			case 2: CapNhatDanhSachMonHoc(); break;
			case 3: CapNhatBangDiem() ; break;
			case 0: System.out.println("Quay lai"); return;
			default: System.out.println("Ban nhap khong hop le");
			}
		}while(true);
		
	}
	private static void CapNhatDanhSachSinhVien() {
		System.out.println("------Cap nhat danh sach sinh vien-------");
		int chon;
		do {
			System.out.println("Chon 1 chuc nang ");
			System.out.println("\t 1. Them sinh vien ");
			System.out.println("\t 2. Sua thong tin sinh vien");
			System.out.println("\t 3. Xoa sinh vien");
			System.out.println("\t 4. Hien thi danh sach sinh vien ");
			System.out.println("\t 0. Quay lai");
			chon = in.nextInt();
			switch(chon) {
			case 1: ThemSinhVien(); break;
			case 2: SuaThongTinSinhVien(); break;
			case 3: XoaSinhVien(); break;
			case 4: HienThiDanhSachSinhVien(); break;
			case 0: System.out.println("Quay lai"); return;
			default: System.out.println("Ban nhap khong hop le");
			}
		}while(true);
		
		
	}
	private static void ThemSinhVien() {
		System.out.println("----Them sinh vien vao danh sach----");
		System.out.println("Nhap thong tin sinh vien");
		System.out.println("Nhap ma sinh vien: ");
		int maSV = in.nextInt();
		if(Helpers.KiemTraMaSVTrongDSSV(maSV)!=-1) {
			System.out.println("Sinh vien da ton tai");
			return;
		}
		System.out.println("Nhap ho dem sinh vien: ");
		in.nextLine();
		String hoDem = in.nextLine();
		if(hoDem.trim().length()==0) {
			System.out.println("Thong tin khong hop le.");
			return;
		}
		System.out.println("Nhap ten sinh vien: ");
		String ten = in .nextLine();
		if(ten.trim().length()==0) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		System.out.println("Nhap nam sinh: ");
		int namSinh = in.nextInt();
		if(namSinh < 1920 || namSinh > 2003) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		System.out.println("Nhap gioi tinh: ");
		in.nextLine();
		String gioiTinh = in.nextLine();
		if(gioiTinh.trim().length()==0) {
			System.out.println("Thong tin khong hop le.");
			return;
		}
		SList.add(new TblSinhVien(maSV,hoDem,ten,namSinh,gioiTinh));
		System.out.println("Them sinh vien thanh cong");
		System.out.println("----------------------------------");
	}
	private static void SuaThongTinSinhVien() {
		System.out.println("-----Sua thong tin sinh vien-----");
		System.out.println("Nhap ma sinh vien muon sua: ");
		int maSV = in.nextInt();
		int index = Helpers.KiemTraMaSVTrongDSSV(maSV);
		if(index==-1) {
			System.out.println("Sinh vien can sua khong ton tai.");
			return;
		}
		do {
			int chon;
			System.out.println("-------Chon thong tin can sua--------");
			System.out.println("\t 1. Sua ho dem");
			System.out.println("\t 2. Sua ten");
			System.out.println("\t 3. Sua nam sinh");
			System.out.println("\t 4. Sua gioi tinh");
			System.out.println("\t 0. Quay lai");
			System.out.println("Lua chon cua ban la: ");
			chon = in.nextInt();
			switch(chon) {
			case 1: SuaHoDem(index); break;
			case 2: SuaTen(index); break;
			case 3: SuaNamSinh(index); break;
			case 4: SuaGioiTinh(index); break;
			case 0: return;
			default: System.out.println("Ban nhap khong hop le");
			}
			}while(true);
	}
	private static void SuaHoDem(int index) {
		System.out.println("-----Sua ho dem-----");
		System.out.println("Nhap ho dem moi: ");
		in.nextLine();
		String hoDem = in.nextLine();
		if(hoDem.trim().length()==0) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		SList.get(index).setHoDem(hoDem);
		System.out.println("Sua thong tin thanh cong");
		System.out.println("--------------------------------");
	}
	private static void SuaTen(int index) {
		System.out.println("-----Sua ten-----");
		System.out.println("Nhap ten moi: ");
		in.nextLine();
		String ten = in.nextLine();
		if(ten.trim().length()==0) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		SList.get(index).setTen(ten);
		System.out.println("Sua thong tin thanh cong");
		System.out.println("--------------------------------");
		
	}
	private static void SuaNamSinh(int index) {
		System.out.println("-----Sua nam sinh-----");
		System.out.println("Nhap nam sinh moi: ");
		int namSinh = in.nextInt();
		if(namSinh < 1920 || namSinh > 2003) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		SList.get(index).setNamSinh(namSinh);
		System.out.println("Sua thong tin thanh cong");
		System.out.println("--------------------------------");
		
	}
	private static void SuaGioiTinh(int index) {
		System.out.println("-----Sua gioi tinh-----");
		System.out.println("Nhap gioi tinh moi: ");
		in.nextLine();
		String gioiTinh = in.nextLine();
		if(gioiTinh.trim().length()==0) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		SList.get(index).setGioiTinh(gioiTinh);
		System.out.println("Sua thong tin thanh cong");
		System.out.println("--------------------------------");
		
	}
	private static void XoaSinhVien() {
		System.out.println("-----Xoa sinh vien-----");
		System.out.println("Nhap ma sinh vien cua sinh vien can xoa: ");
		int maSV = in.nextInt();
		int index = Helpers.KiemTraMaSVTrongDSSV(maSV);
		if(index==-1) {
			System.out.println("Sinh vien khong ton tai");
			return;
		}
		if(Helpers.KiemTraMaSVTrongDSDiem(maSV)!=-1) {
			System.out.println("Khong the xoa sinh vien da co diem");
			return;
		}
		SList.remove(index);
		System.out.println("Xoa sinh vien thanh cong");
		System.out.println("-----------------------------------");
		
	}
	private static void HienThiDanhSachSinhVien() {
		System.out.println("-----Sap xep danh sach sinh vien theo ten------");
		Collections.sort(SList, new Comparator<TblSinhVien>() {
			@Override
			public int compare(TblSinhVien s1, TblSinhVien s2) {
				return s1.getTen().compareTo(s2.getTen());
			}
		});
		for(TblSinhVien s : SList) {
			s.HienThi();
		}
		System.out.println("----------------------------");
	}
	private static void CapNhatDanhSachMonHoc() {
		System.out.println("------Cap nhat danh sach mon hoc-------");
		int chon;
		do {
			System.out.println("Chon 1 chuc nang ");
			System.out.println("\t 1. Them mon hoc ");
			System.out.println("\t 2. Sua thong tin mon hoc");
			System.out.println("\t 3. Xoa mon hoc");
			System.out.println("\t 4. Hien thi danh sach mon hoc ");
			System.out.println("\t 0. Quay lai");
			chon = in.nextInt();
			switch(chon) {
			case 1: ThemMonHoc(); break;
			case 2: SuaThongTinMonHoc(); break;
			case 3: XoaMonHoc(); break;
			case 4: HienThiDanhSachMonHoc(); break;
			case 0: System.out.println("Quay lai"); return;
			default: System.out.println("Ban nhap khong hop le");
			}
		}while(true);
		
	}
	private static void ThemMonHoc() {
		System.out.println("----Them mon hoc vao danh sach----");
		System.out.println("Nhap thong tin mon hoc");
		System.out.println("Nhap ma mon hoc: ");
		int maMH = in.nextInt();
		if(Helpers.KiemTraMaMHTrongDSMonHoc(maMH)!=-1) {
			System.out.println("Mon hoc da ton tai");
			return;
		}
		System.out.println("Nhap ten mon hoc: ");
		in.nextLine();
		String tenMonHoc = in.nextLine();
		if(tenMonHoc.trim().length()==0) {
			System.out.println("Thong tin khong hop le.");
			return;
		}
		System.out.println("Nhap he so mon hoc: ");
		int heSoMH = in.nextInt();
		if(heSoMH < 0) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		MList.add(new TblsMonHoc(maMH,tenMonHoc,heSoMH));
		System.out.println("Them mon hoc thanh cong");
		System.out.println("----------------------------------");
	}
	private static void SuaThongTinMonHoc() {
		System.out.println("-----Sua thong tin mon hoc-----");
		System.out.println("Nhap ma mon hoc: ");
		int maMH = in.nextInt();
		int index = Helpers.KiemTraMaMHTrongDSMonHoc(maMH);
		if(index==-1) {
			System.out.println("Mon hoc can sua khong ton tai.");
			return;
		}
		do {
			int chon;
			System.out.println("-------Chon thong tin can sua--------");
			System.out.println("\t 1. Sua ten mon hoc");
			System.out.println("\t 2. Sua he so mon hoc");
			System.out.println("\t 0. Quay lai");
			System.out.println("Lua chon cua ban la: ");
			chon = in.nextInt();
			switch(chon) {
			case 1: SuaTenMH(index); break;
			case 2: SuaHeSoMH(index); break;
			case 0: return;
			default: System.out.println("Ban nhap khong hop le");
			}
			}while(true);
		
	}
	private static void SuaTenMH(int index) {
		System.out.println("----Sua ten mon hoc----");
		System.out.println("Nhap ten moi cua mon hoc: ");
		in.nextLine();
		String tenMonHoc = in.nextLine();
		if(tenMonHoc.trim().length()==0) {
			System.out.println("Thong tin khong hop le.");
			return;
		}
		MList.get(index).setTenMonHoc(tenMonHoc);
		System.out.println("Sua thong tin thanh cong");
		System.out.println("-----------------------------");
	}
	private static void SuaHeSoMH(int index) {
		System.out.println("-----Sua he so mon hoc-----");
		System.out.println("Nhap he so moi cua mon hoc: ");
		int heSoMH = in.nextInt();
		if(heSoMH < 0) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		MList.get(index).setHeSoMH(heSoMH);
		System.out.println("Sua thong tin thanh cong");
		System.out.println("-----------------------------");
	}
	private static void XoaMonHoc() {
		System.out.println("-----Xoa mon hoc-----");
		System.out.println("Nhap ma mon hoc cua mon hoc can xoa: ");
		int maMH = in.nextInt();
		int index = Helpers.KiemTraMaMHTrongDSMonHoc(maMH);
		if(index==-1) {
			System.out.println("Mon hoc khong ton tai");
			return;
		}
		if(Helpers.KiemTraMaMHTrongDSDiem(maMH)!=-1) {
			System.out.println("Khong the xoa mon hoc da co sinh vien hoc");
			return;
		}
		MList.remove(index);
		System.out.println("Xoa mon hoc thanh cong");
		System.out.println("-----------------------------------");
		
	}
	private static void HienThiDanhSachMonHoc() {
		System.out.println("-----Sap xep danh sach mon hoc theo ten------");
		Collections.sort(MList, new Comparator<TblsMonHoc>() {
			@Override
			public int compare(TblsMonHoc m1, TblsMonHoc m2) {
				return m1.getTenMonHoc().compareTo(m2.getTenMonHoc());
			}
		});
		for(TblsMonHoc m : MList) {
			m.HienThi();
		}
		System.out.println("----------------------------");
	}
	private static void CapNhatBangDiem() {
		System.out.println("----Cap nhat danh sach bang diem------");
		int chon;
		do {
			System.out.println("Moi ban chon mot chuc nang");
			System.out.println("\t 1. Them diem mon hoc cua mot sinh vien");
			System.out.println("\t 2. Sua diem mon hoc cua mot sinh vien");
			System.out.println("\t 3. Xoa diem mon hoc cua mot sinh vien");
			System.out.println("\t 0. Quay lai");
			System.out.println("Nhap lua chon cua ban: ");
			chon = in.nextInt();
			switch(chon) {
			case 1: ThemDiemMonHoc(); break;
			case 2: SuaDiemMonHoc(); break;
			case 3: XoaDiemMonHoc(); break;
			case 0: return;
			default: System.out.println("Ban nhap khong hop le");
			}
		}while(true);
		
	}
	 private static void ThemDiemMonHoc() {
		 bDiem = new TblDiem();
		 System.out.println("Nhap ma sinh vien can them diem: ");
		 int maSV = in.nextInt();
		 int sIndex = Helpers.KiemTraMaSVTrongDSSV(maSV);
		 if(sIndex ==-1) {
			 System.out.println("Sinh vien khong ton tai tren he thong");
			 return;
		 }
		 System.out.println("Nhap ma mon hoc can them diem: ");
		 int maMH = in.nextInt();
		 if(Helpers.KiemTraMaMHTrongDSMonHoc(maMH)==-1) {
			 System.out.println("Mon hoc khong ton tai tren he thong");
			 return;
		 }
		 if(Helpers.KiemTraSVvaMH(maSV, maMH)!=-1) {
			 System.out.println("Sinh vien da co diem cua mon hoc nay");
			 return;
		 }
		 System.out.println("Nhap diem: ");
		 float diemSo = in.nextFloat();
		 if(diemSo<0 || diemSo>10) {
			 System.out.println("Thong tin ban nhap khong hop le");
			 return;
		 }
		 bDiem.setMaSV(maSV);
		 bDiem.setMaMH(maMH);
		 bDiem.list.add(new MonHocCuaMotSinhVien(maMH,diemSo,maSV));
		 DList.add(bDiem);
		 System.out.println("Them diem thanh cong");
		 System.out.println("--------------------");
	}
	private static void SuaDiemMonHoc() {
		System.out.println("----Sua diem mon hoc cua sinh vien------");
		System.out.println("Nhap ma sinh vien muon sua diem: ");
		int maSV= in.nextInt();
		int sIndex = Helpers.KiemTraMaSVTrongDSDiem(maSV) ;
		if(Helpers.KiemTraMaSVTrongDSSV(maSV) == -1) {
			System.out.println("Sinh vien khong ton tai tren he thong");
			return;
		}
		if(sIndex == -1) {
			System.out.println("Sinh vien chua co diem hoac chua hoc mon hoc nao");
			return;
		}
		System.out.println("Nhap ma mon hoc can sua diem: ");
		int maMH = in.nextInt();
		if(Helpers.KiemTraMaMHTrongDSMonHoc(maMH)== -1) {
			System.out.println("Mon hoc khong ton tai tren he thong");
			return;
		}
		if(Helpers.KiemTraSVvaMH(maSV, maMH)==-1) {
			System.out.println("Sinh vien chua co diem mon can sua diem");
			return;
		}
		int dIndex = Helpers.KiemTraSVvaMH(maSV, maMH);
		System.out.println("Nhap diem moi: ");
		float diemSo = in.nextFloat();
		if(diemSo<0 || diemSo>10) {
			System.out.println("Thong tin khong hop le");
			return;
		}
		for(int i=0; i<bDiem.list.size();i++)
		{
			if(bDiem.list.get(i).getMaMH() == maMH) {
				bDiem.list.get(i).setDiemSo(diemSo);
			}
		}
		DList.get(sIndex).setList(bDiem.list);
		System.out.println("Sua diem thanh cong");
		System.out.println("----------------------");
		
	}
	private static void XoaDiemMonHoc() {
		System.out.println("----Xoa diem mon hoc--------");
		System.out.println("Nhap ma sinh vien can xoa diem: ");
		int maSV = in.nextInt();
		int sIndex = Helpers.KiemTraMaSVTrongDSDiem(maSV) ;
		if(Helpers.KiemTraMaSVTrongDSSV(maSV) == -1) {
			System.out.println("Sinh vien khong ton tai tren he thong");
			return;
		}
		if(sIndex == -1) {
			System.out.println("Sinh vien chua co diem hoac chua hoc mon hoc nao");
			return;
		}
		System.out.println("Nhap ma mon hoc can xoa diem: ");
		int maMH = in.nextInt();
		if(Helpers.KiemTraMaMHTrongDSMonHoc(maMH)== -1) {
			System.out.println("Mon hoc khong ton tai tren he thong");
			return;
		}
		if(Helpers.KiemTraSVvaMH(maSV, maMH)==-1) {
			System.out.println("Sinh vien chua co diem mon can xoa diem");
			return;
		}
		int dIndex = Helpers.KiemTraSVvaMH(maSV, maMH);
		for(int i=0; i<bDiem.list.size();i++)
		{
			if(bDiem.list.get(i).getMaMH() == maMH) {
				bDiem.list.remove(i);
			}
		}
		System.out.println("Xoa diem thanh cong");
		System.out.println("----------------------");
	}
	private static void HienThiBangDiem() {
		System.out.println("----Bang diem------");
		int i =1;
		System.out.printf("%8s","Ma SV");
		System.out.printf("%30s","Ho va ten");
		System.out.printf("%8s", "Ma MH");
		System.out.printf("%8s","Ten mon hoc");
		System.out.printf("%8s","Diem");
		System.out.println();
		for(TblDiem diem : DList) {
			System.out.printf("%8d", diem.getMaSV());
			for(int j=0; j<SList.size();j++) {
				if(SList.get(j).getMaSV()== diem.getMaSV()) {
					System.out.printf("%20s", SList.get(j).getHoDem());
					System.out.printf("%10s", SList.get(j).getTen());
				}
			}
			for(int j=0; j<bDiem.list.size();j++)
			{
				if(bDiem.list.get(j).getMaSV()== diem.getMaSV()) {
					System.out.printf("%6d", bDiem.list.get(j).getMaMH());
					for(int k =0; k<MList.size(); k++) {
						if(MList.get(k).getMaMH()== bDiem.list.get(j).getMaMH()) {
							System.out.printf("%8s",MList.get(k).getTenMonHoc());
						}
					}
					System.out.printf("%8f",bDiem.list.get(j).getDiemSo());
					System.out.println();
				}
				
			}
				System.out.println();
				i++;
			}
			System.out.println("----------------------------");
		}
	private static void TimKiem() {
		System.out.println("---Tim kiem-----");
		int chon;
		do {
		System.out.println("Chon 1 chuc nang:");
		System.out.println("\t 1. Tim kiem sinh vien");
		System.out.println("\t 2. Tim kiem mon hoc");
		System.out.println("\t 0. Thoat");
		System.out.println("Lua chon cua ban: ");
		chon = in.nextInt();
		switch(chon) {
		case 1: TimKiemSV(); break;
		case 2: TimKiemMH(); break;
		case 0: return;
		default: System.out.println("ban nhap khong hop le");
		}
		}while(true);
	}
	private static void TimKiemSV() {
		System.out.println("Tim kiem sinh vien");
		System.out.println("Nhap ma sinh vien can tim: ");
		int maSV = in.nextInt();
		int index = Helpers.KiemTraMaSVTrongDSSV(maSV);
		if(index==-1) {
			System.out.println("Sinh vien can sua khong ton tai.");
			return;
		}
		System.out.println("Thong tin sinh vien: ");
		System.out.printf("%8s","Ma SV");
		System.out.printf("%30s","Ho va ten");
		System.out.printf("%8s", "Ma MH");
		System.out.printf("%8s","Ten mon hoc");
		System.out.printf("%8s","Diem");
		System.out.println();
		System.out.printf("%8d", SList.get(index).getMaSV());
		System.out.printf("%20s", SList.get(index).getHoDem());
		System.out.printf("%10s", SList.get(index).getTen());
		for(int j=0; j<bDiem.list.size();j++)
		{
			if(bDiem.list.get(j).getMaSV()== SList.get(index).getMaSV()) {
				System.out.printf("%6d", bDiem.list.get(j).getMaMH());
				for(int k =0; k<MList.size(); k++) {
					if(MList.get(k).getMaMH()== bDiem.list.get(j).getMaMH()) {
						System.out.printf("%8s",MList.get(k).getTenMonHoc());
					}
				}
				System.out.printf("%8f",bDiem.list.get(j).getDiemSo());
				System.out.println();
			}
		}
	}
	private static void TimKiemMH() {
		System.out.println("----Tim kiem mon hoc----");
		System.out.println("Nhap ma mon hoc can tim kiem: ");
		int maMH = in.nextInt();
		int index = Helpers.KiemTraMaMHTrongDSMonHoc(maMH);
		if(index==-1) {
			System.out.println("Mon hoc can sua khong ton tai.");
			return;
		}
		System.out.println("Thong tin mon hoc: ");
		System.out.println("Danh sach sinh vien hoc mon "+ MList.get(index).getTenMonHoc()+" va diem: ");
		System.out.printf("%6s","Ma SV");
		System.out.printf("%30s","Ho va ten sinh vien");
		System.out.printf("%4s","Diem");
		int j = 1;
		for(TblDiem diem : DList) {
			if(diem.list.get(j).getMaMH()== maMH) {
				System.out.printf("%6s",diem.list.get(j).getMaSV());
				for(int i =0; i<SList.size();i++) {
					if(SList.get(i).getMaSV() == diem.list.get(j).getMaSV()) {
						System.out.printf("%20s",SList.get(i).getHoDem());
						System.out.printf("%10s",SList.get(i).getTen());
					}
				}
				System.out.printf("%2f",diem.list.get(j).getDiemSo());
				System.out.println();
				j++;
			}
		}
		
	}
	static Scanner in = new Scanner(System.in);
	}
