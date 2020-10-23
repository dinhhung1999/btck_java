package vn.devpro.btck;

import javax.swing.text.MaskFormatter;

public class TblSinhVien {
	private int maSV;
	private String hoDem;
	private String ten;
	private int namSinh;
	private String gioiTinh;
	public TblSinhVien() {
		super();
	}
	public TblSinhVien(int maSV, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maSV = maSV;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoDem() {
		return hoDem;
	}
	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public void HienThi() {
		System.out.printf("%6d", maSV);
		System.out.printf("%20s", hoDem);
		System.out.printf("%10s", ten);
		System.out.printf("%8d",namSinh);
		System.out.printf("%8s",gioiTinh);
		System.out.println();
	}
}
