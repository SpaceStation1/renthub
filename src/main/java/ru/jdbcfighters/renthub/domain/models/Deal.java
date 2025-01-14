package ru.jdbcfighters.renthub.domain.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "deals")
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @OneToOne
    @JoinColumn(name = "estate_id")
    @JsonBackReference
    private Estate estate;

    // TODO: 8/19/2023 Статус и Тип попробовать сделать без сущностей

//    @OneToOne
//    @JoinColumn(name = "status_id")
//    @JsonBackReference
//    private DealStatus dealStatus;

//    @OneToOne
//    @JoinColumn(name = "type_id")
//    @JsonBackReference
//    private DealType dealType;

    @ManyToOne
    @JoinColumn(name = "buyer_user_id")
    @JsonBackReference
    private User buyer;

}
