package com.lovetocode.springAPI.service;

import com.lovetocode.springAPI.model.InterpreterTapReviews;

import java.util.List;

/**
 * Created by macbook on 5/29/17.
 */
public interface InterpreterTapService {

    public List<InterpreterTapReviews> fetchAllReviews();
}
