package com.hujian.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * Query All Girls List
     * @return List<Girl>
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * Insert A Girl
     * @param cupSize
     * @param age
     * @return Girl
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /**
     * Find A Girl
     * @param id
     * @return Girl
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne((id));
    }

    /**
     * Update A Girl
     * @param id
     * @param cupSize
     * @param age
     * @return Girl
     */
    @PostMapping(value = "girlsUpdate")
    public Girl girlUpdate(@RequestParam("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }


    /**
     * Delete A Girl
     * @param id
     */
    @PostMapping(value = "girlsDelete")
    public void girlDelete(@RequestParam("id") Integer id) {
        girlRepository.delete(id);
    }

}
