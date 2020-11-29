package project5ltw;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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


@Data
@Entity

public class chuyenxe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long chuyenxe_id = 1;
	@NotNull
	

	private int so_khach;
	@NotNull
	private float gia_ve;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ngay_di;
	@ManyToOne
	@JoinColumn(name ="xe_id") //thong qua khoa ngoai xe_id
	@EqualsAndHashCode.Exclude
    @ToString.Exclude
    private xekhach xe;
	
	@ManyToOne
	@JoinColumn(name ="laixe_id")
	@EqualsAndHashCode.Exclude
    @ToString.Exclude
    private taixe laixe;
	
	@ManyToOne
	@JoinColumn(name ="phuxe_id")
	@EqualsAndHashCode.Exclude
    @ToString.Exclude
    private taixe phuxe;
	
	@ManyToOne
	@JoinColumn(name ="tuyenxe_id")
	@EqualsAndHashCode.Exclude
    @ToString.Exclude
    private tuyenxe tuyen;
	
	
	
}
