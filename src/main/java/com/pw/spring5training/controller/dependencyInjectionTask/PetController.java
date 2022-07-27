package com.pw.spring5training.controller.dependencyInjectionTask;


import com.pw.spring5training.services.PetService;

/**
 * Created by jt on 12/28/19.
 */
public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
