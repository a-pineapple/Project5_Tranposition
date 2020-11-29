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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Data
@Entity
public class taixe {
	@Id
	@Column(name="taixe_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taixe_id = 1;
	@NotNull
	private String ten;
	@NotNull
	private String cmt;
	@NotNull
	private String ma_so_bang_lai;
	@NotNull
	private String loai_bang;
	@NotNull
	private String dia_chi;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngay_sinh;
	@NotNull
	private int tham_nien;
	@OneToMany(mappedBy = "laixe_id", cascade = CascadeType.ALL)
	private List<chuyenxe> dschuyenxelai;
	
	@OneToMany(mappedBy = "phuxe_id", cascade = CascadeType.ALL)
	private List<chuyenxe> dschuyenxephu;
	
	
}
