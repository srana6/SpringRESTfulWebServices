package com.lovetocode.springAPI.DAO;

import com.lovetocode.springAPI.model.InterpreterTapReviews;

import java.util.List;

/**
 * Created by macbook on 5/29/17.
 */
public interface InterpreterTapDataAccess {

    public List<InterpreterTapReviews> fecthAllReviews();
}
