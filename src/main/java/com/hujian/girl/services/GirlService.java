package com.hujian.girl.services;

import com.hujian.girl.domain.Girl;
import com.hujian.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(22);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBB");
        girlB.setAge(23);
        girlRepository.save(girlB);
    }
}
