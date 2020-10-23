package vn.devpro.btck;

import java.util.ArrayList;
public class TblDiem {
	private int maSV;
	private int maMH;
	ArrayList<MonHocCuaMotSinhVien> list = new ArrayList<MonHocCuaMotSinhVien>();
	public TblDiem(int maSV, int maMH, ArrayList<MonHocCuaMotSinhVien> list) {
		super();
		this.maSV = maSV;
		this.maMH = maMH;
		this.list = list;
	}
	public TblDiem() {
		super();
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public ArrayList<MonHocCuaMotSinhVien> getList() {
		return list;
	}
	public void setList(ArrayList<MonHocCuaMotSinhVien> list) {
		this.list = list;
	}

}
