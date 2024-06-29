package com.example.duanmau.database;

public class DbHelper1 {
    // Them du lieu nguoi dung
    public static final String INSERT_THU_THU = "Insert into ThuThu(MaTT, HoTen,MatKhau) values ";
    // them du lieu thanh vien
    public static final String INSER_THANH_VIEN = "insert into thanhvien(hoTen, namsinh) values" ;
    // them du lieu loai sach
    public static final String INSERT_LOAI_SACH = "insert into LoaiSach(tenLoai) values" ;
    // them du lieu sach
    public static final String INSERT_SACH = "insert into Sach(tensach,giaThue,maLoai) values";

    // them du lieu phieu muon
    public static final String INSERT_PHIEU_MUON = "insert into PhieuMuon(MaTV,MaSach,TienThue,Ngay,Trasach) values";

}
