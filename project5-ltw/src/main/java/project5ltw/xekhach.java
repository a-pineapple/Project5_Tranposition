package project5ltw;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Data
@Entity

public class xekhach {
	@Id
	@Column(name ="xekhach_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long xekhach_id = 1;
	@NotNull
	private String bien_so;
	@NotNull
	private String mau;
	@NotNull
	private String hang_sx;
	@NotNull
	private String doi_xe;
	@NotNull
	private String model;
	@NotNull
	private String so_ghe;
	@NotNull
	private String so_nam_sd;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngay_bd;
	
	@OneToMany(mappedBy = "xe", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (chuyenxe) (1 xe co nhieu chuyen)
    // MapopedBy trỏ tới tên biến xe ở trong chuyenxe.
	@EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
	private List<chuyenxe> dschuyenxe;
	
	
	
	
}
