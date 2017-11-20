package br.com.camp;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -5855848903264891171L;
}