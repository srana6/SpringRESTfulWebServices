package com.lovetocode.springAPI.controller;

import com.lovetocode.springAPI.model.InterpreterTapReviews;
import com.lovetocode.springAPI.service.InterpreterTapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by macbook on 5/29/17.
 */
@RestController
public class InterpreterTapRestController {

    @Autowired
    InterpreterTapService interpreterTapService;

    /*
    --------Retrive Reviews from the database
     */
    @RequestMapping(value={ "/reviews" }, method= RequestMethod.GET)
    public List<InterpreterTapReviews> getAllReviews(){
        List<InterpreterTapReviews> ls = interpreterTapService.fetchAllReviews();
      /*  if(ls.isEmpty()){
            return (List<InterpreterTapReviews>) new ResponseEntity<List<InterpreterTapReviews>>(HttpStatus.NO_CONTENT);
        }else{
            return (List<InterpreterTapReviews>) new ResponseEntity<List<InterpreterTapReviews>>(ls,HttpStatus.OK);
        }*/

      return ls;

    }
}
