import java.util.ArrayList;
import java.util.List;

// Lớp cơ sở CanBo
class CanBo1 {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo1(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

     
}

// Lớp Công Nhân kế thừa từ CanBo
class CongNhan extends CanBo1 {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
 
}

// Lớp Kỹ Sư kế thừa từ CanBo
class KySu extends CanBo1 {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

     
}

// Lớp Nhân Viên kế thừa từ CanBo
class NhanVien extends CanBo1 {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
    
}

// Lớp quản lý cán bộ
class QLCB {
    private List<CanBo1> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    // Phương thức thêm mới cán bộ
    public void themMoiCanBo(CanBo1 canBo) {
        danhSachCanBo.add(canBo);
    }

    // Phương thức tìm kiếm theo họ tên
    public List<CanBo1> timKiemTheoHoTen(String hoTen) {
        List<CanBo1> ketQua = new ArrayList<>();
        for (CanBo1 canBo : danhSachCanBo) {
            if (canBo.getHoTen().equals(hoTen)) {
                ketQua.add(canBo);
            }
        }
        return ketQua;
    }

    // Phương thức hiển thị thông tin về danh sách các cán bộ
    public void hienThiDanhSach() {
        for (CanBo1 canBo : danhSachCanBo) {
            // In thông tin cán bộ theo yêu cầu
            System.out.println(canBo.getHoTen() + " - " + canBo.getClass().getSimpleName());
        }
    }

 
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();

        // Tạo và thêm mới các cán bộ
        CongNhan congNhan = new CongNhan("Nguyen Van Cong", 30, "Nam", "Hanoi", 5);
        KySu kySu = new KySu("Tran Thi Ky", 28, "Nữ", "HCM", "Công nghệ thông tin");
        NhanVien nhanVien = new NhanVien("Pham Van Nhan", 25, "Nam", "Da Nang", "Kế toán");

        qlcb.themMoiCanBo(congNhan);
        qlcb.themMoiCanBo(kySu);
        qlcb.themMoiCanBo(nhanVien);

        // Hiển thị danh sách cán bộ
        System.out.println("Danh sách các cán bộ:");
        qlcb.hienThiDanhSach();

        // Tìm kiếm cán bộ theo họ tên
        String hoTenCanTim = "Nguyen Van Cong";
        List<CanBo1> ketQuaTimKiem = qlcb.timKiemTheoHoTen(hoTenCanTim);

        if (!ketQuaTimKiem.isEmpty()) {
            System.out.println("\nCác cán bộ có tên '" + hoTenCanTim + "':");
            for (CanBo1 canBo : ketQuaTimKiem) {
                System.out.println(canBo.getHoTen() + " - " + canBo.getClass().getSimpleName());
            }
        } else {
            System.out.println("\nKhông tìm thấy cán bộ có tên '" + hoTenCanTim + "'.");
        }
    }
}

