package project5ltw;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Data
@Entity
public class tuyenxe {
	@Id
	@Column(name="tuyenxe_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tuyenxe_id = 1;
	@NotNull
	private String diem_dau;
	@NotNull
	private String diem_cuoi;
	@NotNull
	@Range(min = 1, max =3)
	private String do_phuc_tap;
	
	@OneToMany(mappedBy = "tuyen", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (chuyenxe) (1 xe co nhieu chuyen)
    // MapopedBy trỏ tới tên biến xe ở trong chuyenxe.
	@EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
	private List<chuyenxe> dschuyenxe;
}
