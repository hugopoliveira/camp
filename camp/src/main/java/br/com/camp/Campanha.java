package br.com.camp;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Campanha extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 7846953391655896316L;

	private String nome;
	private Long time;
	private LocalDate inicio;
	private LocalDate fim;
}