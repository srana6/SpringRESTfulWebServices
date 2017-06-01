package com.lovetocode.springAPI.DAO;

import com.lovetocode.springAPI.model.InterpreterTapReviews;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by macbook on 5/29/17.
 */
@Repository("interpreterTapDataAccess")
public class InterpreterTapDataAccessImpl extends AbstractDAO<Integer, InterpreterTapReviews> implements InterpreterTapDataAccess {



    @SuppressWarnings("unchecked")
    public List<InterpreterTapReviews> fecthAllReviews() {
        Criteria criteria = createEntityCriteria();
        return (List<InterpreterTapReviews>) criteria.list();
    }
}
