package vn.devpro.btck;
public class Helpers {
	public static int KiemTraMaSVTrongDSSV(int maSV) {
		for(int i =0; i< QuanLySinhVien.SList.size(); i++) {
			if(QuanLySinhVien.SList.get(i).getMaSV()==maSV)
				return i;
		}
		return -1;
	}
	public static int KiemTraMaSVTrongDSDiem(int maSV) {
		for(int i =0; i< QuanLySinhVien.DList.size(); i++) {
			if(QuanLySinhVien.DList.get(i).getMaSV()==maSV)
				return i;
		}
		return -1;
	}
	public static int KiemTraMaMHTrongDSMonHoc(int maMH) {
		for(int i =0; i< QuanLySinhVien.MList.size(); i++) {
			if(QuanLySinhVien.MList.get(i).getMaMH()==maMH)
				return i;
		}
		return -1;
	}
	public static int KiemTraMaMHTrongDSDiem(int maMH) {
		for(int i =0; i< QuanLySinhVien.DList.size(); i++) {
			if(QuanLySinhVien.DList.get(i).getMaMH()==maMH)
				return i;
		}
		return -1;
	}
	public static int KiemTraSVvaMH(int maSV, int maMH) {
		for(int i =0; i< QuanLySinhVien.DList.size(); i++) {
			if(QuanLySinhVien.DList.get(i).getMaSV() == maSV) {
				if(QuanLySinhVien.DList.get(i).getMaMH()==maMH) {
					return i;
				}
			}
		}
		return -1;
	}
}
