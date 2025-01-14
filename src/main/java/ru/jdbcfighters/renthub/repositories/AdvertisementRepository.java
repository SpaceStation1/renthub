package ru.jdbcfighters.renthub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jdbcfighters.renthub.domain.models.Advertisement;
import ru.jdbcfighters.renthub.domain.models.Estate;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    boolean checkIfIdExist(Long id);

    Advertisement getAdvertisementByEstate(Estate estate);

}
