package com.lovetocode.springAPI.service;

import com.lovetocode.springAPI.DAO.InterpreterTapDataAccess;
import com.lovetocode.springAPI.DAO.InterpreterTapDataAccessImpl;
import com.lovetocode.springAPI.model.InterpreterTapReviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbook on 5/29/17.
 */
@Service("interpreterTapService")
@Transactional
public class InterpreterTapServiceImpl implements InterpreterTapService {

    @Autowired
    private InterpreterTapDataAccess interpreterTapDataAccessImpl;

    @Override
    public List<InterpreterTapReviews> fetchAllReviews() {
        return interpreterTapDataAccessImpl.fecthAllReviews();
    }
}
